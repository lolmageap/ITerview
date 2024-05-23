package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.QFramework.framework
import cherhy.jung.gptinterview.domain.question.entity.QPrograming.programing
import cherhy.jung.gptinterview.domain.question.entity.QQuestion.question
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.vo.QuestionRequestVo
import com.querydsl.core.BooleanBuilder
import com.querydsl.core.types.dsl.Expressions
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

// TODO : 퇴근 하고 수정 하기
interface QuestionRepositoryCustom {
    fun findAll(
        request: QuestionRequestVo,
        questionTokens: List<String>,
    ): List<Question>

    fun findByTokensIn(
        questionTokens: List<String>,
    ): List<Question>
}

class QuestionRepositoryCustomImpl : QuestionRepositoryCustom,
    QuerydslRepositorySupport(Question::class.java) {
    override fun findAll(
        request: QuestionRequestVo,
        questionTokens: List<String>,
    ): List<Question> = from(question)
        .where(
            BooleanBuilder().let { condition ->
                checkQuestionType(request)?.let { condition.or(it) }
                checkPrograming(request)?.let { condition.or(it) }
                checkFramework(request)?.let { condition.or(it) }
                checkLevel(request)?.let { condition.and(it) }
                condition.and(question.token.notIn(questionTokens))
            }
        )
        .fetch()
        .also {
            it.shuffle()
        }

    override fun findByTokensIn(
        questionTokens: List<String>,
    ) =
        from(question)
            .where(
                question.token.`in`(questionTokens),
            )
            .fetch()
            .sortedBy {
                questionTokens.indexOf(it.token)
            }
            .reversed()

    private fun checkLevel(
        request: QuestionRequestVo,
    ) =
        if (request.levels.isNotEmpty()) {
            question.level.`in`(request.levels)
        } else Expressions.TRUE

    private fun checkQuestionType(
        request: QuestionRequestVo,
    ) =
        if (request.questionTypes.isNotEmpty()) {
            question.questionType.`in`(request.questionTypes)
        } else Expressions.TRUE

    private fun checkPrograming(
        request: QuestionRequestVo,
    ) =
        if (request.programingTypes.isNotEmpty()) {
            from(programing)
                .join(question)
                .on(programing.questionId.eq(question.id))
                .where(programing.programingType.`in`(request.programingTypes))
                .select(programing.questionId)
                .fetch()
                .let {
                    question.id.`in`(it)
                }
        } else Expressions.TRUE

    private fun checkFramework(
        request: QuestionRequestVo,
    ) =
        if (request.frameworkTypes.isNotEmpty()) {
            from(framework)
                .join(question)
                .on(framework.questionId.eq(question.id))
                .where(framework.frameworkType.`in`(request.frameworkTypes))
                .select(framework.questionId)
                .fetch()
                .let {
                    question.id.`in`(it)
                }
        } else Expressions.TRUE
}