package cherhy.jung.gptinterview.dependency

import cherhy.jung.gptinterview.annotation.ReadService
import org.springframework.data.redis.core.RedisTemplate

@ReadService
class RedisReadService(
    private val redisTemplate: RedisTemplate<String, Any>,
) {
    fun getJwtToken(accessToken: String): String? {
        return redisTemplate.opsForValue().get("accessToken: $accessToken") as? String
    }

    fun getQuestionTokens(customerId: Long): MutableList<String> =
        redisTemplate.opsForList()
            .range("questionToken:$customerId", 0, -1)
            ?.map { it.toString() }?.toMutableList()
            ?: mutableListOf()

}