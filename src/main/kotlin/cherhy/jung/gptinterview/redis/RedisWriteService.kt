package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.redis.RedisKey.ACCESS_TOKEN
import cherhy.jung.gptinterview.redis.RedisKey.QUESTION_TOKEN
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import java.util.concurrent.TimeUnit

@WriteService
class RedisWriteService(
    private val redisTemplate: RedisTemplate<String, Any>,

    @Value("\${jwt.refresh-token-validity-in-seconds}")
    private val refreshTokenValidityInMilliseconds: String,
) {

    fun addJwtToken(accessToken: String, refreshToken: String) {
        redisTemplate.opsForValue().set(ACCESS_TOKEN + accessToken, refreshToken)
        redisTemplate.expire(
            ACCESS_TOKEN + accessToken,
            refreshTokenValidityInMilliseconds.toLong(),
            TimeUnit.MILLISECONDS
        )
    }

    fun deleteJwtToken(accessToken: String) =
        redisTemplate.delete(ACCESS_TOKEN + accessToken)


    fun addQuestionToken(customerId: Long, questionToken: String) =
        redisTemplate.opsForList().rightPush(QUESTION_TOKEN + customerId, questionToken)

}