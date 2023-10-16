package cherhy.jung.gptinterview.domain

import cherhy.jung.gptinterview.util.BaseEntity
import org.springframework.data.annotation.Id

class Question(
    @Id
    var id: Long = 0,
) : BaseEntity() {

}