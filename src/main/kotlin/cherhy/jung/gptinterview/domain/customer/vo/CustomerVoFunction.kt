package cherhy.jung.gptinterview.domain.customer.vo

import cherhy.jung.gptinterview.domain.customer.entity.Customer

fun CreateCustomerRequestVo.toCustomer() = Customer(
    name = name,
    username = username,
    salt = salt,
    provider = provider,
)

fun CustomerResponseVo.Companion.of(
    customer: Customer,
) =
    with(customer) {
        CustomerResponseVo(
            id = id,
            name = name,
            password = password,
            username = username,
            salt = salt,
            token = token,
        )
    }