package cherhy.jung.gptinterview.util

import java.time.ZonedDateTime
import java.util.*
import kotlin.random.Random

object Generator {
    val token: String
        get() {
            val now = ZonedDateTime.now().toLocalDate().toString().replace("-", "")
            val uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 12)
            return "$now-$uuid"
        }

    val name
        get() =
            UUID.randomUUID().toString().substring(0, 12)

    val salt
        get() =
            UUID.randomUUID()
                .toString()
                .replace("-", "")

    val randomPassword
        get() =
            UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 10)
                .uppercase()

    val certificate
        get() =
            buildString {
                repeat(6) {
                    append(
                        Random.nextInt(10).toString()
                    )
                }
            }

    fun questionToGpt(
        question: String,
        answer: String?,
    ) =
        answer?.let {
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
        } ?: """
            질문 : $question
            
            위 질문은 개발자 면접 문제야.
            질문의 중요도는 100점이 가장 높은 점수고, 0점이 가장 낮은 점수야.
            위 질문에 대한 중요도 점수와 상세한 답안을 아래 양식에 맞게 작성해줘.
            
            {
                "score" : ,
                "feedback" : 
            }
        """.trimIndent()

    fun reAnswerToGpt(
        question: String,
        feedback: String,
        answer: String,
    ) =
        """
            아래는 개발자 기술 면접 질문에 대한 피드백이야.
            
            질문 : $question
            이전에 너가 해준 피드백 : $feedback
            
            너가 해준 피드백을 수용한 나의 답변이야.
            답변 : $answer
            
            점수는 100점이 가장 높은 점수고, 0점이 가장 낮은 점수야.
            답변에 대해 채점을 해서 점수를 매기고 피드백을 해줘.
            그리고 아래 양식에 맞게 엄격하게 채점한 점수와 피드백을 작성해줘.
            
            {
                "score" : ,
                "feedback" : 
            }
        """.trimIndent()
}