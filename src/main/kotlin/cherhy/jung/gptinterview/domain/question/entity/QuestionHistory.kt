package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob

@Entity
class QuestionHistory(

    val questionId: Long,

    val customerId: Long,

    @Lob
    @Column(columnDefinition = "TEXT")
    val feedback: String,

    @Lob
    @Column(columnDefinition = "TEXT")
    val answer: String = DEFAULT_ANSWER,

) : BaseEntity() {
    val token: String = Generator.generateToken()

    companion object {
        private const val DEFAULT_ANSWER = "정답을 가르쳐줘"
    }
}
