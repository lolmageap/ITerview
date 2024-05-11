package cherhy.jung.gptinterview.domain.customer.constant

import cherhy.jung.gptinterview.annotation.Description

enum class CustomerHistoryType {
    @Description("생성")
    CREATE,

    @Description("수정")
    UPDATE,

    @Description("삭제")
    DELETE,
}