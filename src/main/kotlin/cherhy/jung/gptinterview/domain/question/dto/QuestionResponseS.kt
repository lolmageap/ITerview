package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.entity.Question

data class QuestionResponseS(
    val token: String,
    val detail: String,
    val type: QuestionType,
    val level: QuestionLevel,
) {
    companion object {
        fun of(question: Question): QuestionResponseS {
            return QuestionResponseS(
                token = question.token,
                detail = question.title,
                type = question.questionType,
                level = question.level,
            )
        }
    }
}