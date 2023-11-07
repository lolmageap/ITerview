package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity

@Entity
class QuestionHistory(

    val questionId: Long,

    val customerId: Long,

    ) : BaseEntity()