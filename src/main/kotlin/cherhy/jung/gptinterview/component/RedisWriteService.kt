package cherhy.jung.gptinterview.component

import cherhy.jung.gptinterview.annotation.WriteService
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.RedisTemplate
import java.util.concurrent.TimeUnit

@WriteService
class RedisWriteService(
    private val redisTemplate: RedisTemplate<String, Any>,

    @Value("\${jwt.refresh-token-validity-in-seconds")
    private val refreshTokenValidityInMilliseconds: Long,
) {

    fun addJwtToken(accessToken: String, refreshToken: String) {
        redisTemplate.opsForValue().set(accessToken, refreshToken)
        redisTemplate.expire("accessToken: $accessToken", refreshTokenValidityInMilliseconds, TimeUnit.MILLISECONDS)
    }

    fun deleteJwtToken(accessToken: String) {
        redisTemplate.delete("accessToken: $accessToken")
    }

}