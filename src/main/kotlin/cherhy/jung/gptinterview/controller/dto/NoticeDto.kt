package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.notice.Category

data class UpdateNoticeRequest(
    val title: String,
    val content: String,
    val category: Category,
)