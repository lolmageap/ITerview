package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class QuestionHistory private constructor(
    val customerId: Long,
    val questionId: Long,
    val text: String,
) : BaseEntity() {
    @Column(unique = true)
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
                text = question,
            )
    }
}