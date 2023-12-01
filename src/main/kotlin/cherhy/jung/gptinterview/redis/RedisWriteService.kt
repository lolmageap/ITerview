package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.redis.RedisKey.ACCESS_TOKEN
import cherhy.jung.gptinterview.redis.RedisKey.CERTIFICATE
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
            TimeUnit.SECONDS
        )
    }

    fun addQuestionToken(customerId: Long, questionToken: String) =
        redisTemplate.opsForList().rightPush(QUESTION_TOKEN + customerId, questionToken)

    fun addCertificate(email: String, certificate: String) {
        redisTemplate.opsForValue().set(CERTIFICATE + certificate, email)
        redisTemplate.expire(
            CERTIFICATE + certificate,
            180,
            TimeUnit.SECONDS
        )
    }

}