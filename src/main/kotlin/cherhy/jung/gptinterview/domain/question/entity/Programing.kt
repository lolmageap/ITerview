package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.BaseEntity
import jakarta.persistence.*

@Entity
class Programing(
    @Column(unique = true)
    val questionId: Long,

    @Enumerated(EnumType.STRING)
    val programingType: ProgramingType,
) : BaseEntity()