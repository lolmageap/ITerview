package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.domain.user.UserRequest
import java.util.UUID

data class SignInRequest(
    val email: String,
    val password: String,
)

fun SignInRequest.toUserRequest() : UserRequest {
    return UserRequest(
        name = UUID.randomUUID().toString().substring(0, 12),
        password = this.password,
        email = this.email,
    )
}

data class SignUpRequest(
    val email: String,
    var password: String,
    val confirmPassword: String,
) {
    init {
        require(password == confirmPassword) {"비밀번호 재입력 오류"}
    }
}

fun SignUpRequest.toUserRequest() : UserRequest {
    return UserRequest(
        name = UUID.randomUUID().toString().substring(0, 12),
        password = this.password,
        email = this.email,
    )
}