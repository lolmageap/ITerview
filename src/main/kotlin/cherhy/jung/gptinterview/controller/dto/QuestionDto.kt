package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.*
import cherhy.jung.gptinterview.domain.question.vo.QuestionHistoryDetailResponseVo
import cherhy.jung.gptinterview.domain.question.vo.QuestionRequestVo
import cherhy.jung.gptinterview.domain.question.vo.QuestionResponseVo
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.ZonedDateTime

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

data class QuestionHistoryDetailResponse(
    val token: String,
    val text: String,
    val historyType: HistoryType,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val createdAt: ZonedDateTime,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val updatedAt: ZonedDateTime,
) {
    companion object {
        fun of(
            response: QuestionHistoryDetailResponseVo
        ): QuestionHistoryDetailResponse {
            return QuestionHistoryDetailResponse(
                token = response.token,
                text = response.text,
                historyType = response.historyType,
                createdAt = response.createdAt,
                updatedAt = response.updatedAt,
            )
        }
    }
}