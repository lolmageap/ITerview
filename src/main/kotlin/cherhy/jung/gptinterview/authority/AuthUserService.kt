package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.component.RedisWriteService
import cherhy.jung.gptinterview.domain.user.UserRepository
import cherhy.jung.gptinterview.domain.user.UserRequest
import cherhy.jung.gptinterview.domain.user.toUser
import cherhy.jung.gptinterview.exception.Domain
import cherhy.jung.gptinterview.exception.ExistException
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.exception.Property
import org.springframework.http.HttpHeaders
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthUserService(
    private val userRepository: UserRepository,
    private val tokenProvider: TokenProvider,
    private val passwordEncoder: BCryptPasswordEncoder,
    private val authenticationManagerBuilder: AuthenticationManagerBuilder,
    private val redisWriteService: RedisWriteService,
): UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        return userRepository.findByEmail(username)
            ?.let { AuthUser(it) }
            ?: throw NotFoundException(Domain.USER)
    }

    fun signIn(userRequest: UserRequest): TokenResponse {
        val authenticationToken = UsernamePasswordAuthenticationToken(userRequest.email, userRequest.password)
        val authentication: Authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken)

        val authUser = authentication.principal as AuthUser

        val role = authentication.authorities
            .map { g: GrantedAuthority? -> g?.authority ?: throw IllegalStateException()}
            .first().replace("ROLE_", "")

        val jwt = tokenProvider.createToken(authUser)
        val refreshToken = tokenProvider.createRefreshToken(authUser)

        val httpHeaders = HttpHeaders()
        httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer $jwt")

        redisWriteService.addJwtToken(authUser.userId, jwt)

        return TokenResponse(jwt, role, authUser.userId)
    }

    fun signUp(userRequest: UserRequest) {
        duplicationEmailCheck(userRequest.email)
        val encodedPassword = passwordEncoder.encode(userRequest.password)
        userRequest.changePassword(encodedPassword)
        userRepository.save( userRequest.toUser() )
    }

    fun duplicationEmailCheck(email: String) {
        val exists = userRepository.existsByEmail(email)
        if (exists) throw ExistException(Property.EMAIL)
    }

}