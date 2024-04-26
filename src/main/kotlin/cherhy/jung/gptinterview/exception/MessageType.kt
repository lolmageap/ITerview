package cherhy.jung.gptinterview.exception

enum class MessageType(val value: String) {
    CUSTOMER("회원"),
    QUESTION("질문"),
    EMAIL("이메일"),
    CERTIFICATE_NUMBER("인증 번호"),
    REFRESH_TOKEN("리프레시 토큰"),
    ANSWER("답변"),
    FEEDBACK("피드백"),
}