package cherhy.jung.gptinterview.redis

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.exception.DomainName.CERTIFICATE_NUMBER
import cherhy.jung.gptinterview.exception.DomainName.EMAIL
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.redis.RedisKey.ACCESS_TOKEN
import cherhy.jung.gptinterview.redis.RedisKey.CERTIFICATE
import cherhy.jung.gptinterview.redis.RedisKey.QUESTION_TOKEN
import org.springframework.cache.annotation.Cacheable
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.security.access.AccessDeniedException

// *require @Cacheable 같은것도 써보면 좋을거 같네요. 한번 적용이 가능한지 보시겠어요?
@ReadService
class RedisReadService(
    private val redisTemplate: RedisTemplate<String, Any>,
) {
    @Cacheable
    fun getJwtToken(accessToken: String): String =
        redisTemplate.opsForValue()
            .get(ACCESS_TOKEN + accessToken)
            ?.toString()
            ?: throw AccessDeniedException("잘못된 토큰")

    @Cacheable
    fun getQuestionTokens(customerId: Long, start: Long = 0, end: Long = -1): MutableList<String> =
        redisTemplate.opsForList()
            .range(QUESTION_TOKEN + customerId, start, end)
            ?.map { it.toString() }?.toMutableList()
            ?: mutableListOf()

    @Cacheable
    fun checkCertificate(email: String, certificateNumber: String) {
        val certificate = redisTemplate.opsForValue().getAndDelete(CERTIFICATE + email)
            ?.toString()
            ?: throw NotFoundException(EMAIL)

        if (certificateNumber != certificate) throw NotFoundException(CERTIFICATE_NUMBER)
    }

}