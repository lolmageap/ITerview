package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.vo.AnswerDetailResponseVo
import cherhy.jung.gptinterview.external.gpt.GptResponseVo

data class GptRequest(
    val questionToken: String,
    val answer: String?,
)

data class AnswerResponse(
    val token: String,
    val question: String,
    val answer: String,
    val type: QuestionType,
    val level: QuestionLevel,
) {
    companion object {
        fun of(response: AnswerDetailResponseVo): AnswerResponse =
            AnswerResponse(
                token = response.token,
                question = response.question,
                answer = response.answer,
                type = response.type,
                level = response.level,
            )
    }
}

data class GptResponse(
    val token: String,
    val body: String,
) {
    companion object {
        fun of(responseVo: GptResponseVo): GptResponse =
            GptResponse(
                token = responseVo.token,
                body = responseVo.body,
            )
    }
}