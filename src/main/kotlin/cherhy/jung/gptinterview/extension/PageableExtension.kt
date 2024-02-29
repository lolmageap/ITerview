package cherhy.jung.gptinterview.extension

import org.springframework.data.domain.Pageable

val Pageable.start: Long
    get() = -((pageNumber + 1) * pageSize).toLong() - 1

val Pageable.end: Long
    get() = -(pageNumber * pageSize).toLong() - 1