package cherhy.jung.gptinterview.util

import org.hibernate.annotations.Where

@Where(clause = "deleted = false")
abstract class BaseDeleteEntity() : BaseEntity() {
    var deleted: Boolean = false
}
