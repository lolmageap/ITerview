package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob

@Entity
class ReQuestion(
    val answerId: Long,
    val customerId: Long,
    val questionId: Long,

    @Lob
    @Column(columnDefinition = "TEXT")
    val text: String,
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