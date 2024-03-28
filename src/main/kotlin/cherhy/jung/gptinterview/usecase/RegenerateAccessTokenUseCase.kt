package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.authority.AuthCustomerReadService
import cherhy.jung.gptinterview.external.jwt.TokenProvider
import cherhy.jung.gptinterview.external.jwt.TokenResponseVo
import cherhy.jung.gptinterview.external.redis.RedisReadService
import org.springframework.transaction.annotation.Transactional

@UseCase
class RegenerateAccessTokenUseCase(
    private val authCustomerReadService: AuthCustomerReadService,
    private val redisReadService: RedisReadService,
    private val tokenProvider: TokenProvider,
) {
    @Transactional(readOnly = true)
    fun execute(refreshToken: String): TokenResponseVo {
        val isValid = tokenProvider.validateToken(refreshToken)
        require(isValid) { "Refresh Token 이 만료 되었습니다." }

        val email = redisReadService.getEmailByRefreshToken(refreshToken)
        val userDetails = authCustomerReadService.loadUserByUsername(email)
        val customer = userDetails as AuthCustomer
        return tokenProvider.createAccessToken(customer)
    }
}