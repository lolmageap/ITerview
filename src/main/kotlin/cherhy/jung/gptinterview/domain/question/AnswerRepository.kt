package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Answer
import org.springframework.data.jpa.repository.JpaRepository

interface AnswerRepository: JpaRepository<Answer, Long>, AnswerRepositoryCustom {
    fun findByCustomerIdAndToken(userId: Long, token: String): Answer?
    fun findAllByQuestionHistoryId(questionHistoryId: Long): List<Answer>
}