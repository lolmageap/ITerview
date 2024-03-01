package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("jwt")
class JwtProperty {
    lateinit var secret: String
    lateinit var tokenValidityInSeconds: String
    lateinit var refreshTokenValidityInSeconds: String
}