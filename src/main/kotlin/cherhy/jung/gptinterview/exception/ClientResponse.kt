package cherhy.jung.gptinterview.exception

data class ClientResponse<T>(
    val message: String? = null,
    val value: T? = null,
) {
    companion object {
        fun <T> success(value: T?): ClientResponse<T> = ClientResponse(value = value)
        fun fail(message: String?): ClientResponse<Any> = ClientResponse(message = message)
    }
}