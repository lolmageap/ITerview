package cherhy.jung.gptinterview.dependency

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.dependency.RedisKey.ACCESS_TOKEN
import cherhy.jung.gptinterview.dependency.RedisKey.QUESTION_TOKEN
import org.springframework.data.redis.core.RedisTemplate

@ReadService
class RedisReadService(
    private val redisTemplate: RedisTemplate<String, Any>,
) {
    fun getJwtToken(accessToken: String): String? {
        return redisTemplate.opsForValue().get(ACCESS_TOKEN + accessToken) as? String
    }

    fun getQuestionTokens(customerId: Long): MutableList<String> =
        redisTemplate.opsForList()
            .range(QUESTION_TOKEN + customerId, 0, -1)
            ?.map { it.toString() }?.toMutableList()
            ?: mutableListOf()

}