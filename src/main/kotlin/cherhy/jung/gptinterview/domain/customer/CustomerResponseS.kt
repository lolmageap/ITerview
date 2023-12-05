package cherhy.jung.gptinterview.domain.customer


data class CustomerResponseS(
    val id: Long, // var인 이유가 있을까요?

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