package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.external.redis.RedisKey
import cherhy.jung.gptinterview.external.redis.RedisKey.CERTIFICATE
import cherhy.jung.gptinterview.external.redis.RedisReadService
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
    @Autowired private val redisReadService: RedisReadService,
    @Autowired private val redisTemplate: RedisTemplate<String, Any>,
) : BehaviorSpec({
    val redisContainer = GenericContainer<Nothing>("redis:5.0.3-alpine")
    beforeSpec {
        redisContainer.portBindings.add("16379:6379")
        redisContainer.start()
        listener(redisContainer.perSpec())
    }
    afterSpec {
        redisContainer.stop()
    }

    Given("회원이 클라이언트에 저장되어있는 refresh token 으로 요청을 보내면 ") {
        val email = "ekxk1234@naver.com"
        val refreshToken = "refreshToken"
        redisTemplate.opsForValue().set(RedisKey.REFRESH_TOKEN + refreshToken, email)

        When("refresh 토큰을 조회한 뒤 ") {
            val findEmail = redisReadService.getEmailByRefreshToken(refreshToken)

            Then("검증한다.") {
                findEmail shouldNotBe null
                findEmail shouldBe email
            }
        }
    }

    Given("회원이 조회했었던 문제들을 ") {
        val customerId: Long = 1
        val questionTokens = listOf(
            "questionToken1",
            "questionToken2",
            "questionToken3",
            "questionToken4",
        );

        questionTokens.forEach {
            redisTemplate.opsForList().rightPush(RedisKey.QUESTION_TOKEN + customerId, it)
        }

        When("회원의 아이디만으로 ") {
            val findQuestionTokens = redisReadService.getQuestionTokens(customerId)

            Then("전부 출력한다.") {
                findQuestionTokens.size shouldBe 4
                findQuestionTokens shouldContainAll questionTokens
            }
        }

        When("회원의 아이디와 범위로 ") {
            val findQuestionTokens = redisReadService.getQuestionTokens(customerId, 0, 2)

            Then("출력한다.") {
                findQuestionTokens.size shouldBe 3
                findQuestionTokens shouldContain "questionToken1"
                findQuestionTokens shouldContain "questionToken2"
                findQuestionTokens shouldContain "questionToken3"
            }
        }
    }

    Given("이메일과 인증번호를 저장하고 ") {
        val email = "ekxk1234@naver.com"
        val certificateNumber = "123456"
        redisTemplate.opsForValue().set(CERTIFICATE + email, certificateNumber)

        When("인증번호와 이메일을 정상 입력하면 ") {
            Then("성공한다.") {
                redisReadService.checkCertificate(email, certificateNumber)
            }
        }

        When("인증번호가 잘못 입력되면 ") {
            val notFoundNumber = "000000"

            Then("exception 이 발생한다.") {
                shouldThrow<NotFoundException> {
                    redisReadService.checkCertificate(email, notFoundNumber)
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