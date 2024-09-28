@file:Suppress("DEPRECATION")

package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.external.cache.CacheKey
import cherhy.jung.gptinterview.external.cache.CacheKey.CERTIFICATE
import cherhy.jung.gptinterview.external.cache.CacheReadService
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import io.kotest.core.test.isRootTest
import io.kotest.extensions.testcontainers.perSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.redis.core.RedisTemplate
import org.testcontainers.containers.GenericContainer

@SpringBootTest
class RedisReadServiceTest(
    @Autowired private val cacheReadService: CacheReadService,
    @Autowired private val redisTemplate: RedisTemplate<String, Any>,
) : BehaviorSpec({
    val redisContainer = GenericContainer<Nothing>("redis:5.0.3-alpine")
    beforeSpec {
        redisContainer.portBindings.add("16379:6379")
        redisContainer.start()
        listener(redisContainer.perSpec())
    }

    Given("회원이 client 에 저장 되있는 refresh token 으로 요청을 보내면 ") {
        val email = "ekxk1234@naver.com"
        val refreshToken = "refreshToken"
        redisTemplate.opsForValue().set(CacheKey.REFRESH_TOKEN + refreshToken, email)

        When("refresh 토큰을 조회한 뒤 ") {
            val findEmail = cacheReadService.getEmailByRefreshToken(refreshToken)

            Then("검증 한다.") {
                findEmail shouldNotBe null
                findEmail shouldBe email
            }
        }
    }

    Given("회원이 조회 했었던 문제들 을 ") {
        val customerId: Long = 1
        val questionTokens = listOf(
            "questionToken1",
            "questionToken2",
            "questionToken3",
            "questionToken4",
        );

        questionTokens.forEach {
            redisTemplate.opsForList().rightPush(CacheKey.QUESTION_TOKEN + customerId, it)
        }

        When("회원의 아이디 만으로 ") {
            val findQuestionTokens = cacheReadService.getQuestionTokens(customerId)

            Then("전부 출력 한다.") {
                findQuestionTokens.size shouldBe 4
                findQuestionTokens shouldContainAll questionTokens
            }
        }

        When("회원의 아이디 와 범위로 ") {
            val findQuestionTokens = cacheReadService.getQuestionTokens(customerId, 0, 2)

            Then("출력 한다.") {
                findQuestionTokens.size shouldBe 3
                findQuestionTokens shouldContain "questionToken1"
                findQuestionTokens shouldContain "questionToken2"
                findQuestionTokens shouldContain "questionToken3"
            }
        }
    }

    Given("이메일 과 인증 번호를 저장 하고 ") {
        val email = "ekxk1234@naver.com"
        val certificateNumber = "123456"
        redisTemplate.opsForValue().set(CERTIFICATE + email, certificateNumber)

        When("인증 번호와 이메일 을 정상 입력 하면 ") {
            Then("성공 한다.") {
                cacheReadService.checkCertificate(email, certificateNumber)
            }
        }

        When("인증번호 가 잘못 입력 되면 ") {
            val notFoundNumber = "000000"

            Then("exception 이 발생 한다.") {
                shouldThrow<NotFoundException> {
                    cacheReadService.checkCertificate(email, notFoundNumber)
                }
            }
        }
    }

}) {
    override suspend fun afterContainer(testCase: TestCase, result: TestResult) {
        if (testCase.isRootTest()) {
            redisTemplate.execute { connection ->
                connection.flushDb()
            }
        }
    }
}