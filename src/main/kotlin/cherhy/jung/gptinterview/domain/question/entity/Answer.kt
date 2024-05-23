package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob

@Entity
class Answer(
    val customerId: Long,
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
            answer: String?,
        ) =
            Answer(
                customerId = customerId,
                questionHistoryId = questionHistoryId,
                text = answer ?: DEFAULT_ANSWER,
            )

        private const val DEFAULT_ANSWER = "정답을 가르쳐줘"
    }
}