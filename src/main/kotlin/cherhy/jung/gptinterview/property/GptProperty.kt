package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("gpt")
data class GptProperty(
    val apiKey: String,
    val model: String,
    val maxTokens: Int,
    val temperature: Float,
)
