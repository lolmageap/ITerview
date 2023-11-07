package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.position.Position
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class PositionResponse(
    val questionTypes: Set<QuestionType>,
    val frameworkTypes: Set<FrameworkType>,
    val programingTypes: Set<ProgramingType>,
    val levels: Set<QuestionLevel> = emptySet(),
) {
    companion object {
        fun of(positions: List<Position>): PositionResponse =
            PositionResponse(
                questionTypes = positions.flatMap { it.questionTypes }.toSet(),
                frameworkTypes = positions.flatMap { it.frameworkTypes }.toSet(),
                programingTypes = positions.flatMap { it.programingTypes }.toSet(),
            )
    }
}