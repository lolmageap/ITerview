package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.*
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.jwt.AccessTokenResponse
import cherhy.jung.gptinterview.jwt.TokenResponse
import cherhy.jung.gptinterview.redis.RedisReadService
import cherhy.jung.gptinterview.usecase.*
import cherhy.jung.gptinterview.util.addAccessTokenInHeader
import cherhy.jung.gptinterview.util.addRefreshTokenInHeader
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus.*
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
    private val regenerateAccessTokenUseCase: RegenerateAccessTokenUseCase,
) {

    @PostMapping("/sign-in")
    @ResponseStatus(CREATED)
    @Operation(summary = "로그인", description = "로그인을 하고 토큰을 발급 받는다.")
    fun signIn(
        @Valid @RequestBody signInRequest: SignInRequest,
        httpServletResponse: HttpServletResponse,
    ): TokenResponse =
        signInUseCase.signIn(signInRequest.toCustomerRequest()).also { tokenResponse ->
            httpServletResponse.addAccessTokenInHeader(tokenResponse.accessToken)
            httpServletResponse.addRefreshTokenInHeader(tokenResponse.refreshToken)
        }

    @PostMapping("/sign-up")
    @ResponseStatus(CREATED)
    @Operation(summary = "회원가입", description = "회원가입을 하고 로그인 상태가 되며 토큰을 발급 받는다.")
    fun signUp(
        @Valid @RequestBody signUpRequest: SignUpRequest,
        httpServletResponse: HttpServletResponse,
    ): TokenResponse {
        signUpUseCase.signUp(signUpRequest.toCustomerRequest())
        return signInUseCase.signIn(signUpRequest.toCustomerRequest()).also { tokenResponse ->
            httpServletResponse.addAccessTokenInHeader(tokenResponse.accessToken)
            httpServletResponse.addRefreshTokenInHeader(tokenResponse.refreshToken)
        }
    }

    @PostMapping("/access-tokens")
    @Operation(summary = "access token 재발급", description = "refresh token 을 넘기면 access token 을 반환한다.")
    fun getAccessToken(
        httpServletRequest: HttpServletRequest,
        httpServletResponse: HttpServletResponse,
    ) =
        regenerateAccessTokenUseCase.regenerateAccessToken(httpServletRequest)
            .let(AccessTokenResponse::of)

    @PostMapping("/certificates")
    @ResponseStatus(CREATED)
    @Operation(summary = "이메일로 인증번호 전송", description = "이메일로 인증번호를 보내고 3분간 인증번호를 저장한다.")
    fun sendCertificate(@RequestBody @Valid emailRequest: EmailRequest) =
        sendMailUseCase.sendCertificate(emailRequest.email)

    @GetMapping("/certificates")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "인증번호를 검증한다.", description = "이메일로 발급받은 인증번호를 3분안에 검증한다.")
    fun getCertificate(
        @RequestParam certificate: String,
        @RequestParam @Valid emailRequest: EmailRequest,
    ) =
        redisReadService.checkCertificate(emailRequest.email, certificate)


    @PatchMapping("/passwords")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "비밀번호 수정", description = "비밀번호를 수정하고 수정된 비밀번호를 이메일로 보내준다.")
    fun editPassword(
        @RequestBody editPasswordRequest: EditPasswordRequest,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ) =
        editPasswordUseCase.editPassword(
            authCustomer.customerId,
            editPasswordRequest.toEditPasswordRequestS()
        )

    @DeleteMapping("/passwords")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "비밀번호 초기화", description = "비밀번호를 초기화하고 초기화한 비밀번호를 이메일로 보내준다.")
    fun resetPassword(@RequestBody @Valid certificateRequest: CertificateRequest) {
        redisReadService.checkCertificate(certificateRequest.email, certificateRequest.certificate)
        editPasswordUseCase.resetAndSendPassword(certificateRequest.email)
    }

}