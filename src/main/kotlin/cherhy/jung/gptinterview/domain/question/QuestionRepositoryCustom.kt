package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.entity.QFramework.*
import cherhy.jung.gptinterview.domain.question.entity.QPrograming.*
import cherhy.jung.gptinterview.domain.question.entity.QQuestion.question
import cherhy.jung.gptinterview.domain.question.entity.Question
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface QuestionRepositoryCustom {
    fun findByQuestionType(questionType: QuestionType, questionTokens: MutableList<String>): MutableList<Question>
    fun findByProgramingType(programingType: ProgramingType, questionTokens: MutableList<String>): MutableList<Question>
    fun findByFrameworkType(frameworkType: FrameworkType, questionTokens: MutableList<String>): MutableList<Question>
    fun findByTokensIn(questionTokens: MutableList<String>): List<Question>
}

class QuestionRepositoryCustomImpl : QuestionRepositoryCustom, QuerydslRepositorySupport(Question::class.java) {

    override fun findByQuestionType(
        questionType: QuestionType,
        questionTokens: MutableList<String>,
    ): MutableList<Question> =
        from(question)
            .where(
                question.questionType.eq(questionType),
                question.token.notIn(questionTokens),
            )
            .fetch()
            .also {
                it.shuffle()
            }


    override fun findByProgramingType(
        programingType: ProgramingType,
        questionTokens: MutableList<String>,
    ): MutableList<Question> =
        from(programing)
            .join(programing.question, question)
            .where(
                programing.programingType.eq(programingType),
                question.token.notIn(questionTokens),
            )
            .select(programing.question)
            .fetch()
            .also {
                it.shuffle()
            }


    override fun findByFrameworkType(
        frameworkType: FrameworkType,
        questionTokens: MutableList<String>,
    ): MutableList<Question> =
        from(framework)
            .join(framework.question, question)
            .where(
                framework.frameworkType.eq(frameworkType),
                question.token.notIn(questionTokens),
            )
            .select(question)
            .fetch()
            .also {
                it.shuffle()
            }

    override fun findByTokensIn(questionTokens: MutableList<String>): List<Question> =
        from(question)
            .where(
                question.token.`in`(questionTokens),
            )
            .fetch()
            .sortedBy {
                questionTokens.indexOf(it.token)
            }
            .reversed()

}