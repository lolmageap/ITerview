package cherhy.jung.gptinterview.jwt

import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.exception.DomainName
import cherhy.jung.gptinterview.exception.NotFoundException
import com.nimbusds.jose.JOSEException
import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.JWSHeader
import com.nimbusds.jose.JWSVerifier
import com.nimbusds.jose.crypto.MACSigner
import com.nimbusds.jose.crypto.MACVerifier
import com.nimbusds.jwt.JWTClaimsSet
import com.nimbusds.jwt.SignedJWT
import mu.KotlinLogging
import org.springframework.beans.factory.InitializingBean
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.stereotype.Component
import java.util.*
import javax.crypto.SecretKey
import javax.crypto.spec.SecretKeySpec

@Component
class TokenProvider(
    private val customerRepository: CustomerRepository,
    private val jwtProperty: JwtProperty,
) : InitializingBean {

    private val log = KotlinLogging.logger {}
    private lateinit var key: SecretKey

    override fun afterPropertiesSet() {
        this.key = SecretKeySpec(jwtProperty.secret.toByteArray(), "HmacSHA256")
    }

    fun createAccessToken(authCustomer: AuthCustomer): TokenResponseS {
        val now = Date().time
        val validity = Date(now + jwtProperty.tokenValidityInSeconds.toLong())

        val claimsSet = JWTClaimsSet.Builder()
            .subject(authCustomer.username)
            .claim(AUTHORITIES_KEY, authCustomer.authorities.toString())
            .expirationTime(validity)
            .build()

        val accessToken = SignedJWT(JWSHeader(JWSAlgorithm.HS256), claimsSet).run {
            sign(MACSigner(key))
            serialize()
        }

        return TokenResponseS(accessToken, validity)
    }

    fun getAuthentication(token: String): Authentication? {
        val signedJWT = SignedJWT.parse(token)

        if (signedJWT.verify(MACVerifier(key))) {
            val claims = signedJWT.jwtClaimsSet
            val authorities: Collection<GrantedAuthority> = claims.getStringClaim(AUTHORITIES_KEY)
                .split(",")
                .map(::SimpleGrantedAuthority)
                .toList()

            val customer = customerRepository.findByEmail(claims.subject)
                ?: throw NotFoundException(DomainName.CUSTOMER)

            val authCustomer = AuthCustomer(customer)
            return UsernamePasswordAuthenticationToken(authCustomer, token, authorities)
        }

        throw IllegalArgumentException("Invalid JWT token")
    }

    fun validateToken(token: String): Boolean {
        return try {
            val signedJWT = SignedJWT.parse(token)
            val verifier: JWSVerifier = MACVerifier(key)

            signedJWT.verify(verifier)
            true
        } catch (e: JOSEException) {
            log.info("JWT 토큰이 만료되었습니다, detail: {}", e.toString())
            false
        } catch (e: IllegalArgumentException) {
            log.info("JWT 토큰이 잘못되었습니다.")
            false
        } catch (e: RuntimeException) {
            log.info("JWT 토큰이 만료되었습니다, detail: {}", e.toString())
            false
        }
    }

    fun createRefreshToken(authCustomer: AuthCustomer): TokenResponseS {
        val now = Date().time
        val validity = Date(now + jwtProperty.refreshTokenValidityInSeconds.toLong())

        val claimsSet = JWTClaimsSet.Builder()
            .subject(authCustomer.username)
            .claim(AUTHORITIES_KEY, authCustomer.authorities.toString())
            .expirationTime(validity)
            .build()

        val refreshToken = SignedJWT(JWSHeader(JWSAlgorithm.HS256), claimsSet).run {
            sign(MACSigner(key))
            serialize()
        }

        return TokenResponseS(refreshToken, validity)
    }

    companion object {
        private const val AUTHORITIES_KEY = "auth"
    }

}
