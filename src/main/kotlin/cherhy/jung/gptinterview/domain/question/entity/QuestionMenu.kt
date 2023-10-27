package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class QuestionMenu(

    val questionId: Long,

    @Enumerated(EnumType.STRING)
    val questionType: QuestionType,

) : BaseEntity()