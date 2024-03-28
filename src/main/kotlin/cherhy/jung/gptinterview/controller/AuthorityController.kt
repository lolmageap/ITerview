package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.*
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.extension.*
import cherhy.jung.gptinterview.external.redis.RedisReadService
import cherhy.jung.gptinterview.usecase.*
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.NO_CONTENT
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
    private val resetPasswordUseCase: ResetPasswordUseCase,
    private val redisReadService: RedisReadService,
    private val regenerateAccessTokenUseCase: RegenerateAccessTokenUseCase,
) {
    @PostMapping("/sign-in")
    @ResponseStatus(CREATED)
    @Operation(summary = "로그인", description = "로그인을 하고 토큰을 발급 받는다.")
    fun signIn(
        @Valid @RequestBody request: SignInRequest,
        httpServletResponse: HttpServletResponse,
    ) =
        signInUseCase.execute(request.toCustomerRequest()).let {
            httpServletResponse.addAccessTokenInHeader(it.accessToken)
            httpServletResponse.addRefreshTokenInCookie(it.refreshToken)
        }

    @PostMapping("/sign-up")
    @ResponseStatus(CREATED)
    @Operation(summary = "회원가입", description = "회원가입 을 하고 로그인 상태가 되며 토큰을 발급 받는다.")
    fun signUp(
        @Valid @RequestBody request: SignUpRequest,
        httpServletResponse: HttpServletResponse,
    ) {
        signUpUseCase.execute(request.toCustomerRequest())
        signInUseCase.execute(request.toCustomerRequest()).let {
            httpServletResponse.addAccessTokenInHeader(it.accessToken)
            httpServletResponse.addRefreshTokenInCookie(it.refreshToken)
        }
    }

    @PostMapping("/sign-out")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "로그 아웃", description = "access token 과 refresh token 을 header, cookie 에서 삭제 한다.")
    fun signOut(
        httpServletResponse: HttpServletResponse,
    ) {
        httpServletResponse.removeAccessTokenInHeader()
        httpServletResponse.removeRefreshTokenInCookie()
    }

    @PostMapping("/access-tokens")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "성공"),
            ApiResponse(responseCode = "404", description = "엑세스 토큰이 헤더에 없음"),
            ApiResponse(responseCode = "500", description = "엑세스 토큰이 만료"),
        ]
    )
    @Operation(summary = "access token 재발급", description = "refresh token 을 넘기면 access token 을 반환 한다.")
    fun getAccessToken(
        httpServletRequest: HttpServletRequest,
        httpServletResponse: HttpServletResponse,
    ) =
        regenerateAccessTokenUseCase.execute(httpServletRequest.refreshToken).let {
            httpServletResponse.addAccessTokenInHeader(it.token)
        }

    @PostMapping("/certificates")
    @ResponseStatus(CREATED)
    @Operation(summary = "이메일 로 인증 번호 전송", description = "이메일 로 인증 번호를 보내고 3분간 인증 번호를 저장 한다.")
    fun sendCertificate(@RequestBody @Valid emailRequest: EmailRequest) =
        sendMailUseCase.execute(emailRequest.email)

    @GetMapping("/certificates")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "인증 번호를 검증 한다.", description = "이메일 로 발급 받은 인증번호 를 3분안에 검증 한다.")
    fun getCertificate(
        @RequestParam certificate: String,
        @RequestParam @Valid request: EmailRequest,
    ) =
        redisReadService.checkCertificate(request.email, certificate)

    @PatchMapping("/passwords")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "비밀번호 수정", description = "비밀번호 를 수정 하고 수정된 비밀번호 를 이메일 로 보내 준다.")
    fun editPassword(
        @RequestBody @Valid request: EditPasswordRequest,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ) =
        editPasswordUseCase.execute(
            authCustomer.id,
            request.toEditPasswordRequestVo()
        )

    @DeleteMapping("/passwords")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "비밀번호 초기화", description = "비밀번호 를 초기화 하고 초기화 한 비밀번호 를 이메일 로 보내 준다.")
    fun resetPassword(
        @RequestBody @Valid request: CertificateRequest,
    ) {
        redisReadService.checkCertificate(request.email, request.certificate)
        resetPasswordUseCase.execute(request.email)
    }
}