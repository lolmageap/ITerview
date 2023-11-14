package cherhy.jung.gptinterview.restcontroller

import cherhy.jung.gptinterview.jwt.*
import cherhy.jung.gptinterview.usecase.SignInUseCase
import cherhy.jung.gptinterview.usecase.SignUpUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@Tag(name = "회원")
@RestController
@RequestMapping("/authority")
class AuthorityController(
    private val signInUseCase: SignInUseCase,
    private val signUpUseCase: SignUpUseCase,
) {

    @PostMapping("/sign-in")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "로그인", description = "로그인을 하고 토큰을 발급 받는다.")
    fun signIn(@Valid @RequestBody signInRequest: SignInRequest): TokenResponse =
        signInUseCase.signIn(signInRequest.toCustomerRequest())

    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "회원가입")
    fun signUp(@Valid @RequestBody signUpRequest: SignUpRequest): Unit =
        signUpUseCase.signUp(signUpRequest.toCustomerRequest())

    @PostMapping("/sign-out")
    fun signOut() {
    }

}