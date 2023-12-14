package cherhy.jung.gptinterview.util

import org.springframework.data.domain.Pageable

val Pageable.start: Long
    get() = -((this.pageNumber + 1) * this.pageSize).toLong() - 1

val Pageable.end: Long
    get() = -(this.pageNumber * this.pageSize).toLong() - 1

