package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity

@Entity
class ProgramingMapping(
    val questionId: Long,
    val programingMenuId: Long,
) : BaseEntity()