package cherhy.jung.gptinterview.external.jwt

import java.util.*

data class TokenResponse(
    val accessToken: String,
    val accessTokenExpireTime: Date,
    val refreshToken: String,
    val refreshTokenExpireTime: Date,
    val roles: List<String>,
    val customerToken: String,
) { companion object }

data class TokenResponseVo(
    val token: String,
    val tokenExpireTime: Date,
) { companion object }