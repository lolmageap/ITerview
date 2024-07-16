package cherhy.jung.gptinterview.external.gpt

fun GptResponseVo.Companion.of(
    token: String,
    body: String,
) = GptResponseVo(token, body)