package cherhy.jung.gptinterview.domain.question.vo

import java.time.ZonedDateTime

data class FeedbackResponseVo(
    val id: Long,
    val customerId: Long,
    val questionHistoryId: Long,
    val text: String,
    val token: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
) { companion object }