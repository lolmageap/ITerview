package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.annotation.Description

enum class PositionType {
    @Description("게임 개발자")
    GAME,

    @Description("데이터 분석가")
    DATA_ANALYSIS,

    @Description("데이터 엔지니어")
    DATA_ENGINEER,

    @Description("백엔드 개발자")
    BACKEND,

    @Description("프론트엔드 개발자")
    FRONTEND,

    @Description("정보보안")
    SECURITY,

    @Description("안드로이드 개발자")
    ANDROID,

    @Description("IOS 개발자")
    IOS,

    @Description("AI 개발자")
    AI,

    @Description("블록체인 개발자")
    BLOCKCHAIN,

    @Description("DBA")
    DBA,
    ;
}