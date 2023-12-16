package cherhy.jung.gptinterview.exception

enum class DomainName(val value: String) {
    CUSTOMER("회원"),
    QUESTION("질문"),
    EMAIL("이메일"),
    CERTIFICATE_NUMBER("인증번호"),
}