package cherhy.jung.gptinterview.exception

abstract class GlobalRuntimeException(
    message: String? = null,
) : RuntimeException() {
    override val message: String? = message
}