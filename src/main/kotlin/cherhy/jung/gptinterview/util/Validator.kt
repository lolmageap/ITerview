package cherhy.jung.gptinterview.util

object Validator {

    fun validateJsonFormat(feedback: String): String =
        if (feedback.trim().endsWith("}")) {
            feedback
        } else if (feedback.trim().endsWith("\"\n")) {
            feedback.plus("}")
        } else if (feedback.trim().endsWith("\"")) {
            feedback.plus("}")
        } else {
            feedback.plus("\"}")
        }

}