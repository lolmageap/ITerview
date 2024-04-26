package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.entity.Feedback
import java.time.ZonedDateTime

data class FeedbackResponseVo(
    val id: Long,
    val customerId: Long,
    val questionId: Long,
    val text: String,
    val token: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
) {
    companion object {
        fun of(
            feedback: Feedback,
        ) =
            FeedbackResponseVo(
                id = feedback.id,
                customerId = feedback.customerId,
                questionId = feedback.questionId,
                text = feedback.text,
                token = feedback.token,
                createdAt = feedback.createdAt,
                updatedAt = feedback.updatedAt,
            )
    }
}