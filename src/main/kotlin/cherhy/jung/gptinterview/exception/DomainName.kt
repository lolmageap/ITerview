package cherhy.jung.gptinterview.exception

enum class DomainName(val value: String) {
    CUSTOMER("회원"),
    QUESTION("질문"),
    EMAIL("이메일"),
    CERTIFICATE_NUMBER("인증 번호"),
    REFRESH_TOKEN("리프레시 토큰"),
}