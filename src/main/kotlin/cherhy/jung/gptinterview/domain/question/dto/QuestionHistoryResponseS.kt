package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

data class QuestionHistoryResponseS(
    val token: String,
    val questionId: Long,
    val answer: String,
    val feedback: String,
    val createdAt: String,
    val modifiedAt: String,
) {
    companion object {
        fun of(questionHistory: QuestionHistory): QuestionHistoryResponseS {
            return QuestionHistoryResponseS(
                token = questionHistory.token,
                questionId = questionHistory.questionId,
                answer = questionHistory.answer,
                feedback = questionHistory.feedback,
                createdAt = questionHistory.createdAt.toString(),
                modifiedAt = questionHistory.modifiedAt.toString(),
            )
        }
    }
}