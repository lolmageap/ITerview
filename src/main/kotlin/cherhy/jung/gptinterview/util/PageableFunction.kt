package cherhy.jung.gptinterview.util

import org.springframework.data.domain.Pageable


fun Pageable.getStart(): Long = -((this.pageNumber + 1) * this.pageSize).toLong() - 1

fun Pageable.getEnd(): Long = -(this.pageNumber * this.pageSize).toLong() - 1

