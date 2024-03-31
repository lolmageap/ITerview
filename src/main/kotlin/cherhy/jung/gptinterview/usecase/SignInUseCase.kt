package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.vo.CustomerRequestVo
import cherhy.jung.gptinterview.extension.convertUserDetails
import cherhy.jung.gptinterview.external.cache.CacheWriteService
import cherhy.jung.gptinterview.external.jwt.TokenProvider
import cherhy.jung.gptinterview.external.jwt.TokenResponse
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder

@UseCase
class SignInUseCase(
    private val customerReadService: CustomerReadService,
    private val tokenProvider: TokenProvider,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val cacheWriteService: CacheWriteService,
) {
    fun execute(request: CustomerRequestVo): TokenResponse {
        val customer = customerReadService.getCustomerByEmail(request.username)

        val authenticationToken =
            UsernamePasswordAuthenticationToken(request.username, request.password + customer.salt)

        val authCustomer = authenticationManagerBuilder.convertUserDetails(authenticationToken)

        val accessToken = tokenProvider.createAccessToken(authCustomer)
        val refreshToken = tokenProvider.createRefreshToken(authCustomer)

        cacheWriteService.addJwtToken(refreshToken.token, request.username)

        return TokenResponse(
            accessToken = accessToken.token,
            accessTokenExpireTime = accessToken.tokenExpireTime,
            refreshToken = refreshToken.token,
            refreshTokenExpireTime = refreshToken.tokenExpireTime,
            roles = authCustomer.roles,
            customerToken = authCustomer.token,
        )
    }
}