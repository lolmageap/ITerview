package cherhy.jung.gptinterview.external.gpt

import com.fasterxml.jackson.annotation.JsonProperty

data class GptResponseVo(
    val token: String,
    val body: String,
)

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
    val logprobs: String?,
    @JsonProperty("finish_reason") val finishReason: String,
)

data class Usage(
    @JsonProperty("prompt_tokens") val promptTokens: Int,
    @JsonProperty("completion_tokens") val completionTokens: Int,
    @JsonProperty("total_tokens") val totalTokens: Int,
)