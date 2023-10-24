package cherhy.jung.gptinterview.domain.question

enum class DeveloperType(private val text: String) {
    GAME("게임 개발"),
    DATA_ANALYSIS("데이터 분석가"),
    DATA_ENGINEER("데이터 엔지니어"),
    BACKEND("백엔드"),
    FRONTEND("프론트엔드"),
    SECURITY("정보보안"),
    ANDROID("앱개발"),
    WEB("웹개발"),
    PUBLISHER("퍼블리셔"),
    AI("인공지능"),
    BLOCKCHAIN("블록체인"),
    DBA("데이터베이스 관리자"),
}