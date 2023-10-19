package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.domain.user.UserRepository
import cherhy.jung.gptinterview.exception.Domain
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.util.log
import com.nimbusds.jose.JOSEException
import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.JWSHeader
import com.nimbusds.jose.JWSVerifier
import com.nimbusds.jose.crypto.MACSigner
import com.nimbusds.jose.crypto.MACVerifier
import com.nimbusds.jwt.JWTClaimsSet
import com.nimbusds.jwt.SignedJWT
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Value
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
    private val userRepository: UserRepository,

    @Value("\${jwt.secret}")
    private val secret: String,

    @Value("\${jwt.token-validity-in-seconds}")
    private val tokenValidityInMilliseconds: Long,

    @Value("\${jwt.refresh-token-validity-in-seconds")
    private val refreshTokenValidityInMilliseconds: Long,
) : InitializingBean {

    private lateinit var key: SecretKey
    private val AUTHORITIES_KEY = "auth"

    override fun afterPropertiesSet() {
        this.key = SecretKeySpec(secret.toByteArray(), "HmacSHA256")
    }

    fun createToken(authUser: AuthUser): String {
        val now = Date().time
        val validity = Date(now + tokenValidityInMilliseconds)

        val claimsSet = JWTClaimsSet.Builder()
            .subject(authUser.username)
            .claim(AUTHORITIES_KEY, authUser.authorities.toString())
            .expirationTime(validity)
            .build()

        return SignedJWT(JWSHeader(JWSAlgorithm.HS256), claimsSet).run {
            sign(MACSigner(key))
            serialize()
        }
    }

    fun getAuthentication(token: String?): Authentication? {
        val signedJWT = SignedJWT.parse(token)

        if (signedJWT.verify(MACVerifier(key))) {
            val claims = signedJWT.jwtClaimsSet
            val authorities: Collection<GrantedAuthority> = claims.getStringClaim(AUTHORITIES_KEY).split(",")
                .map { role -> SimpleGrantedAuthority(role) }
                .toList()

//          // OAuth 로그인 할 때
//            val user: User = userRepository.findByProviderId(claims.subject)
            val user = userRepository.findByEmail(claims.subject)
                ?: throw NotFoundException(Domain.USER)

            val authUser = AuthUser(user)
            return UsernamePasswordAuthenticationToken(authUser, token, authorities)
        } else throw IllegalArgumentException("Invalid JWT token")

        return null
    }

    fun validateToken(token: String?): Boolean {
        return try {
            val signedJWT = SignedJWT.parse(token)
            val verifier: JWSVerifier = MACVerifier(key)

            if (signedJWT.verify(verifier)) {
                val claims: JWTClaimsSet = signedJWT.jwtClaimsSet
                true
            } else {
                log.info("validateToken = {}", token)
                false
            }
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

    fun createRefreshToken(authUser: AuthUser): String {
        val now = Date().time
        val validity = Date(now + refreshTokenValidityInMilliseconds)

        val claimsSet = JWTClaimsSet.Builder()
            .subject(authUser.username)
            .claim(AUTHORITIES_KEY, authUser.authorities.toString())
            .expirationTime(validity)
            .build()

        return SignedJWT(JWSHeader(JWSAlgorithm.HS256), claimsSet).run {
            sign(MACSigner(key))
            serialize()
        }
    }

}
