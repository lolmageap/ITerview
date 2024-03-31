package cherhy.jung.gptinterview.extension

import com.fasterxml.jackson.databind.ObjectMapper

fun ObjectMapper.getAccessToken(body: String?): String {
    val node = this.readTree(body)
    return node["access_token"].asText()
}