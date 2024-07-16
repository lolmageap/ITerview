package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.util.Generator

data class OauthRequest(
    val providerId: String,
    val provider: Provider,
) {
    val salt = Generator.salt
    companion object
}