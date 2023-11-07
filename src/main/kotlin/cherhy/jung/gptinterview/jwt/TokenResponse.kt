package cherhy.jung.gptinterview.jwt

data class TokenResponse(
    val token: String,
    val role: List<String>,
    val customerToken: String,
)