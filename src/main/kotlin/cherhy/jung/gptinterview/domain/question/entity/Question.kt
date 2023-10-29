package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class Question(
    val title: String,

    @Enumerated(EnumType.STRING)
    val questionType: QuestionType,

    @Column(unique = true)
    val token: String,

    val level: Int,
) : BaseEntity()