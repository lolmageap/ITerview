package cherhy.jung.gptinterview.exception

abstract class GlobalRuntimeException(
    override val message: String? = null,
) : RuntimeException()