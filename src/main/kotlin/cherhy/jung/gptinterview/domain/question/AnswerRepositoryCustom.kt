package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Answer
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.vo.AnswerDetailResponseVo
import com.linecorp.kotlinjdsl.querydsl.expression.col
import com.linecorp.kotlinjdsl.spring.data.SpringDataQueryFactory
import com.linecorp.kotlinjdsl.spring.data.listQuery
import org.springframework.data.domain.Pageable

interface AnswerRepositoryCustom {
    fun findAllByCustomerId(userId: Long, pageable: Pageable): List<AnswerDetailResponseVo>
}

class AnswerRepositoryCustomImpl(
    private val queryFactory: SpringDataQueryFactory,
): AnswerRepositoryCustom {
    override fun findAllByCustomerId(userId: Long, pageable: Pageable) =
        queryFactory.listQuery<AnswerDetailResponseVo> {
            selectMulti(
                entity(Answer::class),
                entity(Question::class),
            )

            from(
                entity(Answer::class)
            )

            join(
                entity(Question::class),
                on {
                    col(Answer::questionId).equal(col(Question::id))
                }
            )

            where(
                col(Answer::customerId).equal(userId)
            )

            orderBy(
                col(Answer::createdAt).desc()
            )

            limit(pageable.pageSize)
            offset(pageable.offset.toInt())
        }
}