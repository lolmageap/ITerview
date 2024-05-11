package cherhy.jung.gptinterview.domain.customer.constant

import cherhy.jung.gptinterview.annotation.Description

enum class Provider {
    @Description("구글 로그인")
    GOOGLE,

    @Description("네이버 로그인")
    NAVER,

    @Description("카카오 로그인")
    KAKAO,

    @Description("깃허브 로그인")
    GITHUB,

    @Description("로컬 로그인")
    LOCAL,
    ;
}