package cherhy.jung.gptinterview.domain.gpt

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("api-key")
class GptProperty {
    lateinit var API_KEY: String
}
