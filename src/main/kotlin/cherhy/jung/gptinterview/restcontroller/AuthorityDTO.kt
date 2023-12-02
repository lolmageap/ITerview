package cherhy.jung.gptinterview.restcontroller

import cherhy.jung.gptinterview.domain.customer.CustomerRequestS
import cherhy.jung.gptinterview.domain.customer.EditPasswordRequestS
import jakarta.validation.constraints.Email
import java.util.*

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

data class EditPasswordRequest(
    var originalPassword: String,
    val editPassword: String,
) {
    init {
        require(originalPassword != editPassword) { "현재 비밀번호와 변경하려는 비밀번호가 일치합니다." }
    }
}

fun EditPasswordRequest.toEditPasswordRequestS() =
    EditPasswordRequestS(
        originalPassword = originalPassword,
        editPassword = editPassword,
    )