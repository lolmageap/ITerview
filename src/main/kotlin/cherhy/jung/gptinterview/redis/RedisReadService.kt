package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.exception.DomainName.CERTIFICATE_NUMBER
import cherhy.jung.gptinterview.exception.DomainName.EMAIL
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.redis.RedisKey.ACCESS_TOKEN
import cherhy.jung.gptinterview.redis.RedisKey.CERTIFICATE
import cherhy.jung.gptinterview.redis.RedisKey.QUESTION_TOKEN
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.security.access.AccessDeniedException

@ReadService
class RedisReadService(
    private val redisTemplate: RedisTemplate<String, Any>,
) {
    fun getJwtToken(accessToken: String): String =
        redisTemplate.opsForValue()
            .get(ACCESS_TOKEN + accessToken)
            ?.toString()
            ?: throw AccessDeniedException("잘못된 토큰")


    fun getQuestionTokens(customerId: Long, start: Long = 0, end: Long = -1): MutableList<String> =
        redisTemplate.opsForList()
            .range(QUESTION_TOKEN + customerId, start, end)
            ?.map { it.toString() }?.toMutableList()
            ?: mutableListOf()

    fun checkCertificate(email: String, certificateNumber: String) {
        val certificate = redisTemplate.opsForValue().getAndDelete(CERTIFICATE + email)
            ?.toString()
            ?: throw NotFoundException(EMAIL)

        if (certificateNumber != certificate) throw NotFoundException(CERTIFICATE_NUMBER)
    }

}