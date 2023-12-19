package cherhy.jung.gptinterview.domain.customer.dto

data class EditPasswordRequestS(
    val originalPassword: String,
    val editPassword: String,
)