package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("jwt")
class JwtProperty(
    val secret: String,
    val algorithm: String,
    val tokenValidityInSeconds: String,
    val refreshTokenValidityInSeconds: String,
    val authorityKey: String,
)