package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.exception.DomainName.*
import cherhy.jung.gptinterview.exception.NotFoundException

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
) {

    fun getQuestion(questionTokens: MutableList<String>): QuestionResponseS =
        questionRepository.findTopByRandom(questionTokens)
            ?.let(QuestionResponseS::of)
            ?: throw NotFoundException(QUESTION)

    fun getQuestion(questionType: QuestionType, questionTokens: MutableList<String>): QuestionResponseS =
        questionRepository.findByQuestionType(questionType, questionTokens)
            .firstNotNullOfOrNull {
                it.let(QuestionResponseS::of)
            }
            ?: throw NotFoundException(QUESTION)

    fun getQuestion(programingType: ProgramingType, questionTokens: MutableList<String>): QuestionResponseS =
        questionRepository.findByProgramingType(programingType, questionTokens)
            .firstNotNullOfOrNull {
                it.let(QuestionResponseS::of)
            }
            ?: throw NotFoundException(QUESTION)

    fun getQuestion(frameworkType: FrameworkType, questionTokens: MutableList<String>): QuestionResponseS =
        questionRepository.findByFrameworkType(frameworkType, questionTokens)
            .firstNotNullOfOrNull {
                it.let(QuestionResponseS::of)
            }
            ?: throw NotFoundException(QUESTION)

    fun getQuestionHistories(questionTokens: MutableList<String>): List<QuestionResponseS> =
        questionRepository.findByTokensIn(questionTokens)
            .map(QuestionResponseS::of)
}

