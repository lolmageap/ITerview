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
) {
    companion object {
        fun of(questionHistory: QuestionHistory): QuestionHistoryResponseVo {
            return QuestionHistoryResponseVo(
                id = questionHistory.id,
                token = questionHistory.token,
                question = questionHistory.text,
                questionId = questionHistory.questionId,
                createdAt = questionHistory.createdAt,
                updatedAt = questionHistory.updatedAt,
            )
        }
    }
}

data class QuestionHistoryDetailResponseVo(
    val token: String,
    val historyType: HistoryType,
    val text: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
) {
    companion object {
        fun of(answer: AnswerResponseVo) =
            QuestionHistoryDetailResponseVo(
                token = answer.token,
                historyType = HistoryType.ANSWER,
                text = answer.text,
                createdAt = answer.createdAt,
                updatedAt = answer.updatedAt,
            )

        fun of(feedback: FeedbackResponseVo) =
            QuestionHistoryDetailResponseVo(
                token = feedback.token,
                historyType = HistoryType.FEEDBACK,
                text = feedback.text,
                createdAt = feedback.createdAt,
                updatedAt = feedback.updatedAt,
            )
    }
}