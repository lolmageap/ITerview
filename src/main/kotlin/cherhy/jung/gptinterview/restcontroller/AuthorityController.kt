package cherhy.jung.gptinterview.restcontroller

import cherhy.jung.gptinterview.domain.customer.AuthCustomer
import cherhy.jung.gptinterview.jwt.JwtFilter.Companion.AUTHORIZATION_HEADER
import cherhy.jung.gptinterview.jwt.TokenResponse
import cherhy.jung.gptinterview.redis.RedisReadService
import cherhy.jung.gptinterview.usecase.EditPasswordUseCase
import cherhy.jung.gptinterview.usecase.SendMailUseCase
import cherhy.jung.gptinterview.usecase.SignInUseCase
import cherhy.jung.gptinterview.usecase.SignUpUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.servlet.http.HttpServletResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@Tag(name = "회원")
@RestController
@RequestMapping("/authorities")
class AuthorityController(
    private val signInUseCase: SignInUseCase,
    private val signUpUseCase: SignUpUseCase,
    private val sendMailUseCase: SendMailUseCase,
    private val editPasswordUseCase: EditPasswordUseCase,
    private val redisReadService: RedisReadService,
) {

    @PostMapping("/sign-in")
    @ResponseStatus(CREATED)
    @Operation(summary = "로그인", description = "로그인을 하고 토큰을 발급 받는다.")
    fun signIn(
        @Valid @RequestBody signInRequest: SignInRequest,
        httpServletResponse: HttpServletResponse,
    ): TokenResponse =
        signInUseCase.signIn(signInRequest.toCustomerRequest()).also {
            httpServletResponse.addHeader(AUTHORIZATION_HEADER, "Bearer ${it.token}")
        }

    @PostMapping("/sign-up")
    @ResponseStatus(CREATED)
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

    // TODO : 이메일 양식 검사 로직 추가

    @PostMapping("/certificates")
    @ResponseStatus(CREATED)
    @Operation(summary = "이메일로 인증번호 전송", description = "이메일로 인증번호를 보내고 3분간 인증번호를 저장한다.")
    fun sendCertificate(@RequestBody email: String) {
        sendMailUseCase.sendCertificate(email)
    }

    @GetMapping("/certificates")
    @ResponseStatus(OK)
    @Operation(summary = "인증번호를 검증한다.", description = "이메일로 발급받은 인증번호를 3분안에 검증한다.")
    fun getCertificate(@RequestParam certificate: String, @RequestParam email: String) {
        redisReadService.checkCertificate(email, certificate)
    }


    @PatchMapping("/reset-password")
    @ResponseStatus(OK)
    @Operation(summary = "비밀번호 초기화", description = "비밀번호를 초기화하고 초기화한 비밀번호를 이메일로 보내준다.")
    fun resetPassword(@RequestParam certificate: String, @RequestParam email: String) {
        redisReadService.checkCertificate(email, certificate)
        val resetPassword = editPasswordUseCase.resetPassword(email)
        sendMailUseCase.sendResetPassword(email, resetPassword)
    }

    @PatchMapping("/password")
    @ResponseStatus(OK)
    @PreAuthorize("isAuthenticated()")
    @Operation(summary = "비밀번호 수정", description = "비밀번호를 수정하고 수정된 비밀번호를 이메일로 보내준다.")
    fun editPassword(
        @RequestBody editPasswordRequest: EditPasswordRequest,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ) =
        editPasswordUseCase.editPassword(authCustomer.customerId, editPasswordRequest.toEditPasswordRequestS())

}