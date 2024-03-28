package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.DependsOn

@DependsOn("jasyptStringEncryptor")
@ConfigurationProperties("gpt")
data class GptProperty(
    val apiKey: String,
    val model: String,
    val maxTokens: Int,
    val temperature: Float,
)
