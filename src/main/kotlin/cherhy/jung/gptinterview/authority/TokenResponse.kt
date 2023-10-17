package cherhy.jung.gptinterview.authority

data class TokenResponse(
    val token: String,
    val role: String,
    val userId: Long,
)