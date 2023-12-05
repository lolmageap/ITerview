package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryInfoR
import cherhy.jung.gptinterview.domain.question.entity.QQuestion.question
import cherhy.jung.gptinterview.domain.question.entity.QQuestionHistory.questionHistory
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import com.querydsl.core.types.Projections
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface QuestionHistoryRepositoryCustom {
    fun findAllByCustomerId(customerId: Long, pageable: Pageable): List<QuestionHistoryInfoR>
    fun findByCustomerIdAndToken(customerId: Long, token: String): QuestionHistoryInfoR
}

class QuestionHistoryRepositoryCustomImpl : QuestionHistoryRepositoryCustom,
    QuerydslRepositorySupport(QuestionHistory::class.java) {

        // Projection을 위해서 사용한것 같네요.
        // 또 다른 문제로는 QuestionHisotry가 Question을 가지고 있지 않기에 id를 통한 조인을 넣은것 같구요.
        // 만약에 QuestionHistory가 Question을 연관관계를 가지고 있고, JPQL을 통해서 간단하게 처리하면 어떨까요?
        // 이 문제는 연관관계를 안갖으려고 하면서 들어온거 같네요.
        // 물론 그렇게 하신 이유는 알지만, 연관관계를 갖고있는 걸로 개발을 해보심이 객체지향이나 그런 개발을 공부하기엔 좋아보여요.
    override fun findAllByCustomerId(customerId: Long, pageable: Pageable): List<QuestionHistoryInfoR> =
        from(questionHistory)
            .select(
                Projections.constructor(
                    QuestionHistoryInfoR::class.java,
                    questionHistory.token,
                    question.title,
                    questionHistory.answer,
                    questionHistory.feedback,
                    question.questionType,
                    question.level,
                    question.createdAt,
                    question.modifiedAt,
                )
            )
            .join(question)
            .on(questionHistory.questionId.eq(question.id))
            .where(questionHistory.customerId.eq(customerId))
            .orderBy(questionHistory.createdAt.desc())
            .limit(pageable.pageSize.toLong())
            .offset(pageable.offset)
            .fetch()

    override fun findByCustomerIdAndToken(customerId: Long, token: String): QuestionHistoryInfoR =
        from(questionHistory)
            .select(
                Projections.constructor(
                    QuestionHistoryInfoR::class.java,
                    questionHistory.token,
                    question.title,
                    questionHistory.answer,
                    questionHistory.feedback,
                    question.questionType,
                    question.level,
                    question.createdAt,
                    question.modifiedAt,
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

