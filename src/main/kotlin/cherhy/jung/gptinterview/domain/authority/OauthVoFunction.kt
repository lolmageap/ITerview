package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.domain.customer.entity.Customer
import cherhy.jung.gptinterview.util.Generator

fun OauthRequest.toCustomer() =
    Customer(
        username = providerId,
        name = Generator.name,
        salt = salt
    )