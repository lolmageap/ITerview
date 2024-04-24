package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import cherhy.jung.gptinterview.domain.question.vo.QuestionHistoryInfoVo
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

    // TODO: 이 부분을 수정 해야함. -> DTO 다른 거로 바꾸고 상태에 맞게 조회하자 (TODO LIST 참고)
    override fun findAllByCustomerId(customerId: Long, pageable: Pageable) =
        queryFactory.listQuery<QuestionHistoryInfoVo> {
            selectMulti(
                entity(Question::class),
                entity(QuestionHistory::class),
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

    override fun findByCustomerIdAndToken(customerId: Long, token: String) =
        queryFactory.selectQuery<QuestionHistoryInfoVo> {
            selectDistinctMulti(
                entity(Question::class),
                entity(QuestionHistory::class),
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