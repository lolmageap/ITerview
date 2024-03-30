package cherhy.jung.gptinterview.extension

import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import jakarta.servlet.http.Cookie
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import javax.security.sasl.AuthenticationException

val HttpServletRequest.refreshToken: String
    get() = this.cookies.find { it.name == "Refresh-Token" }
        ?.value?.substringAfter("Bearer ")
        ?: throw NotFoundException(MessageType.REFRESH_TOKEN)

val HttpServletRequest.authorization: String?
    get() = this.getHeader("Authorization")
        ?.substringAfter("Bearer ")

fun HttpServletResponse.addAccessTokenInHeader(value: String) =
    this.addHeader("Authorization", "Bearer $value")

fun HttpServletResponse.addRefreshTokenInCookie(value: String) =
    this.addCookie(
        Cookie("Refresh-Token", value).apply {
            path = "/"
            isHttpOnly = true
            maxAge = 60 * 60 * 24 * 30
        }
    )

fun HttpServletResponse.removeRefreshTokenInCookie() =
    this.addCookie(
        Cookie("Refresh-Token", "").apply {
            path = "/"
            isHttpOnly = true
            maxAge = 0
        }
    )

fun HttpServletResponse.removeAccessTokenInHeader() =
    this.addHeader("Authorization", "")