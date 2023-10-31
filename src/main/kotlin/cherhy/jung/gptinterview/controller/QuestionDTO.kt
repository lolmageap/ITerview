package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionRequestS
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS

data class QuestionRequest(
    val questionTypes: MutableList<QuestionType>,
    val programingTypes: MutableList<ProgramingType>,
    val frameworkTypes: MutableList<FrameworkType>,
)

fun QuestionRequest.toQuestionRequestS(): QuestionRequestS =
    // programingTypes 가 존재 하지 않을 때만 it == QuestionType.PROGRAMING
    // frameworkTypes 가 존재 하지 않을 때만 it == QuestionType.FRAMEWORK
    QuestionRequestS(
        questionTypes = questionTypes.filterNot {
            it == QuestionType.PROGRAMING || it == QuestionType.FRAMEWORK
        }.toMutableList(),
        programingTypes = programingTypes,
        frameworkTypes = frameworkTypes,
    )

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