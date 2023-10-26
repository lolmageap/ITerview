package cherhy.jung.gptinterview.domain.question.constant

// 1:1 == Question : QuestionType, require
// N:M == QuestionType : DeveloperType
// QuestionType 을 고정 테이블로 빼는 것도 고민
enum class QuestionType() {
    DATABASE,
    NETWORK,
    DESIGN_PATTERN,
    TEST,
    OS,
    STRUCTURE,
    VCS,
    PROGRAMING,
    FRAMEWORK,
}
