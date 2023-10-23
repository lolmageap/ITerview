package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.component.RedisWriteService
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.domain.customer.CustomerRequest
import cherhy.jung.gptinterview.domain.customer.toCustomer
import cherhy.jung.gptinterview.exception.Domain
import cherhy.jung.gptinterview.exception.ExistException
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.exception.Property
import org.springframework.http.HttpHeaders
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AuthCustomerService(
    private val customerRepository: CustomerRepository,
    private val tokenProvider: TokenProvider,
    private val passwordEncoder: BCryptPasswordEncoder,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val redisWriteService: RedisWriteService,
): UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        return customerRepository.findByEmail(username)
            ?. let { AuthCustomer(it) }
            ?: throw NotFoundException(Domain.CUSTOMER)
    }

    fun signIn(customerRequest: CustomerRequest): TokenResponse {
        val salt = customerRepository.findByEmail(customerRequest.email)
            ?. let { it.salt }
            ?: throw NotFoundException(Domain.CUSTOMER)

        val authenticationToken = UsernamePasswordAuthenticationToken(customerRequest.email, customerRequest.password + salt)
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

    fun signUp(customerRequest: CustomerRequest) {
        duplicationEmailCheck(customerRequest.email)
        val encodedPassword = passwordEncoder.encode(customerRequest.password + customerRequest.salt)
        customerRequest.changePassword(encodedPassword)
        customerRepository.save( customerRequest.toCustomer() )
    }

    fun duplicationEmailCheck(email: String) {
        val exists = customerRepository.existsByEmail(email)
        if (exists) throw ExistException(Property.EMAIL)
    }

}