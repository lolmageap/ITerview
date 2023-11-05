package cherhy.jung.gptinterview.util

import java.time.LocalDate
import java.util.*

object Generator {

    fun generateToken(): String {
        val now = LocalDate.now().toString().replace("-", "")
        val uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 12)
        return "$now-$uuid"
    }

    fun generateSalt(): String =
        UUID.randomUUID().toString().replace("-", "")


    fun generateQuestionToGpt(question: String, answer: String): String =
        """
            질문 : $question
            
            답안 : $answer
            
            위 질문과 답안에 대해 채점을 해서 점수를 매겨줘
            그리고 아래 양식에 맞게 점수와 피드백을 작성해줘
            
            양식 {
                점수 : 
                피드백 : 
            }
        """.trimIndent()


}