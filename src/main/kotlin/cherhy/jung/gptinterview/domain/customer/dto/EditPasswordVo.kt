package cherhy.jung.gptinterview.domain.customer.dto

data class EditPasswordRequestVo(
    val originalPassword: String,
    val editPassword: String,
)