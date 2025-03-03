package cherhy.jung.gptinterview.external.cache

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.controller.dto.QuestionRequest
import cherhy.jung.gptinterview.external.cache.CacheKey.CERTIFICATE
import cherhy.jung.gptinterview.external.cache.CacheKey.CUSTOMER_HISTORY
import cherhy.jung.gptinterview.external.cache.CacheKey.FRAMEWORK_TYPE
import cherhy.jung.gptinterview.external.cache.CacheKey.PROGRAMING_TYPE
import cherhy.jung.gptinterview.external.cache.CacheKey.QUESTION_LEVEL
import cherhy.jung.gptinterview.external.cache.CacheKey.QUESTION_TOKEN
import cherhy.jung.gptinterview.external.cache.CacheKey.QUESTION_TYPE
import cherhy.jung.gptinterview.external.cache.CacheKey.REFRESH_TOKEN
import cherhy.jung.gptinterview.listener.ChangeValueCollector
import cherhy.jung.gptinterview.property.JwtProperty
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.redis.core.RedisTemplate
import java.util.concurrent.TimeUnit

@WriteService
class CacheWriteService(
    private val redisTemplate: RedisTemplate<String, Any>,
    private val jwtProperty: JwtProperty,
    private val objectMapper: ObjectMapper,
) {
    fun addJwtToken(
        refreshToken: String,
        email: String,
    ) =
        redisTemplate.opsForValue().set(REFRESH_TOKEN + refreshToken, email, jwtProperty.refreshTokenValidityInSeconds.toLong(), TimeUnit.SECONDS)

    fun addQuestionToken(
        customerId: Long,
        questionToken: String,
    ) =
        redisTemplate.opsForList().rightPush(QUESTION_TOKEN + customerId, questionToken)

    fun addCertificate(
        email: String,
        certificate: String,
    ) =
        redisTemplate.opsForValue().set(CERTIFICATE + email, certificate, 180, TimeUnit.SECONDS)

    fun addQuestionAttributes(
        customerId: Long,
        request: QuestionRequest,
    ) {
        val questionTypes = request.questionTypes.joinToString(", ") { it.name }
        val programingTypes = request.programingTypes.joinToString(", ") { it.name }
        val frameworkTypes = request.frameworkTypes.joinToString(", ") { it.name }
        val levels = request.levels.joinToString(", ") { it.name }

        redisTemplate.opsForHash<String, String>().apply {
            put(QUESTION_TOKEN + customerId, QUESTION_TYPE, questionTypes)
            put(QUESTION_TOKEN + customerId, PROGRAMING_TYPE, programingTypes)
            put(QUESTION_TOKEN + customerId, FRAMEWORK_TYPE, frameworkTypes)
            put(QUESTION_TOKEN + customerId, QUESTION_LEVEL, levels)
        }
    }

    fun setBeforeValue(
        key: String,
        data: Map<String, ChangeValueCollector>,
    ) {
        val hash = redisTemplate.opsForHash<String, String>()

        data.forEach { (field, value) ->
            hash.put(CUSTOMER_HISTORY + key, field, objectMapper.writeValueAsString(value))
        }

        redisTemplate.expire(key, 1, TimeUnit.SECONDS)
    }
}