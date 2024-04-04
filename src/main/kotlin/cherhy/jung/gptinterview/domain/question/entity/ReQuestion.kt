package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Entity

@Entity
class ReQuestion(
    val answerId: Long,
    val customerId: Long,
    val questionId: Long,
    val reQuestion: String,
) : BaseEntity() {
    val token: String = Generator.token()
    companion object {
        fun of(
            answerId: Long,
            customerId: Long,
            questionId: Long,
            reQuestion: String,
        ) =
            ReQuestion(answerId, customerId, questionId, reQuestion)
    }
}