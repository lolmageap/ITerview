package cherhy.jung.gptinterview.component

import cherhy.jung.gptinterview.annotation.ReadService
import org.springframework.data.redis.core.RedisTemplate

@ReadService
class RedisReadService(
    private val redisTemplate: RedisTemplate<String, Any>,
) {
    fun getJwtToken(userId: Long): String? {
        val key = "user:$userId:token"
        return redisTemplate.opsForValue().get(key) as? String
    }
}