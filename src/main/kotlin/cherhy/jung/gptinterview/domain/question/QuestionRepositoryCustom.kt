package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.vo.QuestionRequestVo
import cherhy.jung.gptinterview.domain.question.entity.QFramework.framework
import cherhy.jung.gptinterview.domain.question.entity.QPrograming.programing
import cherhy.jung.gptinterview.domain.question.entity.QQuestion.question
import cherhy.jung.gptinterview.domain.question.entity.Question
import com.querydsl.core.BooleanBuilder
import com.querydsl.core.types.dsl.BooleanExpression
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

// TODO : 퇴근 하고 수정 하기
interface QuestionRepositoryCustom {
    fun findByQuestionRequestS(
        questionRequestS: QuestionRequestVo,
        questionTokens: List<String>,
    ): List<Question>

    fun findByTokensIn(questionTokens: List<String>): List<Question>
}

@Suppress("PARAMETER_NAME_CHANGED_ON_OVERRIDE")
class QuestionRepositoryCustomImpl : QuestionRepositoryCustom, QuerydslRepositorySupport(Question::class.java) {
    override fun findByQuestionRequestS(
        request: QuestionRequestVo,
        alreadyQuestion: List<String>,
    ): List<Question> {
        val query = from(question)

        return query
            .where(
                BooleanBuilder().let { condition ->
                    checkQuestionType(request)?.let { condition.or(it) }
                    checkPrograming(request)?.let { condition.or(it) }
                    checkFramework(request)?.let { condition.or(it) }
                    checkLevel(request)?.let { condition.and(it) }
                    condition.and(question.token.notIn(alreadyQuestion))
                }
            )
            .fetch()
            .also {
                it.shuffle()
            }
    }

    override fun findByTokensIn(alreadyQuestion: List<String>): List<Question> =
        from(question)
            .where(
                question.token.`in`(alreadyQuestion),
            )
            .fetch()
            .sortedBy {
                alreadyQuestion.indexOf(it.token)
            }
            .reversed()

    private fun checkLevel(request: QuestionRequestVo): BooleanExpression? {
        return if (request.levels.isNotEmpty()) {
            question.level.`in`(request.levels)
        } else null
    }

    private fun checkQuestionType(request: QuestionRequestVo): BooleanExpression? {
        return if (request.questionTypes.isNotEmpty()) {
            question.questionType.`in`(request.questionTypes)
        } else null
    }

    private fun checkPrograming(request: QuestionRequestVo): BooleanExpression? {
        return if (request.programingTypes.isNotEmpty()) {
            from(programing)
                .join(question)
                .on(programing.questionId.eq(question.id))
                .where(programing.programingType.`in`(request.programingTypes))
                .select(programing.questionId)
                .fetch()
                .let {
                    question.id.`in`(it)
                }
        } else null
    }

    private fun checkFramework(request: QuestionRequestVo): BooleanExpression? {
        return if (request.frameworkTypes.isNotEmpty()) {
            from(framework)
                .join(question)
                .on(framework.questionId.eq(question.id))
                .where(framework.frameworkType.`in`(request.frameworkTypes))
                .select(framework.questionId)
                .fetch()
                .let {
                    question.id.`in`(it)
                }
        } else null
    }
}