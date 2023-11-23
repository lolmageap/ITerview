package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryResponseR
import cherhy.jung.gptinterview.domain.question.entity.QQuestion.question
import cherhy.jung.gptinterview.domain.question.entity.QQuestionHistory.questionHistory
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import com.querydsl.core.types.Projections
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface QuestionHistoryRepositoryCustom {
    fun findAllByCustomerId(customerId: Long, pageable: Pageable): List<QuestionHistoryResponseR>
    fun findByCustomerIdAndToken(customerId: Long, token: String): QuestionHistoryResponseR
}

class QuestionHistoryRepositoryCustomImpl : QuestionHistoryRepositoryCustom,
    QuerydslRepositorySupport(QuestionHistory::class.java) {

    override fun findAllByCustomerId(customerId: Long, pageable: Pageable): List<QuestionHistoryResponseR> =
        from(questionHistory)
            .select(
                Projections.constructor(
                    QuestionHistoryResponseR::class.java,
                    questionHistory.token,
                    question.title,
                    questionHistory.answer,
                    questionHistory.feedback,
                    question.questionType,
                    question.level,
                )
            )
            .join(question)
            .on(questionHistory.questionId.eq(question.id))
            .where(questionHistory.customerId.eq(customerId))
            .orderBy(questionHistory.createdAt.desc())
            .limit(pageable.pageSize.toLong())
            .offset(pageable.offset)
            .fetch()

    override fun findByCustomerIdAndToken(customerId: Long, token: String): QuestionHistoryResponseR =
        from(questionHistory)
            .select(
                Projections.constructor(
                    QuestionHistoryResponseR::class.java,
                    questionHistory.token,
                    question.title,
                    questionHistory.answer,
                    questionHistory.feedback,
                    question.questionType,
                    question.level,
                )
            )
            .join(question)
            .on(questionHistory.questionId.eq(question.id))
            .where(
                questionHistory.customerId.eq(customerId),
                questionHistory.token.eq(token)
            )
            .fetchOne()

}

