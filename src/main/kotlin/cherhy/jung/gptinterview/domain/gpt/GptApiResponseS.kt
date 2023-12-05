package cherhy.jung.gptinterview.domain.gpt

import com.fasterxml.jackson.annotation.JsonProperty

// S의 postfix는 무슨뜻일까요?~
// jsonProperty가 필요하지 않은애들은 뺼까요?
data class GptApiResponseS(
    val id: String,
    @JsonProperty("object") val obj: String,
    val created: Long,
    val model: String,
    val choices: List<Choice>,
    val usage: Usage,
)

data class Choice(
    val text: String,
    val index: Int,
    val logprobs: Any?,
    @JsonProperty("finish_reason") val finishReason: String,
)

data class Usage(
    @JsonProperty("prompt_tokens") val promptTokens: Int,
    @JsonProperty("completion_tokens") val completionTokens: Int,
    @JsonProperty("total_tokens") val totalTokens: Int,
)