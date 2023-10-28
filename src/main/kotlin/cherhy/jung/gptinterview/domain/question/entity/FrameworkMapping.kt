package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.ManyToOne

@Entity
class FrameworkMapping(

    @ManyToOne(fetch = FetchType.LAZY)
    val question: Question,

    @ManyToOne(fetch = FetchType.LAZY)
    val frameworkMapping: FrameworkMapping,

) : BaseEntity()