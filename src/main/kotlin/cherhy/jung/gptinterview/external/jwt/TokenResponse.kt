package cherhy.jung.gptinterview.external.jwt

import java.util.*

data class AccessTokenResponse(
    val accessToken: String,
    val accessTokenExpireTime: Date,
) {
    companion object {
        fun of(tokenResponseS: TokenResponseS) =
            AccessTokenResponse(
                accessToken = tokenResponseS.token,
                accessTokenExpireTime = tokenResponseS.tokenExpireTime,
            )
    }
}

data class TokenResponse(
    val accessToken: String,
    val accessTokenExpireTime: Date,
    val refreshToken: String,
    val refreshTokenExpireTime: Date,
    val roles: List<String>,
    val customerToken: String,
)

data class TokenResponseS(
    val token: String,
    val tokenExpireTime: Date,
)