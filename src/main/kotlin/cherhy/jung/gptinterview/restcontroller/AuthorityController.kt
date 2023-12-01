package cherhy.jung.gptinterview.restcontroller

import cherhy.jung.gptinterview.jwt.*
import cherhy.jung.gptinterview.jwt.JwtFilter.Companion.AUTHORIZATION_HEADER
import cherhy.jung.gptinterview.redis.RedisReadService
import cherhy.jung.gptinterview.usecase.SendMailUseCase
import cherhy.jung.gptinterview.usecase.SignInUseCase
import cherhy.jung.gptinterview.usecase.SignUpUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.servlet.http.HttpServletResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@Tag(name = "회원")
@RestController
@RequestMapping("/authorities")
class AuthorityController(
    private val signInUseCase: SignInUseCase,
    private val signUpUseCase: SignUpUseCase,
    private val sendMailUseCase: SendMailUseCase,
    private val redisReadService: RedisReadService,
) {

    @PostMapping("/sign-in")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "로그인", description = "로그인을 하고 토큰을 발급 받는다.")
    fun signIn(
        @Valid @RequestBody signInRequest: SignInRequest,
        httpServletResponse: HttpServletResponse,
    ): TokenResponse =
        signInUseCase.signIn(signInRequest.toCustomerRequest()).also {
            httpServletResponse.addHeader(AUTHORIZATION_HEADER, "Bearer ${it.token}")
        }

    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "회원가입", description = "회원가입을 하고 로그인 상태가 되며 토큰을 발급 받는다.")
    fun signUp(
        @Valid @RequestBody signUpRequest: SignUpRequest,
        httpServletResponse: HttpServletResponse,
    ): TokenResponse {
        signUpUseCase.signUp(signUpRequest.toCustomerRequest())
        return signInUseCase.signIn(signUpRequest.toCustomerRequest()).also {
            httpServletResponse.addHeader(AUTHORIZATION_HEADER, "Bearer ${it.token}")
        }
    }

    @PostMapping("/certificates")
    fun sendCertificate(@RequestBody email: String) {
        sendMailUseCase.sendCertificate(email)
    }

    @GetMapping("/certificates")
    fun getCertificate(@RequestParam certificate: String) {
        redisReadService.getCertificate(certificate)
    }

}