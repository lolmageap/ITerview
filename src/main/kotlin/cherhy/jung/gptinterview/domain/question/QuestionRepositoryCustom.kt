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
    fun findByQuestionType(questionType: QuestionType): MutableList<Question>
    fun findByProgramingType(programingType: ProgramingType): MutableList<Question>
    fun findByFrameworkType(frameworkType: FrameworkType): MutableList<Question>
}

class QuestionRepositoryCustomImpl: QuestionRepositoryCustom, QuerydslRepositorySupport(Question::class.java)  {

    override fun findByQuestionType(questionType: QuestionType): MutableList<Question> {
        return from(question)
            .where(
                question.questionType.eq(questionType)
            )
            .fetch()
            .also {
                it.shuffle()
            }
    }

    override fun findByProgramingType(programingType: ProgramingType): MutableList<Question> {
        return from(programing)
            .join(programing.question, question)
            .where(
                programing.programingType.eq(programingType)
            )
            .select(programing.question)
            .fetch()
            .also {
                it.shuffle()
            }
    }

    override fun findByFrameworkType(frameworkType: FrameworkType): MutableList<Question> {
        return from(framework)
            .join(framework.question, question)
            .where(
                framework.frameworkType.eq(frameworkType)
            )
            .select(question)
            .fetch()
            .also {
                it.shuffle()
            }
    }

}