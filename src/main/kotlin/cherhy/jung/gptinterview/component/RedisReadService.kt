package cherhy.jung.gptinterview.component

import cherhy.jung.gptinterview.annotation.ReadService
import org.springframework.data.redis.core.RedisTemplate

@ReadService
class RedisReadService(
    private val redisTemplate: RedisTemplate<String, Any>,
) {
    fun getJwtToken(accessToken: String): String? {
        return redisTemplate.opsForValue().get("accessToken: $accessToken") as? String
    }
}