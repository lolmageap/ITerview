package cherhy.jung.gptinterview.domain.customer

import java.time.LocalDate
import java.util.UUID

data class CustomerRequest(
    val name: String,
    val email: String,
    var password: String,
) {

    val salt: String = generateSalt()

    fun changePassword(password: String) {
        this.password = password
    }

    fun generateToken(): String {
        val now = LocalDate.now().toString().replace("-", "")
        val uuid = UUID.randomUUID().toString().replace("-", "")
        return "$now-$uuid"
    }

    private fun generateSalt(): String {
        return UUID.randomUUID().toString().replace("-", "")
    }

}

fun CustomerRequest.toCustomer(): Customer = Customer(
    name = name,
    email = email,
    password = password,
    token = generateToken(),
    salt = salt,
)