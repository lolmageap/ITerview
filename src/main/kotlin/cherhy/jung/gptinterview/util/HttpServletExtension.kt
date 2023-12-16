package cherhy.jung.gptinterview.util

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

val HttpServletRequest.refreshToken: String?
    get() = this.getHeader("Refresh-Token")

val HttpServletRequest.authorization: String?
    get() = this.getHeader("Authorization")

fun HttpServletResponse.addAccessTokenInHeader(value: String) =
    this.addHeader("Access-Token", "Bearer $value")

fun HttpServletResponse.addRefreshTokenInHeader(value: String) =
    this.addHeader("Refresh-Token", "Bearer $value")