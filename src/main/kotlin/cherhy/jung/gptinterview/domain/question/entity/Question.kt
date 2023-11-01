package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.*

@Entity
@Table(indexes = [
    Index(name = "IDX_QUESTION_TOKEN", columnList = "token", unique = true)
])
class Question(
    val title: String,

    @Enumerated(EnumType.STRING)
    val questionType: QuestionType,

    val token: String,

    val level: Int,
) : BaseEntity()