package cherhy.jung.gptinterview.domain.gpt

import com.fasterxml.jackson.annotation.JsonProperty

data class GptApiResponseS(
    @JsonProperty("id") val id: String,
    @JsonProperty("object") val obj: String,
    @JsonProperty("created") val created: Long,
    @JsonProperty("model") val model: String,
    @JsonProperty("choices") val choices: List<Choice>,
    @JsonProperty("usage") val usage: Usage,
)

data class Choice(
    @JsonProperty("text") val text: String,
    @JsonProperty("index") val index: Int,
    @JsonProperty("logprobs") val logprobs: Any?,
    @JsonProperty("finish_reason") val finishReason: String,
)

data class Usage(
    @JsonProperty("prompt_tokens") val promptTokens: Int,
    @JsonProperty("completion_tokens") val completionTokens: Int,
    @JsonProperty("total_tokens") val totalTokens: Int,
)