package cherhy.jung.gptinterview.external.gpt

import cherhy.jung.gptinterview.exception.GptNotGeneratedException
import cherhy.jung.gptinterview.property.GptProperty
import cherhy.jung.gptinterview.util.Validator
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

/**
 *  temperature 는 생성된 텍스트의 다양성을 조절
 *  max tokens 는 생성된 텍스트의 최대 길이를 제한
 */
@Component
@EnableConfigurationProperties(GptProperty::class)
class GptClient(
    private val gptProperty: GptProperty,
) {
    fun requestAndReceiveFeedback(prompt: String): String {
        val headers = HttpHeaders().apply {
            contentType = MediaType.APPLICATION_JSON
            set("Authorization", "Bearer ${gptProperty.apiKey}")
        }

        val requestBody = mapOf(
            "model" to MODEL,
            "prompt" to prompt,
            "temperature" to TEMPERATURE,
            "max_tokens" to MAX_TOKENS,
        )

        val requestEntity = HttpEntity(requestBody, headers)

        val response: ResponseEntity<GptApiResponseS> =
            RestTemplate().postForEntity(ENDPOINT, requestEntity, GptApiResponseS::class.java)

        val choices = response.body
            ?.choices
            ?: throw GptNotGeneratedException()

        val feedback = choices.joinToString("") {
            it.text
        }.trimIndent()

        return Validator.validateJsonFormat(feedback)
    }

    companion object {
        private const val ENDPOINT: String = "https://api.openai.com/v1/completions"
        private const val TEMPERATURE: Float = 0.5f
        private const val MODEL: String = "gpt-3.5-turbo-instruct"
        private const val MAX_TOKENS: Int = 524
    }
}