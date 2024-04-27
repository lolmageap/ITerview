package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.vo.QuestionHistoryResponseVo
import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull

@ReadService
class QuestionHistoryReadService(
    private val questionHistoryRepository: QuestionHistoryRepository,
) {
    fun getAllQuestionHistories(customerId: Long, pageable: Pageable) =
        questionHistoryRepository.findAllByCustomerId(customerId, pageable)

    fun getQuestionHistory(customerId: Long, token: String) =
        questionHistoryRepository.findByCustomerIdAndToken(customerId, token)

    fun getQuestionHistoryById(questionHistoryId: Long) =
        questionHistoryRepository.findByIdOrNull(questionHistoryId)
            ?.let(QuestionHistoryResponseVo::of)
            ?: throw NotFoundException(MessageType.QUESTION_HISTORY)
}

