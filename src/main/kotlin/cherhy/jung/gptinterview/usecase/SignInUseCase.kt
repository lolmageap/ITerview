package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.dto.CustomerRequestVo
import cherhy.jung.gptinterview.extension.getUserDetails
import cherhy.jung.gptinterview.external.jwt.TokenProvider
import cherhy.jung.gptinterview.external.jwt.TokenResponse
import cherhy.jung.gptinterview.external.redis.RedisWriteService
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder

@UseCase
class SignInUseCase(
    private val customerReadService: CustomerReadService,
    private val tokenProvider: TokenProvider,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val redisWriteService: RedisWriteService,
) {
    fun signIn(request: CustomerRequestVo): TokenResponse {
        val customer = customerReadService.getCustomerByEmail(request.email)

        val authenticationToken =
            UsernamePasswordAuthenticationToken(request.email, request.password + customer.salt)

        val authCustomer = authenticationManagerBuilder.getUserDetails(authenticationToken)

        val accessToken = tokenProvider.createAccessToken(authCustomer)
        val refreshToken = tokenProvider.createRefreshToken(authCustomer)

        redisWriteService.addJwtToken(refreshToken.token, request.email)

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