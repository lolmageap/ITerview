package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.customer.dto.CustomerRequestVo
import cherhy.jung.gptinterview.domain.customer.dto.CustomerResponseVo
import cherhy.jung.gptinterview.domain.customer.dto.EditPasswordRequestVo
import cherhy.jung.gptinterview.extension.isNumber
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import org.hibernate.validator.constraints.Length
import java.util.*

data class SignInRequest(
    @field:Email
    @field:NotBlank
    val email: String,

    @field:NotBlank
    val password: String,
) {
    fun toCustomerRequest(): CustomerRequestVo {
        return CustomerRequestVo(
            name = UUID.randomUUID().toString().substring(0, 12),
            password = this.password,
            email = this.email,
        )
    }
}

data class SignUpRequest(
    @field:Email
    @field:NotBlank
    val email: String,

    @field:NotBlank
    @field:Length(min = 8, max = 16)
    @field:Pattern(regexp = "^[a-zA-Z0-9]+\$")
    val password: String,

    val confirmPassword: String,
) {
    init {
        require(password == confirmPassword) { "동일한 비밀번호 를 입력해주세요." }
    }

    fun toCustomerRequest(): CustomerRequestVo {
        return CustomerRequestVo(
            name = UUID.randomUUID().toString().substring(0, 12),
            password = this.password,
            email = this.email,
        )
    }
}

data class EditPasswordRequest(
    @field:NotBlank
    @field:Length(min = 8, max = 16)
    val originalPassword: String,

    @field:NotBlank
    @field:Length(min = 8, max = 16)
    val editPassword: String,
) {
    init {
        require(originalPassword != editPassword) { "현재 비밀번호 와 변경 하려는 비밀번호 가 일치 합니다." }
    }

    fun toEditPasswordRequestVo() =
        EditPasswordRequestVo(
            originalPassword = originalPassword,
            editPassword = editPassword,
        )
}

data class EmailRequest(
    @field:Email
    @field:NotBlank
    val email: String,
)

data class CertificateRequest(
    @field:Email
    @field:NotBlank
    val email: String,

    @field:NotBlank
    @field:Length(min = 6, max = 6)
    val certificate: String,
) {
    init {
        require(certificate.isNumber) { "인증번호는 숫자여야 합니다." }
    }
}

data class CustomerResponse(
    val name: String,
    val image: String,
    val email: String,
    val token: String,
) {
    companion object {
        fun of(response: CustomerResponseVo): CustomerResponse =
            CustomerResponse(
                name = response.name,
                image = "https://source.unsplash.com/random",
                email = response.email,
                token = response.token,
            )
    }
}