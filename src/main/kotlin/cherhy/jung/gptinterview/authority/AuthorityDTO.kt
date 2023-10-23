package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.domain.customer.CustomerRequest
import jakarta.validation.constraints.Email
import java.util.UUID

data class SignInRequest(
    @field:Email
    val email: String,
    val password: String,
)

fun SignInRequest.toCustomerRequest() : CustomerRequest {
    return CustomerRequest(
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
        require(password == confirmPassword) {"비밀번호 재입력 오류"}
    }
}

fun SignUpRequest.toCustomerRequest() : CustomerRequest {
    return CustomerRequest(
        name = UUID.randomUUID().toString().substring(0, 12),
        password = this.password,
        email = this.email,
    )
}