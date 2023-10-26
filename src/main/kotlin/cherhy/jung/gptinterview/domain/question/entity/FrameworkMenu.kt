package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class FrameworkMenu(
    @Enumerated(EnumType.STRING)
    val frameworkType: FrameworkType,
) : BaseEntity()