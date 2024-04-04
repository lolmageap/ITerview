package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob

@Entity
class Answer(
    val customerId: Long,
    val questionId: Long,

    @Lob
    @Column(columnDefinition = "TEXT")
    val feedback: String,

    @Lob
    @Column(columnDefinition = "TEXT")
    val answer: String,
) : BaseEntity() {
    val token: String = Generator.token()
    companion object {
        fun of(
            customerId: Long,
            questionId: Long,
            feedback: String,
            answer: String = DEFAULT_ANSWER,
        ) =
            Answer(customerId, questionId, feedback, answer)

        private const val DEFAULT_ANSWER = "정답을 가르쳐줘"
    }
}