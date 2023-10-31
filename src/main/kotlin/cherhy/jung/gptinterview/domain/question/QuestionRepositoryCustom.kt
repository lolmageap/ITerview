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
        questionTokens: MutableList<String>
    ): MutableList<Question>

    fun findByTokensIn(questionTokens: MutableList<String>): List<Question>
}

class QuestionRepositoryCustomImpl : QuestionRepositoryCustom, QuerydslRepositorySupport(Question::class.java) {

    override fun findByQuestionRequestS(
        questionRequestS: QuestionRequestS,
        alreadyQuestion: MutableList<String>
    ): MutableList<Question> {
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
        alreadyQuestion: MutableList<String>,
        ): BooleanBuilder {
        val conditions = BooleanBuilder()

        questionTypeCheck(questionRequestS)?.let { conditions.or(it) }
        programingCheck(questionRequestS)?.let { conditions.or(it) }
        frameworkCheck(questionRequestS)?.let { conditions.or(it) }
        return conditions.and(question.token.notIn(alreadyQuestion))
    }

    private fun questionTypeCheck(questionRequestS: QuestionRequestS): BooleanExpression? {
        return if (questionRequestS.questionTypes.isNotEmpty()) {
            question.questionType.`in`(questionRequestS.questionTypes)
        }
        else null
    }

    private fun programingCheck(questionRequestS: QuestionRequestS): BooleanExpression? {
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

    private fun frameworkCheck(questionRequestS: QuestionRequestS): BooleanExpression? {
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


    override fun findByTokensIn(alreadyQuestion: MutableList<String>): List<Question> =
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