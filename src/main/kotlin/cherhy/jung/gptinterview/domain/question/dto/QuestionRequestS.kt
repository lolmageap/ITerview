package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

data class QuestionRequestS(
    val questionTypes: MutableList<QuestionType>,
    val programingTypes: MutableList<ProgramingType>,
    val frameworkTypes: MutableList<FrameworkType>,
    val levels: MutableList<Int>,
)