package cherhy.jung.gptinterview.domain.question

enum class QuestionType(private val text: String) {
    DATABASE("데이터베이스"),
    NETWORK("네트워크"),
    DESIGN_PATTERN("디자인 패턴"),
    TEST("테스트"),
    OS("운영체제"),
    STRUCTURE("자료구조"),
    ALGORITHM("알고리즘"),
    PROGRAMING("프로그래밍"),
    FRAMEWORK("프레임워크"),
    VCS("형상관리"),
    HARDWARE("컴퓨터 구조"),
}