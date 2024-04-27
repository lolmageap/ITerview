package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Entity

@Entity
class QuestionHistory private constructor(
    val customerId: Long,
    val questionId: Long,
    val question: String,
) : BaseEntity() {
    val token: String = Generator.token()

    companion object {
        fun of(
            customerId: Long,
            questionId: Long,
            question: String,
        ) =
            QuestionHistory(
                customerId = customerId,
                questionId = questionId,
                question = question,
            )
    }
}