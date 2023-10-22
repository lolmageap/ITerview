package cherhy.jung.gptinterview.domain.customer

data class CustomerRequest(
    val name: String,
    val email: String,
    var password: String,
) {
    fun changePassword(password: String) {
        this.password = password
    }
}

fun CustomerRequest.toCustomer(): Customer = Customer(name, email, password)