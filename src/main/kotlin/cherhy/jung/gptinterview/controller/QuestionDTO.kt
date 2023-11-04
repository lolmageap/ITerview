package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionRequestS
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS

data class QuestionRequest(
    val questionTypes: List<QuestionType>,
    val programingTypes: List<ProgramingType>,
    val frameworkTypes: List<FrameworkType>,
    val levels: List<QuestionLevel>,
)

// programingTypes 가 존재 하지 않을 때만 it == QuestionType.PROGRAMING
// frameworkTypes 가 존재 하지 않을 때만 it == QuestionType.FRAMEWORK
fun QuestionRequest.toQuestionRequestS(): QuestionRequestS =
    QuestionRequestS(
        questionTypes = questionTypes.filterNot {
            it == QuestionType.PROGRAMING || it == QuestionType.FRAMEWORK
        }.toList(),
        programingTypes = programingTypes,
        frameworkTypes = frameworkTypes,
        levels = levels.map { it.level },
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