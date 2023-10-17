package cherhy.jung.gptinterview.exception

import java.util.concurrent.ConcurrentHashMap

abstract class GlobalRuntimeException(message: String? = null) : RuntimeException() {


    private val validation: MutableMap<String, String> = ConcurrentHashMap()

    override val message: String? = message

    abstract val code: Int


    open fun addValidation(fieldName: String, message: String) {
        validation[fieldName] = message
    }

}