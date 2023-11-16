package cherhy.jung.gptinterview.restcontroller

import cherhy.jung.gptinterview.domain.customer.CustomerRequestS
import jakarta.validation.constraints.Email
import java.util.UUID

data class SignInRequest(
    @field:Email
    val email: String,
    val password: String,
)

fun SignInRequest.toCustomerRequest(): CustomerRequestS {
    return CustomerRequestS(
        name = UUID.randomUUID().toString().substring(0, 12),
        password = this.password,
        email = this.email,
    )
}

data class SignUpRequest(
    @field:Email
    val email: String,
    var password: String,
    val confirmPassword: String,
) {
    init {
        require(password == confirmPassword) { "동일한 비밀번호를 입력해주세요." }
        require(password.length > 7) { "비밀번호는 8글자 이상이어야 합니다." }
    }
}

fun SignUpRequest.toCustomerRequest(): CustomerRequestS {
    return CustomerRequestS(
        name = UUID.randomUUID().toString().substring(0, 12),
        password = this.password,
        email = this.email,
    )
}
