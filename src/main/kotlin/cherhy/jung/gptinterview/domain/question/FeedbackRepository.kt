package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Feedback
import org.springframework.data.jpa.repository.JpaRepository

interface FeedbackRepository: JpaRepository<Feedback, Long> {
    fun findAllByAnswerIdIn(
        answerIds: List<Long>,
    ): List<Feedback>
    fun findByToken(
        token: String,
    ): Feedback?
}