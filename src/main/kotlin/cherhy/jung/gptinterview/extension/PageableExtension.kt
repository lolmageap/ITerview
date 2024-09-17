package cherhy.jung.gptinterview.extension

import org.springframework.data.domain.Pageable

val Pageable.reversedOffset: Long
    get() = -((pageNumber + 1) * pageSize).toLong() - 1