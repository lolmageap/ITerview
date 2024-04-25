package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.entity.Feedback

data class FeedbackResponseVo(
    val id: Long,
    val customerId: Long,
    val questionId: Long,
    val feedback: String,
    val token: String,
    val createdAt: String,
    val updatedAt: String,
) {
    companion object {
        fun of(
            feedback: Feedback,
        ) =
            FeedbackResponseVo(
                id = feedback.id,
                customerId = feedback.customerId,
                questionId = feedback.questionId,
                feedback = feedback.text,
                token = feedback.token,
                createdAt = feedback.createdAt.toString(),
                updatedAt = feedback.updatedAt.toString(),
            )
    }
}