package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.BaseEntity
import jakarta.persistence.*

@Entity
class Framework(

    @Column(unique = true)
    val questionId: Long,

    @Enumerated(EnumType.STRING)
    val frameworkType: FrameworkType,

) : BaseEntity()