package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryInfoVo
import org.springframework.data.domain.Pageable

@ReadService
class QuestionHistoryReadService(
    private val questionHistoryRepository: QuestionHistoryRepository,
) {
    fun getAllQuestionHistories(customerId: Long, pageable: Pageable): List<QuestionHistoryInfoVo> =
        questionHistoryRepository.findAllByCustomerId(customerId, pageable)

    fun getQuestionHistory(customerId: Long, token: String): QuestionHistoryInfoVo =
        questionHistoryRepository.findByCustomerIdAndToken(customerId, token)
}

