package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class PositionResponse(
    val questionTypes: Set<QuestionType>,
    val frameworkTypes: Set<FrameworkType>,
    val programingTypes: Set<ProgramingType>,
    val levels: Set<QuestionLevel> = emptySet(),
) { companion object }