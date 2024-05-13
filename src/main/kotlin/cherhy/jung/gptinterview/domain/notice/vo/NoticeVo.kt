package cherhy.jung.gptinterview.domain.notice.vo

import cherhy.jung.gptinterview.domain.notice.Category

data class UpdateNoticeVo(
    val title: String,
    val content: String,
    val category: Category,
)