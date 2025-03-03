package cherhy.jung.gptinterview.external.gpt

import cherhy.jung.gptinterview.exception.GptNotGeneratedException
import cherhy.jung.gptinterview.external.gpt.GptKey.GPT_ENDPOINT
import cherhy.jung.gptinterview.external.gpt.GptKey.MAX_TOKENS
import cherhy.jung.gptinterview.external.gpt.GptKey.MODEL
import cherhy.jung.gptinterview.external.gpt.GptKey.PROMPT
import cherhy.jung.gptinterview.external.gpt.GptKey.TEMPERATURE
import cherhy.jung.gptinterview.property.GptProperty
import cherhy.jung.gptinterview.util.JwtKey.BEARER
import cherhy.jung.gptinterview.util.Validator
import org.apache.http.HttpHeaders.AUTHORIZATION
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

/**
 *  temperature 는 생성된 텍스트의 다양성을 조절
 *  max tokens 는 생성된 텍스트의 최대 길이를 제한
 */
@Component
class GptClient(
    private val gptProperty: GptProperty,
    private val restTemplate: RestTemplate,
) {
    fun requestAndReceiveFeedback(
        prompt: String,
    ): String {
        val headers = HttpHeaders().apply {
            contentType = MediaType.APPLICATION_JSON
            set(AUTHORIZATION, BEARER + gptProperty.apiKey)
        }

        val requestBody = mapOf(
            MODEL to gptProperty.model,
            PROMPT to prompt,
            MAX_TOKENS to gptProperty.maxTokens,
            TEMPERATURE to gptProperty.temperature,
        )

        val requestEntity = HttpEntity(requestBody, headers)

        val response =
            restTemplate.postForEntity(GPT_ENDPOINT, requestEntity, GptApiResponseVo::class.java)

        val choices = response.body
            ?.choices
            ?: throw GptNotGeneratedException()

        val feedback = choices.joinToString("") {
            it.text
        }.trimIndent()

        return Validator.jsonFormat(feedback)
    }
}