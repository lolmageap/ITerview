package cherhy.jung.gptinterview.domain.customer


data class CustomerResponseS(
    var id: Long,

    var name: String,

    val email: String,

    val salt: String,

    val token: String,

    ) {
    companion object {
        fun of(customer: Customer): CustomerResponseS {
            return CustomerResponseS(
                id = customer.id,
                name = customer.name,
                email = customer.email,
                salt = customer.salt,
                token = customer.token,
            )
        }
    }
}