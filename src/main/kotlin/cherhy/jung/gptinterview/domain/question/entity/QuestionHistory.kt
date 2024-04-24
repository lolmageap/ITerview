package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Entity

@Entity
class QuestionHistory private constructor(
    val questionId: Long,
    val customerId: Long,
    val text: String,
    val type: Type,
) : BaseEntity() {
    val token: String = Generator.token()

    companion object {
        fun of(
            questionId: Long,
            customerId: Long,
            type: Type,
            text: String,
        ) =
            QuestionHistory(
                questionId = questionId,
                customerId = customerId,
                type = type,
                text = text,
            )
    }
}

enum class Type {
    QUESTION,
    ANSWER,
    FEEDBACK,
}