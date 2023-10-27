package cherhy.jung.gptinterview.exception

import java.util.concurrent.ConcurrentHashMap

abstract class GlobalRuntimeException(
    message: String? = null,
    private val validation: MutableMap<String, String> = ConcurrentHashMap(),
) : RuntimeException() {

    override val message: String? = message

    open fun addValidation(fieldName: String, message: String) {
        validation[fieldName] = message
    }

}