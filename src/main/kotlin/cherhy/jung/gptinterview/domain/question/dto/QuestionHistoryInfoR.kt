package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class QuestionHistoryInfoR(
    val token: String,
    val question: String,
    val answer: String,
    val feedback: String,
    val type: QuestionType,
    val level: QuestionLevel,
    val createdAt: String,
    val modifiedAt: String,
)