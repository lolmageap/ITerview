package cherhy.jung.gptinterview.authority

data class TokenResponse(
    val token: String,
    val role: List<String>,
    val customerToken: String,
)