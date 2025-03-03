package cherhy.jung.gptinterview.extension

import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.util.JwtKey.BEARER
import cherhy.jung.gptinterview.util.JwtKey.REFRESH_TOKEN
import jakarta.servlet.http.Cookie
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.apache.commons.lang3.NotImplementedException
import org.apache.http.HttpHeaders.AUTHORIZATION

val HttpServletRequest.accessToken: String?
    get() = this.getHeader(AUTHORIZATION)?.substringAfter(BEARER)

var HttpServletResponse.accessToken: String?
    get() = this.getHeader(AUTHORIZATION)?.substringAfter(BEARER)
    set(value) = this.addHeader(AUTHORIZATION, BEARER + value)

val HttpServletRequest.refreshToken: String
    get() = this.cookies.find { it.name == REFRESH_TOKEN }?.value
        ?: throw NotFoundException(MessageType.REFRESH_TOKEN)

var HttpServletResponse.refreshToken: String
    get() = String().also { throw NotImplementedException("This property is read-only.") }
    set(value) = this.addCookie(
        Cookie(REFRESH_TOKEN, value).apply {
            path = "/"
            isHttpOnly = true
            maxAge = 60 * 60 * 24 * 30
        }
    )

fun HttpServletResponse.removeRefreshToken() =
    this.addCookie(
        Cookie(REFRESH_TOKEN, "").apply {
            path = "/"
            isHttpOnly = true
            maxAge = 0
        }
    )

fun HttpServletResponse.removeAccessToken() = this.addHeader(AUTHORIZATION, "")
