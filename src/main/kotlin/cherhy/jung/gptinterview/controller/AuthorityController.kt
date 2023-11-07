package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.jwt.*
import cherhy.jung.gptinterview.usecase.SignInUseCase
import cherhy.jung.gptinterview.usecase.SignUpUseCase
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/authority")
class AuthorityController(
    private val signInUseCase: SignInUseCase,
    private val signUpUseCase: SignUpUseCase,
) {

    @PostMapping("/sign-in")
    @ResponseStatus(HttpStatus.CREATED)
    fun signIn(@Valid @RequestBody signInRequest: SignInRequest): TokenResponse =
        signInUseCase.signIn(signInRequest.toCustomerRequest())

    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    fun signUp(@Valid @RequestBody signUpRequest: SignUpRequest): Unit =
        signUpUseCase.signUp(signUpRequest.toCustomerRequest())


    @PostMapping("/sign-out")
    fun signOut() {
    }

}