package cherhy.jung.gptinterview.extension

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

val HttpServletRequest.refreshToken: String?
    get() = this.getHeader("refresh-token")

val HttpServletRequest.authorization: String?
    get() = this.getHeader("Authorization")

fun HttpServletResponse.addAccessTokenInHeader(value: String) =
    this.addHeader("access-token", "Bearer $value")

fun HttpServletResponse.addRefreshTokenInHeader(value: String) =
    this.addHeader("refresh-token", "Bearer $value")