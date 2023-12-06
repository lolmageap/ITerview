package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.customer.CustomerRequestS
import cherhy.jung.gptinterview.domain.customer.EditPasswordRequestS
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import org.hibernate.validator.constraints.Length
import java.util.*

data class SignInRequest(
    @field:NotBlank
    @field:Email
    val email: String,
    @field:NotBlank
    val password: String,
) {
    fun toCustomerRequest(): CustomerRequestS {
        return CustomerRequestS(
            name = UUID.randomUUID().toString().substring(0, 12),
            password = this.password,
            email = this.email,
        )
    }
}

data class SignUpRequest(
    @field:NotBlank
    @field:Email
    val email: String,
    @field:NotBlank
    var password: String,
    val confirmPassword: String,
) {
    init {
        require(password == confirmPassword) { "동일한 비밀번호를 입력해주세요." }
        require(password.length > 7) { "비밀번호는 8글자 이상이어야 합니다." }
    }

    fun toCustomerRequest(): CustomerRequestS {
        return CustomerRequestS(
            name = UUID.randomUUID().toString().substring(0, 12),
            password = this.password,
            email = this.email,
        )
    }
}

data class EditPasswordRequest(
    @field:NotBlank
    @field:Length(min = 8, max = 16)
    var originalPassword: String,
    @field:NotBlank
    @field:Length(min = 8, max = 16)
    val editPassword: String,
) {
    init {
        require(originalPassword != editPassword) { "현재 비밀번호와 변경하려는 비밀번호가 일치합니다." }
    }

    fun toEditPasswordRequestS() =
        EditPasswordRequestS(
            originalPassword = originalPassword,
            editPassword = editPassword,
        )
}

data class EmailRequest(
    @field:NotBlank
    @field:Email
    val email: String,
)