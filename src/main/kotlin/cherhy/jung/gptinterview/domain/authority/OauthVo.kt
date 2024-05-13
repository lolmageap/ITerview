package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.domain.customer.entity.Customer
import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.util.Generator

data class OauthRequest(
    val providerId: String,
    val provider: Provider,
) {
    val salt = Generator.salt()
    fun toCustomer(): Customer {
        return Customer(
            username = providerId,
            name = Generator.name(),
            salt = salt
        )
    }
}