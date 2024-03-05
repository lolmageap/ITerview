package cherhy.jung.gptinterview.domain.customer

enum class CustomerRole(private val text: String) {
    MEMBER("일반 회원"), ADMIN("관리자")
}