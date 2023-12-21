package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.authority.AuthCustomerReadService
import cherhy.jung.gptinterview.jwt.TokenProvider
import cherhy.jung.gptinterview.jwt.TokenResponseS
import cherhy.jung.gptinterview.redis.RedisReadService
import cherhy.jung.gptinterview.util.refreshToken
import jakarta.servlet.http.HttpServletRequest
import org.springframework.transaction.annotation.Transactional

@UseCase
class RegenerateAccessTokenUseCase(
    private val authCustomerReadService: AuthCustomerReadService,
    private val redisReadService: RedisReadService,
    private val tokenProvider: TokenProvider,
) {

    @Transactional(readOnly = true)
    fun regenerateAccessToken(httpServletRequest: HttpServletRequest): TokenResponseS {
        val email = redisReadService.getEmailByRefreshToken(httpServletRequest.refreshToken)
        val userDetails = authCustomerReadService.loadUserByUsername(email)
        val customer = userDetails as AuthCustomer
        return tokenProvider.createAccessToken(customer)
    }

}