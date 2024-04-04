package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.vo.AnswerDetailResponseVo
import com.linecorp.kotlinjdsl.spring.data.SpringDataQueryFactory
import org.springframework.data.domain.Pageable

interface AnswerRepositoryCustom {
    fun findAllByCustomerId(userId: Long, pageable: Pageable): List<AnswerDetailResponseVo>
}

class AnswerRepositoryCustomImpl(
    private val queryFactory: SpringDataQueryFactory,
): AnswerRepositoryCustom {
    override fun findAllByCustomerId(userId: Long, pageable: Pageable) =
        TODO("Not yet implemented")
}