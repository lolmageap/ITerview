package cherhy.jung.gptinterview.dependency

import cherhy.jung.gptinterview.annotation.WriteService
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import java.util.concurrent.TimeUnit

@WriteService
class RedisWriteService(
    private val redisTemplate: RedisTemplate<String, Any>,

    @Value("\${jwt.refresh-token-validity-in-seconds}")
    private val refreshTokenValidityInMilliseconds: String,
) {

    fun addJwtToken(accessToken: String, refreshToken: String): Unit {
        redisTemplate.opsForValue().set(accessToken, refreshToken)
        redisTemplate.expire("accessToken: $accessToken", refreshTokenValidityInMilliseconds.toLong(), TimeUnit.MILLISECONDS)
    }

    fun deleteJwtToken(accessToken: String) =
        redisTemplate.delete("accessToken: $accessToken")


    fun addQuestionToken(customerId: Long, questionToken: String) =
        redisTemplate.opsForList().rightPush("questionToken: $customerId", questionToken)

}