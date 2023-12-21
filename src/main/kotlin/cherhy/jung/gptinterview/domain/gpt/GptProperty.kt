package cherhy.jung.gptinterview.domain.gpt

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties
class GptProperty {
    lateinit var apiKey: String
}
