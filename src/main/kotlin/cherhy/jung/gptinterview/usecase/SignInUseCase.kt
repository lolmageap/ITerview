package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.dto.CustomerRequestS
import cherhy.jung.gptinterview.jwt.TokenProvider
import cherhy.jung.gptinterview.jwt.TokenResponse
import cherhy.jung.gptinterview.redis.RedisWriteService
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder

@UseCase
class SignInUseCase(
    private val customerReadService: CustomerReadService,
    private val tokenProvider: TokenProvider,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val redisWriteService: RedisWriteService,
) {
    fun signIn(customerRequestS: CustomerRequestS): TokenResponse {
        val salt = customerReadService.getCustomerByEmail(customerRequestS.email).salt

        val authenticationToken =
            UsernamePasswordAuthenticationToken(customerRequestS.email, customerRequestS.password + salt)

        val authCustomer = authenticationManagerBuilder.getUserDetails(authenticationToken)

        val accessToken = tokenProvider.createAccessToken(authCustomer)
        val refreshToken = tokenProvider.createRefreshToken(authCustomer)

        redisWriteService.addJwtToken(refreshToken.token, customerRequestS.email)

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

private fun AuthenticationManagerBuilder.getUserDetails(
    authenticationToken: UsernamePasswordAuthenticationToken,
): AuthCustomer {
    val authenticate = this.`object`.authenticate(authenticationToken)
    return authenticate.principal as AuthCustomer
}