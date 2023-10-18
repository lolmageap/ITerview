package cherhy.jung.gptinterview.component

import cherhy.jung.gptinterview.annotation.WriteService
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import java.util.concurrent.TimeUnit

@WriteService
class RedisWriteService(
    private val redisTemplate: RedisTemplate<String, Any>,

    @Value("\${jwt.token-validity-in-seconds}")
    private val tokenValidityInMilliseconds: Long,

    @Value("\${jwt.refresh-token-validity-in-seconds")
    private val refreshTokenValidityInMilliseconds: Long,
) {

    fun addJwtToken(userId: Long, token: String) {
        val key = "user:$userId:token"
        redisTemplate.opsForValue().set(key, token)
        redisTemplate.expire(key, tokenValidityInMilliseconds, TimeUnit.MILLISECONDS)
    }

    fun deleteJwtToken(userId: Long) {
        val key = "user:$userId:token"
        redisTemplate.delete(key)
    }

}