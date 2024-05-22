package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.vo.QuestionHistoryDetailResponseVo
import cherhy.jung.gptinterview.domain.question.vo.QuestionRequestVo
import cherhy.jung.gptinterview.domain.question.vo.QuestionResponseVo

fun QuestionRequest.toQuestionRequestVo() =
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

fun QuestionResponse.Companion.of(
    response: QuestionResponseVo,
) =
    with(response) {
        QuestionResponse(
            token = token,
            title = title,
            type = type,
            level = level,
        )
    }

fun QuestionAttributeResponse.Companion.of(
    questionTypes: List<QuestionType>,
    programingTypes: List<ProgramingType>,
    frameworkTypes: List<FrameworkType>,
    levels: List<QuestionLevel>,
) =
    QuestionAttributeResponse(
        questionTypes = questionTypes,
        programingTypes = programingTypes,
        frameworkTypes = frameworkTypes,
        levels = levels,
    )

fun QuestionHistoryDetailResponse.Companion.of(
    response: QuestionHistoryDetailResponseVo,
) =
    with(response) {
        QuestionHistoryDetailResponse(
            token = token,
            text = text,
            historyType = historyType,
            createdAt = createdAt,
            updatedAt = updatedAt,
        )
    }