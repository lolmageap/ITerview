package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.dto.QuestionRequestS
import cherhy.jung.gptinterview.domain.question.entity.QFramework.framework
import cherhy.jung.gptinterview.domain.question.entity.QPrograming.programing
import cherhy.jung.gptinterview.domain.question.entity.QQuestion.question
import cherhy.jung.gptinterview.domain.question.entity.Question
import com.querydsl.core.BooleanBuilder
import com.querydsl.core.types.dsl.BooleanExpression
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface QuestionRepositoryCustom {
    fun findByQuestionRequestS(
        questionRequestS: QuestionRequestS,
        questionTokens: List<String>
    ): List<Question>

    fun findByTokensIn(questionTokens: List<String>): List<Question>
}

class QuestionRepositoryCustomImpl : QuestionRepositoryCustom, QuerydslRepositorySupport(Question::class.java) {

    override fun findByQuestionRequestS(
        questionRequestS: QuestionRequestS,
        alreadyQuestion: List<String>
    ): List<Question> {
        val query = from(question)

        return query
            .where(
                conditionCheck(questionRequestS, alreadyQuestion)
            )
            .fetch()
            .also {
                it.shuffle()
            }
    }

    private fun conditionCheck(
        questionRequestS: QuestionRequestS,
        alreadyQuestion: List<String>,
        ): BooleanBuilder {

        return BooleanBuilder().let { condition ->
            checkQuestionType(questionRequestS)?.let { condition.or(it) }
            checkPrograming(questionRequestS)?.let { condition.or(it) }
            checkFramework(questionRequestS)?.let { condition.or(it) }
            checkLevel(questionRequestS)?.let { condition.and(it) }
            condition.and( question.token.notIn(alreadyQuestion) )
        }
    }

    private fun checkLevel(questionRequestS: QuestionRequestS): BooleanExpression? {
        return if (questionRequestS.levels.isNotEmpty()) {
            question.level.`in`(questionRequestS.levels)
        } else null
    }

    private fun checkQuestionType(questionRequestS: QuestionRequestS): BooleanExpression? {
        return if (questionRequestS.questionTypes.isNotEmpty()) {
            question.questionType.`in`(questionRequestS.questionTypes)
        } else null
    }

    private fun checkPrograming(questionRequestS: QuestionRequestS): BooleanExpression? {
        return if (questionRequestS.programingTypes.isNotEmpty()) {
             from(programing)
                .join(programing.question, question)
                .where(programing.programingType.`in`(questionRequestS.programingTypes))
                .select(programing.question.id)
                .fetch()
                .let {
                    question.id.`in`(it)
                }
        } else null
    }

    private fun checkFramework(questionRequestS: QuestionRequestS): BooleanExpression? {
        return if (questionRequestS.frameworkTypes.isNotEmpty()) {
            from(framework)
                .join(framework.question, question)
                .where(framework.frameworkType.`in`(questionRequestS.frameworkTypes))
                .select(framework.question.id)
                .fetch()
                .let {
                    question.id.`in`(it)
                }
        } else null
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

}