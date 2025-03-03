package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.customer.vo.CreateCustomerRequestVo
import cherhy.jung.gptinterview.domain.customer.vo.CustomerResponseVo
import cherhy.jung.gptinterview.domain.customer.vo.EditPasswordRequestVo
import cherhy.jung.gptinterview.util.Generator

fun SignInRequest.toCustomerRequest() =
    CreateCustomerRequestVo(
        name = Generator.name,
        password = this.password,
        username = this.email,
        salt = Generator.salt,
    )

fun SignUpRequest.toCustomerRequest() =
    CreateCustomerRequestVo(
        name = Generator.name,
        password = this.password,
        username = this.email,
        salt = Generator.salt,
    )

fun EditPasswordRequest.toEditPasswordRequestVo() =
    EditPasswordRequestVo(
        originalPassword = this.originalPassword,
        editPassword = this.editPassword,
    )

fun CustomerResponse.Companion.of(
    response: CustomerResponseVo,
) =
    with(response) {
        CustomerResponse(
            name = name,
            image = "https://source.unsplash.com/random",
            username = username,
            token = token,
        )
    }