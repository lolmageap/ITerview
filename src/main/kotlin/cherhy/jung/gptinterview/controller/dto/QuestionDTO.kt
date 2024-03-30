package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionRequestVo
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseVo

data class QuestionRequest(
    val questionTypes: List<QuestionType> = emptyList(),
    val programingTypes: List<ProgramingType> = emptyList(),
    val frameworkTypes: List<FrameworkType> = emptyList(),
    val levels: List<QuestionLevel> = emptyList(),
)

fun QuestionRequest.toQuestionRequestS(): QuestionRequestVo =
    QuestionRequestVo(
        questionTypes = questionTypes
            .filterNot {
                it == QuestionType.PROGRAMING
            }.filterNot {
                it == QuestionType.FRAMEWORK
            }.toList(),

        programingTypes = programingTypes,
        frameworkTypes = frameworkTypes,
        levels = levels,
    )

data class QuestionResponse(
    val token: String,
    val title: String,
    val type: QuestionType,
    val level: QuestionLevel,
) {

    companion object {
        fun of(questionResponseS: QuestionResponseVo): QuestionResponse {
            return QuestionResponse(
                token = questionResponseS.token,
                title = questionResponseS.title,
                type = questionResponseS.type,
                level = questionResponseS.level,
            )
        }
    }
}

data class QuestionAttributeResponse(
    val questionTypes: List<QuestionType>,
    val programingTypes: List<ProgramingType>,
    val frameworkTypes: List<FrameworkType>,
    val levels: List<QuestionLevel>,
) {
    companion object {
        fun of(
            questionTypes: List<QuestionType>,
            programingTypes: List<ProgramingType>,
            frameworkTypes: List<FrameworkType>,
            levels: List<QuestionLevel>,
        ): QuestionAttributeResponse {
            return QuestionAttributeResponse(
                questionTypes = questionTypes,
                programingTypes = programingTypes,
                frameworkTypes = frameworkTypes,
                levels = levels,
            )
        }
    }
}