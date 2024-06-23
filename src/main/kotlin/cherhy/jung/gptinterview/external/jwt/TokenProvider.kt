package cherhy.jung.gptinterview.external.jwt

import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.property.JwtProperty
import com.nimbusds.jose.JOSEException
import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.JWSHeader
import com.nimbusds.jose.JWSVerifier
import com.nimbusds.jose.crypto.MACSigner
import com.nimbusds.jose.crypto.MACVerifier
import com.nimbusds.jwt.JWTClaimsSet
import com.nimbusds.jwt.SignedJWT
import com.nimbusds.jwt.proc.BadJWTException
import mu.KotlinLogging
import org.springframework.beans.factory.InitializingBean
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.time.ZonedDateTime
import java.util.*
import javax.crypto.SecretKey
import javax.crypto.spec.SecretKeySpec

@Component
@Transactional
class TokenProvider(
    private val customerRepository: CustomerRepository,
    private val jwtProperty: JwtProperty,
) : InitializingBean {
    private val log = KotlinLogging.logger {}
    private lateinit var key: SecretKey

    override fun afterPropertiesSet() {
        this.key = SecretKeySpec(jwtProperty.secret.toByteArray(), jwtProperty.algorithm)
    }

    fun createAccessToken(
        principal: Principal,
    ): TokenResponseVo {
        val now = Date().time
        val validity = Date(now + jwtProperty.tokenValidityInSeconds.toLong())

        val claimsSet = JWTClaimsSet.Builder()
            .subject(principal.username)
            .claim(jwtProperty.authorityKey, principal.authorities.toString())
            .expirationTime(validity)
            .build()

        val accessToken = SignedJWT(JWSHeader(JWSAlgorithm.HS256), claimsSet).run {
            sign(MACSigner(key))
            serialize()
        }

        return TokenResponseVo(accessToken, validity)
    }

    fun getPrincipal(
        token: String,
    ): Principal {
        val signedJWT = SignedJWT.parse(token)

        if (signedJWT.verify(MACVerifier(key))) {
            val claims = signedJWT.jwtClaimsSet
            val authorities = claims.getStringClaim(jwtProperty.authorityKey)
                .split(",")
                .map(::SimpleGrantedAuthority)
                .toList()

            val customer = customerRepository.findByUsername(claims.subject)
                ?: throw NotFoundException(MessageType.CUSTOMER)

            val principal = Principal(customer)
            val authenticationToken =
                UsernamePasswordAuthenticationToken(principal, token, authorities)

            return authenticationToken.principal as Principal
        }

        throw BadJWTException("JWT 토큰이 잘못 되었습니다.")
    }

    fun getAuthentication(
        token: String,
    ): UsernamePasswordAuthenticationToken {
        val signedJWT = SignedJWT.parse(token)

        if (signedJWT.verify(MACVerifier(key))) {
            val claims = signedJWT.jwtClaimsSet
            val authorities = claims.getStringClaim(jwtProperty.authorityKey)
                .split(",")
                .map(::SimpleGrantedAuthority)
                .toList()

            val customer = customerRepository.findByUsername(claims.subject)
                ?: throw NotFoundException(MessageType.CUSTOMER)

            val principal = Principal(customer)
            return UsernamePasswordAuthenticationToken(principal, token, authorities)
        }

        throw BadJWTException("JWT 토큰이 잘못 되었습니다.")
    }

    fun validateToken(
        token: String,
    ): Boolean {
        return try {
            val signedJWT = SignedJWT.parse(token)
            val verifier = MACVerifier(key)

            signedJWT.verify(verifier)
            true
        } catch (e: JOSEException) {
            log.info { "JWT 토큰이 만료 되었습니다. detail: $e" }
            false
        } catch (e: RuntimeException) {
            log.info { "JWT 토큰이 잘못 되었습니다. detail: $e" }
            false
        }
    }

    fun createRefreshToken(
        principal: Principal,
    ): TokenResponseVo {
        val now = ZonedDateTime.now().toInstant().toEpochMilli()
        val validity = Date(now + jwtProperty.refreshTokenValidityInSeconds.toLong())

        val claimsSet = JWTClaimsSet.Builder()
            .subject(principal.username)
            .claim(jwtProperty.authorityKey, principal.authorities.toString())
            .expirationTime(validity)
            .build()

        val refreshToken = SignedJWT(JWSHeader(JWSAlgorithm.HS256), claimsSet).run {
            sign(MACSigner(key))
            serialize()
        }

        return TokenResponseVo(refreshToken, validity)
    }
}
