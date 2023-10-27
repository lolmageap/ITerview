package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity

@Entity
class FrameworkMapping(
    val questionId: Long,
    val frameworkMenuId: Long,
) : BaseEntity()