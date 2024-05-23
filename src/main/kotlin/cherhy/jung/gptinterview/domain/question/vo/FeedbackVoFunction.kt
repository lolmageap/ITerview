package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.entity.Feedback

fun FeedbackResponseVo.Companion.of(
    feedback: Feedback,
) =
    with(feedback) {
        FeedbackResponseVo(
            id = id,
            customerId = customerId,
            questionHistoryId = questionHistoryId,
            text = text,
            token = token,
            createdAt = createdAt,
            updatedAt = updatedAt,
        )
    }