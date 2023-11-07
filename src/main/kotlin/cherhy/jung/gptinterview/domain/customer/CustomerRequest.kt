package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.util.Generator

data class CustomerRequest(
    val name: String,
    val email: String,
    var password: String,
) {

    val salt: String = Generator.generateSalt()

}

fun CustomerRequest.toCustomer(): Customer = Customer(
    name = name,
    email = email,
    password = password,
    token = Generator.generateToken(),
    salt = salt,
)