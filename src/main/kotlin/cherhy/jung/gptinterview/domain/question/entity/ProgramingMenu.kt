package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class ProgramingMenu(

    @Enumerated(EnumType.STRING)
    val programingType: ProgramingType,

) : BaseEntity()