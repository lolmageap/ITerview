package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob

@Entity
class Feedback(
    val customerId: Long,
    val answerId: Long,
    val questionHistoryId: Long,

    @Lob
    @Column(columnDefinition = "TEXT")
    val text: String,
) : BaseEntity() {
    val token: String = Generator.token
    companion object {
        fun of(
            customerId: Long,
            questionHistoryId: Long,
            answerId: Long,
            feedback: String,
        ) =
            Feedback(
                customerId = customerId,
                questionHistoryId = questionHistoryId,
                answerId = answerId,
                text = feedback,
            )
    }
}