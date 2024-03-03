package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionRequestVo
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseVo
import cherhy.jung.gptinterview.exception.DomainName.QUESTION
import cherhy.jung.gptinterview.exception.NotFoundException

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
) {
    fun getQuestionByToken(token: String): QuestionResponseVo =
        questionRepository.findByToken(token)
            ?.let(QuestionResponseVo::of)
            ?: throw NotFoundException(QUESTION)

    fun getQuestion(
        questionRequestS: QuestionRequestVo,
        alreadyQuestions: List<String> = emptyList(),
    ): QuestionResponseVo =
        questionRepository.findByQuestionRequestS(questionRequestS, alreadyQuestions)
            .firstNotNullOfOrNull {
                it.let(QuestionResponseVo::of)
            }
            ?: throw NotFoundException(QUESTION)

    fun getQuestionHistories(alreadyQuestions: List<String>): List<QuestionResponseVo> =
        questionRepository.findByTokensIn(alreadyQuestions)
            .map(QuestionResponseVo::of)
}
