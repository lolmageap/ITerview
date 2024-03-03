package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.authority.AuthCustomerReadService
import cherhy.jung.gptinterview.external.jwt.TokenProvider
import cherhy.jung.gptinterview.external.redis.RedisReadService
import cherhy.jung.gptinterview.extension.refreshToken
import cherhy.jung.gptinterview.external.jwt.TokenResponseVo
import jakarta.servlet.http.HttpServletRequest
import org.springframework.transaction.annotation.Transactional

@UseCase
class RegenerateAccessTokenUseCase(
    private val authCustomerReadService: AuthCustomerReadService,
    private val redisReadService: RedisReadService,
    private val tokenProvider: TokenProvider,
) {
    @Transactional(readOnly = true)
    fun regenerateAccessToken(httpServletRequest: HttpServletRequest): TokenResponseVo {
        val email = redisReadService.getEmailByRefreshToken(httpServletRequest.refreshToken)
        val userDetails = authCustomerReadService.loadUserByUsername(email)
        val customer = userDetails as AuthCustomer
        return tokenProvider.createAccessToken(customer)
    }
}