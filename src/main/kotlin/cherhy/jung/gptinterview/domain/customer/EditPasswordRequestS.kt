package cherhy.jung.gptinterview.domain.customer

data class EditPasswordRequestS(
    val originalPassword: String,
    val editPassword: String,
)