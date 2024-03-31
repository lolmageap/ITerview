package cherhy.jung.gptinterview.extension

import com.fasterxml.jackson.databind.JsonNode

val JsonNode.id: String
    get() = this["id"].asText()

val JsonNode.kakaoImage: String
    get() = this["properties"]["profile_image"].asText()

val JsonNode.kakaoNickname: String
    get() = this["properties"]["nickname"].asText()