package cherhy.jung.gptinterview.external.redis

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.controller.dto.QuestionRequest
import cherhy.jung.gptinterview.property.JwtProperty
import cherhy.jung.gptinterview.external.redis.RedisKey.CERTIFICATE
import cherhy.jung.gptinterview.external.redis.RedisKey.QUESTION_TOKEN
import cherhy.jung.gptinterview.external.redis.RedisKey.REFRESH_TOKEN
import org.springframework.data.redis.core.RedisTemplate
import java.util.concurrent.TimeUnit

@WriteService
class RedisWriteService(
    private val redisTemplate: RedisTemplate<String, Any>,
    private val jwtProperty: JwtProperty,
) {
    fun addJwtToken(refreshToken: String, email: String) {
        redisTemplate.opsForValue().set(REFRESH_TOKEN + refreshToken, email)
        redisTemplate.expire(
            REFRESH_TOKEN + refreshToken,
            jwtProperty.refreshTokenValidityInSeconds.toLong(),
            TimeUnit.SECONDS,
        )
    }

    fun addQuestionToken(customerId: Long, questionToken: String) =
        redisTemplate.opsForList().rightPush(QUESTION_TOKEN + customerId, questionToken)

    fun addCertificate(email: String, certificate: String) {
        redisTemplate.opsForValue().set(CERTIFICATE + email, certificate)
        redisTemplate.expire(
            CERTIFICATE + email,
            180,
            TimeUnit.SECONDS,
        )
    }
    // TODO: 다시 작성
    fun addQuestionAttributes(
        customerId: Long,
        request: QuestionRequest,
    ) {
        val opsForHash = redisTemplate.opsForHash<String, String>()
        val questionTypes = request.questionTypes
        val programingTypes = request.programingTypes
        val frameworkTypes = request.frameworkTypes
        val levels = request.levels
    }
}