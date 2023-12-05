package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryInfoS
import cherhy.jung.gptinterview.domain.gpt.GptResponseS


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
        fun of(responseS: QuestionHistoryInfoS): AnswerResponse =
            AnswerResponse(
                token = responseS.token,
                question = responseS.question,
                answer = responseS.answer,
                feedback = responseS.feedback,
                type = responseS.type,
                level = responseS.level,
            )
    }
}

data class GptResponse(
    val token: String,
    val body: String,
) {
    companion object {
        fun of(responseS: GptResponseS): GptResponse =
            GptResponse(
                token = responseS.token,
                body = responseS.body,
            )
    }
}