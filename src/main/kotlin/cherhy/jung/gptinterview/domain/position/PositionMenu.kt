package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class PositionMenu(
    @Enumerated(EnumType.STRING)
    val positionType: PositionType,
    id: Long = 0,
) : BaseEntity(id)