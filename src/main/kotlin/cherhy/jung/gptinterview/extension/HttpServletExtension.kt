package cherhy.jung.gptinterview.extension

import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import jakarta.servlet.http.Cookie
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.apache.commons.lang3.NotImplementedException

val HttpServletRequest.accessToken: String?
    get() = this.getHeader("Authorization")?.substringAfter("Bearer ")

var HttpServletResponse.accessToken: String?
    get() = this.getHeader("Authorization")?.substringAfter("Bearer ")
    set(value) = this.addHeader("Authorization", "Bearer $value")

val HttpServletRequest.refreshToken: String
    get() = this.cookies.find { it.name == "Refresh-Token" }?.value
        ?: throw NotFoundException(MessageType.REFRESH_TOKEN)

var HttpServletResponse.refreshToken: String
    get() = String().also { throw NotImplementedException("This property is read-only.") }
    set(value) = this.addCookie(
        Cookie("Refresh-Token", value).apply {
            path = "/"
            isHttpOnly = true
            maxAge = 60 * 60 * 24 * 30
        }
    )

fun HttpServletResponse.removeRefreshToken() =
    this.addCookie(
        Cookie("Refresh-Token", "").apply {
            path = "/"
            isHttpOnly = true
            maxAge = 0
        }
    )

fun HttpServletResponse.removeAccessToken() = this.addHeader("Authorization", "")
