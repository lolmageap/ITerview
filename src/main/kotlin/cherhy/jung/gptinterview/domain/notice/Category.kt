package cherhy.jung.gptinterview.domain.notice

import cherhy.jung.gptinterview.annotation.Description

enum class Category {
    @Description("공지")
    NOTICE,

    @Description("이벤트")
    EVENT,

    @Description("프로모션")
    PROMOTION,

    @Description("기타")
    ETC,
}