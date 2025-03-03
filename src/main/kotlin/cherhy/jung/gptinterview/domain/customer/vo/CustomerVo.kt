package cherhy.jung.gptinterview.domain.customer.vo

import cherhy.jung.gptinterview.domain.customer.constant.Provider

data class CreateCustomerRequestVo(
    val name: String,
    val username: String,
    var password: String,
    val salt: String,
    val provider: Provider = Provider.LOCAL,
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