package cherhy.jung.gptinterview.domain.customer.constant

import cherhy.jung.gptinterview.annotation.Description

enum class CustomerRole {
    @Description("일반 회원")
    MEMBER,

    @Description("관리자")
    ADMIN,
    ;
}