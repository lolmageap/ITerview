package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.domain.customer.constant.Provider.*
import cherhy.jung.gptinterview.exception.ClientResponse
import cherhy.jung.gptinterview.extension.accessToken
import cherhy.jung.gptinterview.extension.refreshToken
import cherhy.jung.gptinterview.external.oauth2.OAuth2Client
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@Tag(name = "소셜 로그인")
@RestController
@RequestMapping("/authorities")
class Oauth2Controller(
    private val oauth2Client: OAuth2Client,
) {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/sign-in/{PROVIDER}")
    @Operation(summary = "소셜 로그인", description = "소셜 로그인을 하고 토큰을 발급 받는다.")
    fun signInByProvider(
        @PathVariable("PROVIDER") provider: Provider,
        @RequestBody code: String,
        httpServletRequest: HttpServletRequest,
        httpServletResponse: HttpServletResponse,
    ): ClientResponse<Unit> {
        val response = when (provider) {
            KAKAO -> oauth2Client.signInByKakao(code)
            GOOGLE -> oauth2Client.signInByGoogle(code)
            GITHUB -> oauth2Client.signInByGithub(code)
            NAVER -> oauth2Client.signInByNaver(code)
            LOCAL -> throw IllegalArgumentException("지원하지 않는 소셜 로그인입니다.")
        }

        httpServletResponse.accessToken = response.accessToken
        httpServletResponse.refreshToken = response.refreshToken
        return ClientResponse.success()
    }
}