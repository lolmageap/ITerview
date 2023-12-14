package cherhy.jung.gptinterview.util

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

val HttpServletRequest.accessToken: String
    get() = "AccessToken"

val HttpServletRequest.refreshToken: String
    get() = "RefreshToken"

val HttpServletRequest.authorization: String
    get() = "Authorization"

val HttpServletResponse.accessToken: String
    get() = "AccessToken"

val HttpServletResponse.refreshToken: String
    get() = "RefreshToken"

val HttpServletResponse.authorization: String
    get() = "Authorization"

fun HttpServletResponse.addAccessTokenInHeader(value: String) =
    this.addHeader(accessToken, "Bearer $value")

fun HttpServletResponse.addRefreshTokenInHeader(value: String) =
    this.addHeader(refreshToken, "Bearer $value")