package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.domain.question.entity.QuestionMenu
import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.ManyToOne

@Entity
class PositionMapping(

    @ManyToOne(fetch = FetchType.LAZY)
    val questionMenu: QuestionMenu,

    @ManyToOne(fetch = FetchType.LAZY)
    val positionMenu: PositionMenu,

) : BaseEntity()