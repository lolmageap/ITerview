package cherhy.jung.gptinterview.util

import cherhy.jung.gptinterview.exception.GptNotGeneratedException

object Validator {

    fun validateJsonFormat(feedback: String): String {
        val json = feedback.trim()

        if ( json.startsWith("{").not() ||
            json.contains("score").not() ) {
            throw GptNotGeneratedException()
        }
        
        return if (json.endsWith("}")) {
            json
        } else if (json.endsWith("\"\n")) {
            json.plus("}")
        } else if (json.endsWith("\"")) {
            json.plus("}")
        } else {
            json.plus("\"}")
        }
    }
        
}