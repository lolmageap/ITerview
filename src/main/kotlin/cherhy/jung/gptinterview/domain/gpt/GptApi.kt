package cherhy.jung.gptinterview.domain.gpt

import cherhy.jung.gptinterview.exception.GptNotGeneratedException
import cherhy.jung.gptinterview.util.Validator
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class GptApi(
    @Value("\${api-key}")
    private val API_KEY: String,
) {

    companion object {
        private const val ENDPOINT: String = "https://api.openai.com/v1/completions"
        private const val TEMPERATURE: Float = 0.5f
        private const val MAX_TOKENS: Int = 524
    }

    /**
     *  temperature 는 생성된 텍스트의 다양성을 조절
     *  max tokens 는 생성된 텍스트의 최대 길이를 제한
     */
    fun generateText(prompt: String): String {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON
        headers.set("Authorization", "Bearer $API_KEY")

        val requestBody: MutableMap<String, Any> = HashMap()
        requestBody["model"] = "gpt-3.5-turbo-instruct"
        requestBody["prompt"] = prompt
        requestBody["temperature"] = TEMPERATURE
        requestBody["max_tokens"] = MAX_TOKENS

        val requestEntity: HttpEntity<Map<String, Any>> = HttpEntity(requestBody, headers)

        val response: ResponseEntity<GptResponseS> =
            RestTemplate().postForEntity(ENDPOINT, requestEntity, GptResponseS::class.java)

        val choices = response.body
            ?.choices
            ?: throw GptNotGeneratedException()

        val feedback = choices[0].text
        return Validator.validateJsonFormat(feedback)
    }

}