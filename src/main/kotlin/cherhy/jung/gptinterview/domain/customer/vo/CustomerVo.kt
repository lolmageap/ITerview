package cherhy.jung.gptinterview.domain.customer.vo

import cherhy.jung.gptinterview.domain.customer.entity.Customer

data class CustomerRequestVo(
    val name: String,
    val username: String,
    var password: String,
    val salt: String,
) {
    fun toCustomer() = Customer(
        name = name,
        username = username,
        salt = salt,
    )
}

data class CustomerResponseVo(
    val id: Long,
    val name: String,
    val password: String,
    val username: String,
    val salt: String,
    val token: String,
) {
    companion object {
        fun of(customer: Customer) =
            CustomerResponseVo(
                id = customer.id,
                name = customer.name,
                password = customer.password,
                username = customer.username,
                salt = customer.salt,
                token = customer.token,
            )
    }
}

data class EditPasswordRequestVo(
    val originalPassword: String,
    val editPassword: String,
)