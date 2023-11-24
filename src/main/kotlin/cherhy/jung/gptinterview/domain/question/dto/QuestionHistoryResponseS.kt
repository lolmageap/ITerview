package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class QuestionHistoryResponseS(
    val token: String,
    val question: String,
    val answer: String,
    val feedback: String,
    val type: QuestionType,
    val level: QuestionLevel,
) {
    companion object {
        fun of(responseR: QuestionHistoryResponseR): QuestionHistoryResponseS {
            return QuestionHistoryResponseS(
                token = responseR.token,
                question = responseR.question,
                answer = responseR.answer,
                feedback = responseR.feedback,
                type = responseR.type,
                level = responseR.level,
            )
        }
    }
}