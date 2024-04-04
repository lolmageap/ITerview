package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Entity

@Entity
class QuestionHistory private constructor(
    val questionId: Long,
    val customerId: Long,
    val answerId: Long,
) : BaseEntity() {
    val token: String = Generator.token()

    companion object {
        fun of(
            questionId: Long,
            customerId: Long,
            answerId: Long,
        ): QuestionHistory =
            QuestionHistory(questionId, customerId, answerId)
    }
}