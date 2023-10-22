package cherhy.jung.gptinterview.domain.customer

import java.time.LocalDate
import java.util.UUID

data class CustomerRequest(
    val name: String,
    val email: String,
    var password: String,
) {
    fun changePassword(password: String) {
        this.password = password
    }

    fun generateToken(): String {
        val now = LocalDate.now().toString().replace("-", "")
        val uuid = UUID.randomUUID().toString().replace("-", "")
        return "$now-$uuid"
    }

}

fun CustomerRequest.toCustomer(): Customer = Customer(name, email, password, generateToken())