package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.vo.QuestionHistoryInfoVo
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import com.linecorp.kotlinjdsl.querydsl.expression.col
import com.linecorp.kotlinjdsl.spring.data.SpringDataQueryFactory
import com.linecorp.kotlinjdsl.spring.data.listQuery
import com.linecorp.kotlinjdsl.spring.data.selectQuery
import org.springframework.data.domain.Pageable

interface QuestionHistoryRepositoryCustom {
    fun findAllByCustomerId(customerId: Long, pageable: Pageable): List<QuestionHistoryInfoVo>
    fun findByCustomerIdAndToken(customerId: Long, token: String): QuestionHistoryInfoVo
}

class QuestionHistoryRepositoryCustomImpl(
    private val queryFactory: SpringDataQueryFactory,
) : QuestionHistoryRepositoryCustom {

    override fun findAllByCustomerId(customerId: Long, pageable: Pageable): List<QuestionHistoryInfoVo> =

        queryFactory.listQuery<QuestionHistoryInfoVo> {
            selectMulti(
                col(Question::id),
                col(Question::token),
                col(Question::title),
                col(Question::questionType),
                col(Question::level),

                col(QuestionHistory::token),
                col(QuestionHistory::answer),
                col(QuestionHistory::feedback),
                col(QuestionHistory::customerId),
                col(QuestionHistory::createdAt),
                col(QuestionHistory::updatedAt),
            )

            from(
                entity(QuestionHistory::class)
            )

            join(
                entity(Question::class),
                on {
                    col(QuestionHistory::questionId).equal(col(Question::id))
                }
            )

            where(
                col(QuestionHistory::customerId).equal(customerId)
            )

            orderBy(
                col(QuestionHistory::createdAt).desc()
            )

            limit(pageable.pageSize)
            offset(pageable.offset.toInt())
        }

    override fun findByCustomerIdAndToken(customerId: Long, token: String): QuestionHistoryInfoVo =
        queryFactory.selectQuery<QuestionHistoryInfoVo> {
            selectDistinctMulti(
                col(Question::id),
                col(Question::token),
                col(Question::title),
                col(Question::questionType),
                col(Question::level),

                col(QuestionHistory::token),
                col(QuestionHistory::answer),
                col(QuestionHistory::feedback),
                col(QuestionHistory::customerId),
                col(QuestionHistory::createdAt),
                col(QuestionHistory::updatedAt),
            )

            from(
                entity(QuestionHistory::class)
            )

            join(
                entity(Question::class),
                on {
                    col(QuestionHistory::questionId).equal(col(Question::id))
                }
            )

            where(
                col(QuestionHistory::customerId).equal(customerId).and(
                    col(QuestionHistory::token).equal(token)
                )
            )
        }.singleResult

}