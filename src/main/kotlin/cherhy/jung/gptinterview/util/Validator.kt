package cherhy.jung.gptinterview.util

object Validator {

    fun validateJsonFormat(feedback: String): String =
        if (feedback.endsWith("}")) {
            feedback
        } else if (feedback.endsWith("\"\n") || feedback.endsWith("\"")) {
            feedback.plus("}")
        } else {
            feedback.plus("\"}")
        }

}