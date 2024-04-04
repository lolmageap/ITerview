package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.vo.AnswerResponseVo
import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.data.domain.Pageable

@ReadService
class AnswerReadService(
    private val answerRepository: AnswerRepository,
) {
    fun getAnswers(userId: Long, pageable: Pageable) =
        answerRepository.findAllByCustomerId(userId, pageable)

    fun getAnswer(userId: Long, token: String) =
        answerRepository.findByCustomerIdAndToken(userId, token)
            ?.let(AnswerResponseVo::of)
            ?: throw NotFoundException(MessageType.ANSWER)
}