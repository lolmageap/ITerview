package cherhy.jung.gptinterview.jwt

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("jwt")
class JwtProperty {
    lateinit var secret: String
    lateinit var tokenValidityInSeconds: String
    lateinit var refreshTokenValidityInSeconds: String
}