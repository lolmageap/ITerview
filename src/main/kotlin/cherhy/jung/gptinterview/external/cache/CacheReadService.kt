package cherhy.jung.gptinterview.external.cache

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.listener.ChangeValueCollector
import cherhy.jung.gptinterview.controller.dto.QuestionAttributeResponse
import cherhy.jung.gptinterview.controller.dto.of
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.exception.MessageType.CERTIFICATE_NUMBER
import cherhy.jung.gptinterview.exception.MessageType.EMAIL
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.external.cache.CacheKey.CERTIFICATE
import cherhy.jung.gptinterview.external.cache.CacheKey.CUSTOMER_HISTORY
import cherhy.jung.gptinterview.external.cache.CacheKey.FRAMEWORK_TYPE
import cherhy.jung.gptinterview.external.cache.CacheKey.PROGRAMING_TYPE
import cherhy.jung.gptinterview.external.cache.CacheKey.QUESTION_LEVEL
import cherhy.jung.gptinterview.external.cache.CacheKey.QUESTION_TOKEN
import cherhy.jung.gptinterview.external.cache.CacheKey.QUESTION_TYPE
import cherhy.jung.gptinterview.external.cache.CacheKey.REFRESH_TOKEN
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.security.access.AccessDeniedException

@ReadService
class CacheReadService(
    private val redisTemplate: RedisTemplate<String, Any>,
) {
    fun getEmailByRefreshToken(
        refreshToken: String?,
    ): String {
        if (refreshToken.isNullOrBlank()) {
            throw AccessDeniedException("잘못된 토큰")
        }

        return redisTemplate.opsForValue()
            .get(REFRESH_TOKEN + refreshToken)
            ?.toString()
            ?: throw AccessDeniedException("잘못된 토큰")
    }

    fun getQuestionTokens(
        customerId: Long,
        start: Long = 0,
        end: Long = -1,
   ) =
        redisTemplate.opsForList()
            .range(QUESTION_TOKEN + customerId, start, end)
            ?.map { it.toString() }?.toList()
            ?: emptyList()

    fun checkCertificate(
        email: String,
        certificateNumber: String,
    ) {
        val certificate = redisTemplate.opsForValue().get(CERTIFICATE + email)
            ?.toString()
            ?: throw NotFoundException(EMAIL)

        if (certificateNumber != certificate) throw NotFoundException(CERTIFICATE_NUMBER)
        redisTemplate.delete(CERTIFICATE + email)
    }

    fun getQuestionAttributes(
        customerId: Long,
    ): QuestionAttributeResponse {
        val hash = redisTemplate.opsForHash<String, String>()
            .entries(QUESTION_TOKEN + customerId)
            .mapValues {
                it.value.split(", ")
            }
            .toMap()

        val questionTypes =
            hash[QUESTION_TYPE]?.map(QuestionType::valueOf)
                ?: emptyList()

        val programingTypes =
            hash[PROGRAMING_TYPE]?.map(ProgramingType::valueOf)
                ?: emptyList()

        val frameworkTypes =
            hash[FRAMEWORK_TYPE]?.map(FrameworkType::valueOf)
                ?: emptyList()

        val levels =
            hash[QUESTION_LEVEL]?.map(QuestionLevel::valueOf)
                ?: emptyList()

        return QuestionAttributeResponse.of(
            questionTypes = questionTypes,
            programingTypes = programingTypes,
            frameworkTypes = frameworkTypes,
            levels = levels,
        )
    }

    fun getBeforeValue(
        key: String,
    ): Map<String, ChangeValueCollector> {
        val mapper = jacksonObjectMapper()
        mapper.registerModule(JavaTimeModule())
        val hash = redisTemplate.opsForHash<String, String>()
        val entries = hash.entries(CUSTOMER_HISTORY + key)

        return entries.mapValues { entry ->
            mapper.readValue(entry.value, ChangeValueCollector::class.java)
        }
    }
}