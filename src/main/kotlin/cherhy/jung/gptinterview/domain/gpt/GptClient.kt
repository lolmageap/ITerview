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

// Api라고 하니까 RestController일것 같은 느낌이 조금 들었네요!
// GptClient 같은건 어떨까요?
@Component
class GptClient {

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

        val response: ResponseEntity<GptApiResponseS> =
            RestTemplate().postForEntity(ENDPOINT, requestEntity, GptApiResponseS::class.java)

        val choices = response.body
            ?.choices
            ?: throw GptNotGeneratedException()

        val feedback = choices[0].text.trimIndent()
        return Validator.validateJsonFormat(feedback)
    }

    // companino object는 클래스의 맨 마지막에 와야합니다
    // 이런 kotlin 규칙을 한번 찾아볼까요?
    companion object {
        // @Value는 최대한 쓰지 말아볼까요? *require
        @Value("\${api-key}")
        private lateinit var API_KEY: String

        private const val ENDPOINT: String = "https://api.openai.com/v1/completions"
        private const val TEMPERATURE: Float = 0.5f
        private const val MAX_TOKENS: Int = 524
    }
}