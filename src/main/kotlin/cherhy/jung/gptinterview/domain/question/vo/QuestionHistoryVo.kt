package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.constant.*
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import java.time.ZonedDateTime

data class QuestionRequestVo(
    val questionTypes: List<QuestionType> = emptyList(),
    val programingTypes: List<ProgramingType> = emptyList(),
    val frameworkTypes: List<FrameworkType> = emptyList(),
    val levels: List<QuestionLevel> = emptyList(),
)

data class QuestionResponseVo(
    val id: Long,
    val token: String,
    val title: String,
    val type: QuestionType,
    val level: QuestionLevel,
) { companion object }

data class QuestionHistoryInfoVo(
    val id: Long,
    val questionToken: String,
    val question: String,
    val type: QuestionType,
    val level: QuestionLevel,

    val questionHistoryToken: String,
    val customerId: Long,
    val createdAt: ZonedDateTime,
    val modifiedAt: ZonedDateTime,
) {
    constructor(
        question: Question,
        questionHistory: QuestionHistory,
    ) : this(
        id = questionHistory.id,
        questionToken = question.token,
        question = question.title,
        type = question.questionType,
        level = question.level,

        questionHistoryToken = questionHistory.token,
        customerId = questionHistory.customerId,
        createdAt = questionHistory.createdAt,
        modifiedAt = questionHistory.updatedAt,
    )
}

data class QuestionHistoryResponseVo(
    val id: Long,
    val token: String,
    val question: String,
    val questionId: Long,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
) { companion object }

data class QuestionHistoryDetailResponseVo(
    val token: String,
    val historyType: HistoryType,
    val text: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
) { companion object }