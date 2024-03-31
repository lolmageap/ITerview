package cherhy.jung.gptinterview.util

import java.time.ZonedDateTime
import java.util.*
import kotlin.random.Random

object Generator {
    fun token(): String {
        val now = ZonedDateTime.now().toLocalDate().toString().replace("-", "")
        val uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 12)
        return "$now-$uuid"
    }

    fun name() =
        UUID.randomUUID().toString().substring(0, 12)

    fun salt(): String =
        UUID.randomUUID()
            .toString()
            .replace("-", "")

    fun questionToGpt(question: String, answer: String): String =
        """
            아래는 개발자 기술 면접 질문이야.
            
            질문 : $question
            
            답안 : $answer
            
            답안에 대해 채점을 해서 점수를 매겨줘.
            점수는 100점이 가장 높은 점수고, 0점이 가장 낮은 점수야.
            답변을 대충하면 정말 적은 점수를 줘.
            개선해야할 부분을 상세하게 피드백을 해줘.
            그리고 아래 양식에 맞게 엄격하게 채점한 점수와 피드백을 작성해줘.
            
            {
                "score" : ,
                "feedback" : 
            }
        """.trimIndent()

    fun answerKeyToGpt(question: String): String =
        """
            질문 : $question
            
            위 질문은 개발자 면접 문제야.
            질문의 중요도는 100점이 가장 높은 점수고, 0점이 가장 낮은 점수야.
            위 질문에 대한 중요도 점수와 상세한 답안을 아래 양식에 맞게 작성해줘.
            
            {
                "score" : ,
                "answer" : 
            }
        """.trimIndent()

    fun randomPassword(): String =
        UUID.randomUUID()
            .toString()
            .replace("-", "")
            .substring(0, 10)
            .uppercase()

    fun certificate(): String =
        buildString {
            repeat(6) {
                append(
                    Random.nextInt(10).toString()
                )
            }
        }
}