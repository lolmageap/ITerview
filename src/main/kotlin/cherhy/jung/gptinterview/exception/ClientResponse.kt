package cherhy.jung.gptinterview.exception

data class ClientResponse<T>(
    val message: String? = null,
    val value: T? = null,
) {
    companion object {
        fun <T> success(value: T? = null) = ClientResponse(value = value)
        fun fail(message: String?): ClientResponse<Nothing> = ClientResponse(message = message)
    }
}