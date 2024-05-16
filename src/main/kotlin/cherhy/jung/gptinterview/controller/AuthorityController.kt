package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.*
import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.exception.ClientResponse
import cherhy.jung.gptinterview.extension.*
import cherhy.jung.gptinterview.external.cache.CacheReadService
import cherhy.jung.gptinterview.usecase.*
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
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
    private val resetPasswordUseCase: ResetPasswordUseCase,
    private val cacheReadService: CacheReadService,
    private val regenerateAccessTokenUseCase: RegenerateAccessTokenUseCase,
    private val customerReadService: CustomerReadService,
) {
    @ResponseStatus(CREATED)
    @PostMapping("/sign-in")
    @Operation(summary = "로그인", description = "로그인을 하고 토큰을 발급 받는다.")
    fun signIn(
        @Valid @RequestBody request: SignInRequest,
        httpServletResponse: HttpServletResponse,
    ) =
        signInUseCase.execute(request.toCustomerRequest()).let {
            httpServletResponse.addAccessTokenInHeader(it.accessToken)
            httpServletResponse.addRefreshTokenInCookie(it.refreshToken)
            ClientResponse.success<Unit>()
        }

    @ResponseStatus(CREATED)
    @PostMapping("/sign-up")
    @Operation(summary = "회원가입", description = "회원가입 을 하고 로그인 상태가 되며 토큰을 발급 받는다.")
    fun signUp(
        @Valid @RequestBody request: SignUpRequest,
        httpServletResponse: HttpServletResponse,
    ): ClientResponse<Unit> {
        val customer = request.toCustomerRequest()
        signUpUseCase.execute(customer)
        signInUseCase.execute(customer).let {
            httpServletResponse.addAccessTokenInHeader(it.accessToken)
            httpServletResponse.addRefreshTokenInCookie(it.refreshToken)
        }

        return ClientResponse.success()
    }

    @ResponseStatus(NO_CONTENT)
    @PostMapping("/sign-out")
    @Operation(summary = "로그 아웃", description = "access token 과 refresh token 을 header, cookie 에서 삭제 한다.")
    fun signOut(
        httpServletResponse: HttpServletResponse,
    ): ClientResponse<Unit> {
        httpServletResponse.removeAccessTokenInHeader()
        httpServletResponse.removeRefreshTokenInCookie()
        return ClientResponse.success()
    }

    @ResponseStatus(OK)
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
            ClientResponse.success<Unit>()
        }

    @ResponseStatus(CREATED)
    @PostMapping("/certificates")
    @Operation(summary = "이메일 로 인증 번호 전송", description = "이메일 로 인증 번호를 보내고 3분간 인증 번호를 저장 한다.")
    fun sendCertificate(@RequestBody @Valid emailRequest: EmailRequest) =
        sendMailUseCase.execute(emailRequest.email)
            .let(ClientResponse.Companion::success)

    @ResponseStatus(NO_CONTENT)
    @GetMapping("/certificates")
    @Operation(summary = "인증 번호를 검증 한다.", description = "이메일 로 발급 받은 인증번호 를 3분안에 검증 한다.")
    fun getCertificate(
        @RequestParam certificate: String,
        @RequestParam @Valid request: EmailRequest,
    ) =
        cacheReadService.checkCertificate(request.email, certificate)
            .let(ClientResponse.Companion::success)

    @ResponseStatus(NO_CONTENT)
    @PatchMapping("/passwords")
    @Operation(summary = "비밀번호 수정", description = "비밀번호 를 수정 하고 수정된 비밀번호 를 이메일 로 보내 준다.")
    fun editPassword(
        @RequestBody @Valid request: EditPasswordRequest,
        @AuthenticationPrincipal principal: Principal,
    ) =
        editPasswordUseCase.execute(
            principal.customerId,
            request.toEditPasswordRequestVo()
        ).let(ClientResponse.Companion::success)

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping("/passwords")
    @Operation(summary = "비밀번호 초기화", description = "비밀번호 를 초기화 하고 초기화 한 비밀번호 를 이메일 로 보내 준다.")
    fun resetPassword(
        @RequestBody @Valid request: CertificateRequest,
    ): ClientResponse<Unit> {
        cacheReadService.checkCertificate(request.email, request.certificate)
        resetPasswordUseCase.execute(request.email)
        return ClientResponse.success()
    }

    @ResponseStatus(OK)
    @GetMapping("/me")
    @Operation(summary = "내 정보", description = "내 정보를 조회 한다.")
    fun getMe(
        @AuthenticationPrincipal principal: Principal,
    ) = customerReadService.getCustomerById(principal.customerId)
        .let(CustomerResponse::of)
        .let(ClientResponse.Companion::success)
}