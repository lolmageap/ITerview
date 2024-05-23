package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.customer.vo.CustomerRequestVo
import cherhy.jung.gptinterview.domain.customer.vo.CustomerResponseVo
import cherhy.jung.gptinterview.domain.customer.vo.EditPasswordRequestVo
import cherhy.jung.gptinterview.util.Generator

// TODO : CustomerRequestVo 말고 로그인만을 담당하는 SignInRequestVo 를 만들어야 할 것 같습니다.
fun SignInRequest.toCustomerRequest() =
    CustomerRequestVo(
        name = Generator.name,
        password = this.password,
        username = this.email,
        salt = Generator.salt,
    )

fun SignUpRequest.toCustomerRequest() =
    CustomerRequestVo(
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