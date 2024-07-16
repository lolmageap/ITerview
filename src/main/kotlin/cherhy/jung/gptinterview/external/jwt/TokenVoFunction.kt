package cherhy.jung.gptinterview.external.jwt

import java.util.*

fun TokenResponse.Companion.of(
    accessToken: String,
    accessTokenExpireTime: Date,
    refreshToken: String,
    refreshTokenExpireTime: Date,
    roles: List<String>,
    customerToken: String,
) =
    TokenResponse(
        accessToken = accessToken,
        accessTokenExpireTime = accessTokenExpireTime,
        refreshToken = refreshToken,
        refreshTokenExpireTime = refreshTokenExpireTime,
        roles = roles,
        customerToken = customerToken,
    )

fun TokenResponseVo.Companion.of(
    token: String,
    validity: Date,
) =
    TokenResponseVo(
        token = token,
        tokenExpireTime = validity,
    )