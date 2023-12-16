package cherhy.jung.gptinterview.domain.customer.dto

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.util.Generator

data class CustomerRequestS(
    val name: String,
    val email: String,
    var password: String,
) {
    val salt: String = Generator.generateSalt()

    fun toCustomer(): Customer = Customer(
        name = name,
        email = email,
        password = password,
        token = Generator.generateToken(),
        salt = salt,
    )
}
