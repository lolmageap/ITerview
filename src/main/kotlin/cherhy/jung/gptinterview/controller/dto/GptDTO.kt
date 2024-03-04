package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryInfoVo
import cherhy.jung.gptinterview.external.gpt.GptResponseVo

data class GptRequest(
    val questionToken: String,
    val answer: String,
)

data class AnswerResponse(
    val token: String,
    val question: String,
    val answer: String,
    val feedback: String,
    val type: QuestionType,
    val level: QuestionLevel,
) {
    companion object {
        fun of(questionHistoryInfoVo: QuestionHistoryInfoVo): AnswerResponse =
            AnswerResponse(
                token = questionHistoryInfoVo.questionHistoryToken,
                question = questionHistoryInfoVo.question,
                answer = questionHistoryInfoVo.answer,
                feedback = questionHistoryInfoVo.feedback,
                type = questionHistoryInfoVo.type,
                level = questionHistoryInfoVo.level,
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