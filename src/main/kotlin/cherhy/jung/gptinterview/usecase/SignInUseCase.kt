package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.dependency.RedisWriteService
import cherhy.jung.gptinterview.domain.customer.AuthCustomer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerRequest
import cherhy.jung.gptinterview.jwt.JwtFilter
import cherhy.jung.gptinterview.jwt.TokenProvider
import cherhy.jung.gptinterview.jwt.TokenResponse
import org.springframework.http.HttpHeaders
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.core.Authentication
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class SignInUseCase(
    private val customerReadService: CustomerReadService,
    private val tokenProvider: TokenProvider,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val redisWriteService: RedisWriteService,
) {
    fun signIn(customerRequest: CustomerRequest): TokenResponse {
        val salt = customerReadService.getCustomerByEmail(customerRequest.email)
            .let { it.salt }

        val authenticationToken =
            UsernamePasswordAuthenticationToken(customerRequest.email, customerRequest.password + salt)
        val authentication: Authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken)
        val authCustomer = authentication.principal as AuthCustomer

        val role = authentication.authorities
            .map { it?.authority ?: throw IllegalStateException() }

        val jwt = tokenProvider.createToken(authCustomer)
        val refreshToken = tokenProvider.createRefreshToken(authCustomer)

        val httpHeaders = HttpHeaders()
        httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer $jwt")

        redisWriteService.addJwtToken(jwt, refreshToken)
        return TokenResponse(jwt, role, authCustomer.token)
    }

}