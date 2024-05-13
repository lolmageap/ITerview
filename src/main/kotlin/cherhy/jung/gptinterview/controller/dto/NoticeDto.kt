package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.notice.Category
import cherhy.jung.gptinterview.domain.notice.vo.UpdateNoticeVo

data class UpdateNoticeRequest(
    val title: String,
    val content: String,
    val category: Category,
) {
    fun toUpdateNoticeVo() =
        UpdateNoticeVo(
            title = title,
            content = content,
            category = category,
        )
}