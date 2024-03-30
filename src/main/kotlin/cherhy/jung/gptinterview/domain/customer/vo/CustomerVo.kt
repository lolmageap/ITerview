package cherhy.jung.gptinterview.domain.customer.vo

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.util.Generator

data class CustomerRequestVo(
    val name: String,
    val email: String,
    var password: String,
) {
    val salt: String = Generator.salt()

    fun toCustomer(): Customer = Customer(
        name = name,
        email = email,
        password = password,
        salt = salt,
    )
}

data class CustomerResponseVo(
    val id: Long,
    val name: String,
    val password: String,
    val email: String,
    val salt: String,
    val token: String,
) {
    companion object {
        fun of(customer: Customer): CustomerResponseVo {
            return CustomerResponseVo(
                id = customer.id,
                name = customer.name,
                password = customer.password,
                email = customer.email,
                salt = customer.salt,
                token = customer.token,
            )
        }
    }
}

data class EditPasswordRequestVo(
    val originalPassword: String,
    val editPassword: String,
)