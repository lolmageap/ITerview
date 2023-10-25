package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class Question(
    val title: String,

    @Enumerated(EnumType.STRING)
    val questionType: QuestionType,

    val token: String,

    val level: Int,
) : BaseEntity() {

}