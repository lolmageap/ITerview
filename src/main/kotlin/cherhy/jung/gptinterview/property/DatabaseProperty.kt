package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.DependsOn

@DependsOn("jasyptStringEncryptor")
@ConfigurationProperties("spring.datasource")
data class DatabaseProperty(
    var url: String,
    var username: String,
    var password: String,
)