package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.extension.convertUserDetails
import cherhy.jung.gptinterview.external.cache.CacheWriteService
import cherhy.jung.gptinterview.external.jwt.TokenProvider
import cherhy.jung.gptinterview.external.jwt.TokenResponse
import cherhy.jung.gptinterview.property.DefaultPasswordProperty
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService

@WriteService
class Oauth2WriteService(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val tokenProvider: TokenProvider,
    private val passwordEncoder: BCryptPasswordEncoder,
    private val passwordProperty: DefaultPasswordProperty,
    private val cacheWriteService: CacheWriteService,
) : DefaultOAuth2UserService() {
    fun execute(request: OauthRequest): TokenResponse {
        val customer =
            try {
                customerReadService.getCustomerByEmailAndProvider(request.providerId, request.provider)
            } catch (e: NotFoundException) {
                val password = passwordEncoder.encode(passwordProperty.password + passwordProperty.salt)
                customerWriteService.saveCustomer(request.toCustomer(), password, request.provider)
            }

        val authenticationToken = UsernamePasswordAuthenticationToken(customer.username, customer.password + customer.salt)
        val authCustomer = authenticationManagerBuilder.convertUserDetails(authenticationToken)

        val accessToken = tokenProvider.createAccessToken(authCustomer)
        val refreshToken = tokenProvider.createRefreshToken(authCustomer)
        cacheWriteService.addJwtToken(refreshToken.token, customer.username)

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