package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Question
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface QuestionHistoryRepositoryCustom {
    fun findByCustomerId(customerId: Long, pageable: Pageable)
}

class QuestionHistoryRepositoryCustomImpl : QuestionHistoryRepositoryCustom,
    QuerydslRepositorySupport(Question::class.java) {

    override fun findByCustomerId(customerId: Long, pageable: Pageable) {
//        findByCustomerIdOrderByCreatedAtDesc 처럼 동작하게!!
    }

}