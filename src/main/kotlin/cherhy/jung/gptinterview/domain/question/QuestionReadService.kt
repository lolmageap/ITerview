package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.vo.QuestionRequestVo
import cherhy.jung.gptinterview.domain.question.vo.QuestionResponseVo
import cherhy.jung.gptinterview.exception.MessageType.QUESTION
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.data.repository.findByIdOrNull

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
) {
    fun getQuestionByToken(token: String): QuestionResponseVo =
        questionRepository.findByToken(token)
            ?.let(QuestionResponseVo::of)
            ?: throw NotFoundException(QUESTION)

    fun getQuestion(
        request: QuestionRequestVo,
        alreadyQuestions: List<String> = emptyList(),
    ): QuestionResponseVo =
        questionRepository.findByQuestionRequestS(request, alreadyQuestions)
            .firstNotNullOfOrNull {
                it.let(QuestionResponseVo::of)
            }
            ?: throw NotFoundException(QUESTION)

    fun getQuestionHistories(alreadyQuestions: List<String>): List<QuestionResponseVo> =
        questionRepository.findByTokensIn(alreadyQuestions)
            .map(QuestionResponseVo::of)

    fun getQuestionById(id: Long) =
        questionRepository.findByIdOrNull(id)
            ?.let(QuestionResponseVo::of)
            ?: throw NotFoundException(QUESTION)
}
