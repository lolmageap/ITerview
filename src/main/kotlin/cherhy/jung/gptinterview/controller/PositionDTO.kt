package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.position.Position
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class PositionResponse(
    val questionTypes: List<QuestionType>,
    val frameworkTypes: List<FrameworkType>,
    val programingTypes: List<ProgramingType>,
) {
    companion object {
        fun of(position: Position): PositionResponse =
            PositionResponse(
                questionTypes = position.questionTypes,
                frameworkTypes = position.frameworkTypes,
                programingTypes = position.programingTypes,
            )
    }
}