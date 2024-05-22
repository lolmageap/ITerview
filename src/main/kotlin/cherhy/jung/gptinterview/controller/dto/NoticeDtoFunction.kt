package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.notice.vo.UpdateNoticeVo

fun UpdateNoticeRequest.toUpdateNoticeVo() =
    UpdateNoticeVo(
        title = title,
        content = content,
        category = category,
    )