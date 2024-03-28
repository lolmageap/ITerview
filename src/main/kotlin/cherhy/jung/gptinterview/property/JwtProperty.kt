package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.DependsOn

@DependsOn("jasyptStringEncryptor")
@ConfigurationProperties("jwt")
class JwtProperty(
    val secret: String,
    val algorithm: String,
    val tokenValidityInSeconds: String,
    val refreshTokenValidityInSeconds: String,
    val authorityKey: String,
)