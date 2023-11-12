package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.redis.RedisKey.ACCESS_TOKEN
import cherhy.jung.gptinterview.redis.RedisKey.QUESTION_TOKEN
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.extensions.testcontainers.perSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.redis.core.RedisTemplate
import org.testcontainers.containers.GenericContainer

@SpringBootTest
class RedisWriteServiceTest(
    @Autowired private val redisWriteService: RedisWriteService,
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

    afterEach {
        redisTemplate.execute { connection ->
            connection.flushDb()
        }
    }

    Given("회원이 로그인을 성공하고 JWT 토큰을 발급받으면 ") {
        val accessToken = "accessToken"
        val refreshToken = "refreshToken"

        When("access token 과 refresh token 을 등록한 뒤 ") {
            redisWriteService.addJwtToken(accessToken, refreshToken)

            Then("확인한다.") {
                val findRefreshToken = redisTemplate.opsForValue().get(ACCESS_TOKEN + accessToken) as String
                findRefreshToken shouldNotBe null
                findRefreshToken shouldBe refreshToken
            }
        }
    }

    Given("회원이 질문을 조회하면 ") {
        val customerId: Long = 1
        val questionToken = "questionToken"

        When("회원의 아이디로 질문 토큰을 등록하고 ") {
            redisWriteService.addQuestionToken(customerId, questionToken)

            Then("확인한다.") {
                val questionTokens =
                    redisTemplate.opsForList().range(QUESTION_TOKEN + customerId, 0, -1)!!

                questionTokens.size shouldBe 1
                questionTokens[0] shouldBe questionToken
            }
        }
    }

})
