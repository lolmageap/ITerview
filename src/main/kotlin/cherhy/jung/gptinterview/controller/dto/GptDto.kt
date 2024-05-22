package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class GptRequest(
    val questionToken: String,
    val answer: String?,
)

data class GptReAnswerRequest(
    val feedbackToken: String,
    val answer: String,
)

data class AnswerResponse(
    val token: String,
    val question: String,
    val answer: String,
    val type: QuestionType,
    val level: QuestionLevel,
) { companion object }

data class GptResponse(
    val token: String,
    val body: String,
) { companion object }