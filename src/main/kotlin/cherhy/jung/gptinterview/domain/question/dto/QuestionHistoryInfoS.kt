package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class QuestionHistoryInfoS(
    val token: String,
    val question: String,
    val answer: String,
    val feedback: String,
    val type: QuestionType,
    val level: QuestionLevel,
    val createdAt: String,
    val modifiedAt: String,
) {
    companion object {
        fun of(responseR: QuestionHistoryInfoR): QuestionHistoryInfoS {
            return QuestionHistoryInfoS(
                token = responseR.token,
                question = responseR.question,
                answer = responseR.answer,
                feedback = responseR.feedback,
                type = responseR.type,
                level = responseR.level,
                createdAt = responseR.createdAt,
                modifiedAt = responseR.modifiedAt,
            )
        }
    }
}