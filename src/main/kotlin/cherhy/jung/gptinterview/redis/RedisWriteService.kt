package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.redis.RedisKey.CERTIFICATE
import cherhy.jung.gptinterview.redis.RedisKey.QUESTION_TOKEN
import cherhy.jung.gptinterview.redis.RedisKey.REFRESH_TOKEN
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import java.util.concurrent.TimeUnit

@WriteService
class RedisWriteService(
    private val redisTemplate: RedisTemplate<String, Any>,

    @Value("\${jwt.refresh-token-validity-in-seconds}")
    private val refreshTokenValidityInMilliseconds: String,
) {

    fun addJwtToken(refreshToken: String, email: String) {
        redisTemplate.opsForValue().set(REFRESH_TOKEN + refreshToken, email)
        redisTemplate.expire(
            REFRESH_TOKEN + refreshToken,
            refreshTokenValidityInMilliseconds.toLong(),
            TimeUnit.SECONDS
        )
    }

    fun addQuestionToken(customerId: Long, questionToken: String) =
        redisTemplate.opsForList().rightPush(QUESTION_TOKEN + customerId, questionToken)

    fun addCertificate(email: String, certificate: String) {
        redisTemplate.opsForValue().set(CERTIFICATE + email, certificate)
        redisTemplate.expire(
            CERTIFICATE + email,
            180,
            TimeUnit.SECONDS
        )
    }

}