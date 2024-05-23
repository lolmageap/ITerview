package cherhy.jung.gptinterview.domain.customer.vo

data class CustomerRequestVo(
    val name: String,
    val username: String,
    var password: String,
    val salt: String,
)

data class CustomerResponseVo(
    val id: Long,
    val name: String,
    val password: String,
    val username: String,
    val salt: String,
    val token: String,
) { companion object }

data class EditPasswordRequestVo(
    val originalPassword: String,
    val editPassword: String,
)