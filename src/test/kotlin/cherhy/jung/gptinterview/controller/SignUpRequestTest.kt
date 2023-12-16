package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.SignUpRequest
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec

class SignUpRequestTest : StringSpec() {
    init {
        "회원이 입력한 비밀번호와 비밀번호 재입력이 서로 다르면 에러를 발생한다." {
            shouldThrow<IllegalArgumentException> {
                SignUpRequest(
                    email = "ekxk1234@naver.com",
                    password = "abcd1234",
                    confirmPassword = "test1234",
                )
            }
        }
    }
}
