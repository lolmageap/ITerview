package cherhy.jung.gptinterview.redis

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

    Given("회원이 클라이언트에 저장되어있는 access token 으로 요청을 보내면 ") {
        val accessToken = "accessToken"
        val refreshToken = "refreshToken"
        redisTemplate.opsForValue().set(RedisKey.ACCESS_TOKEN + accessToken, refreshToken)

        When("refresh 토큰을 조회한 뒤 ") {
            val findRefreshToken = redisReadService.getJwtToken(accessToken)

            Then("검증한다.") {
                findRefreshToken shouldNotBe null
                findRefreshToken shouldBe refreshToken
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

}) {
    override suspend fun afterContainer(testCase: TestCase, result: TestResult) {
        if (testCase.isRootTest()) {
            redisTemplate.execute { connection ->
                connection.flushDb()
            }
        }
    }
}