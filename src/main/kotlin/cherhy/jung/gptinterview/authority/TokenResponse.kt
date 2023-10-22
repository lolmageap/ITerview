package cherhy.jung.gptinterview.authority

data class TokenResponse(
    val token: String,
    val role: List<String>,
    val customerId: Long,
)