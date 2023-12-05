package cherhy.jung.gptinterview.domain.customer

enum class CustomerRole(private val text: String) { // text는 현재 의미가 없군요~ val이나 var가 아니니까요~
    MEMBER("일반회원"), ADMIN("관리자")
}