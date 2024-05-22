package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.constant.*
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.ZonedDateTime

data class QuestionRequest(
    val questionTypes: List<QuestionType> = emptyList(),
    val programingTypes: List<ProgramingType> = emptyList(),
    val frameworkTypes: List<FrameworkType> = emptyList(),
    val levels: List<QuestionLevel> = emptyList(),
)

data class QuestionResponse(
    val token: String,
    val title: String,
    val type: QuestionType,
    val level: QuestionLevel,
) { companion object }

data class QuestionAttributeResponse(
    val questionTypes: List<QuestionType>,
    val programingTypes: List<ProgramingType>,
    val frameworkTypes: List<FrameworkType>,
    val levels: List<QuestionLevel>,
) { companion object }

data class QuestionHistoryDetailResponse(
    val token: String,
    val text: String,
    val historyType: HistoryType,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val createdAt: ZonedDateTime,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val updatedAt: ZonedDateTime,
) { companion object }