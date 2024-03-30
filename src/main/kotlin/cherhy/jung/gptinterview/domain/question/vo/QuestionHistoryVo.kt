package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
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
) {
    companion object {
        fun of(question: Question): QuestionResponseVo {
            return QuestionResponseVo(
                id = question.id,
                token = question.token,
                title = question.title,
                type = question.questionType,
                level = question.level,
            )
        }
    }
}

data class QuestionHistoryInfoVo(
    val id: Long,
    val questionToken: String,
    val question: String,
    val type: QuestionType,
    val level: QuestionLevel,

    val questionHistoryToken: String,
    val answer: String,
    val feedback: String,
    val customerId: Long,
    val createdAt: ZonedDateTime,
    val modifiedAt: ZonedDateTime,
)

data class QuestionHistoryResponseVo(
    val token: String,
    val questionId: Long,
    val answer: String,
    val feedback: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
) {
    companion object {
        fun of(questionHistory: QuestionHistory): QuestionHistoryResponseVo {
            return QuestionHistoryResponseVo(
                token = questionHistory.token,
                questionId = questionHistory.questionId,
                answer = questionHistory.answer,
                feedback = questionHistory.feedback,
                createdAt = questionHistory.createdAt,
                updatedAt = questionHistory.updatedAt,
            )
        }
    }
}