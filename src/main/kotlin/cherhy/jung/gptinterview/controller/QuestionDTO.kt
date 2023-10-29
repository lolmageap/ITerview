package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS

data class QuestionResponse(
    val token: String,
    val detail: String,
    val type: QuestionType,
    val level: Int,
) {
    companion object {
        fun of(questionResponseS: QuestionResponseS): QuestionResponse {
            return QuestionResponse(
                token = questionResponseS.token,
                detail = questionResponseS.detail,
                type = questionResponseS.type,
                level = questionResponseS.level,
            )
        }
    }
}