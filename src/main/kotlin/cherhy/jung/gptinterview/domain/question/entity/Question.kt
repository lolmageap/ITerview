package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity

@Entity
class Question(
    val title: String,

    val questionMenuId: Long,

    val token: String,

    val level: Int,
) : BaseEntity() {

}