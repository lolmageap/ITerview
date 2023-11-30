package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.AuthCustomer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerRequestS
import cherhy.jung.gptinterview.jwt.TokenProvider
import cherhy.jung.gptinterview.jwt.TokenResponse
import cherhy.jung.gptinterview.redis.RedisWriteService
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.core.Authentication

@UseCase
class SignInUseCase(
    private val customerReadService: CustomerReadService,
    private val tokenProvider: TokenProvider,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val redisWriteService: RedisWriteService,
) {
    fun signIn(customerRequestS: CustomerRequestS): TokenResponse {
        val salt = customerReadService.getCustomerByEmail(customerRequestS.email)
            .let { it.salt }

        val authenticationToken =
            UsernamePasswordAuthenticationToken(customerRequestS.email, customerRequestS.password + salt)
        val authentication: Authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken)
        val authCustomer = authentication.principal as AuthCustomer

        val role = authentication.authorities
            .map { it?.authority ?: throw IllegalStateException() }

        val jwt = tokenProvider.createToken(authCustomer)
        val refreshToken = tokenProvider.createRefreshToken(authCustomer)

        redisWriteService.addJwtToken(jwt, refreshToken)
        return TokenResponse(jwt, role, authCustomer.token)
    }

}