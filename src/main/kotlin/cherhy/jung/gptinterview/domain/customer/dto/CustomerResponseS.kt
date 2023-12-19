package cherhy.jung.gptinterview.domain.customer.dto

import cherhy.jung.gptinterview.domain.customer.Customer


data class CustomerResponseS(
    val id: Long,

    val name: String,

    val password: String,

    val email: String,

    val salt: String,

    val token: String,

) {
    companion object {
        fun of(customer: Customer): CustomerResponseS {
            return CustomerResponseS(
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