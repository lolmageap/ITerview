package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionRequestS
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS
import cherhy.jung.gptinterview.exception.DomainName.QUESTION
import cherhy.jung.gptinterview.exception.NotFoundException

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
) {

    fun getQuestionByToken(token: String): QuestionResponseS =
        questionRepository.findByToken(token)
            ?.let(QuestionResponseS::of)
            ?: throw NotFoundException(QUESTION)

    fun getQuestion(
        questionRequestS: QuestionRequestS,
        alreadyQuestions: List<String> = emptyList(),
    ): QuestionResponseS =
        questionRepository.findByQuestionRequestS(questionRequestS, alreadyQuestions)
            .firstNotNullOfOrNull {
                it.let(QuestionResponseS::of)
            }
            ?: throw NotFoundException(QUESTION)

    fun getQuestionHistories(alreadyQuestions: List<String>): List<QuestionResponseS> =
        questionRepository.findByTokensIn(alreadyQuestions)
            .map(QuestionResponseS::of)
}
