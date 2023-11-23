package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryResponseS
import org.springframework.data.domain.Pageable

@ReadService
class QuestionHistoryReadService(
    private val questionHistoryRepository: QuestionHistoryRepository,
) {

    fun getAllQuestionHistories(customerId: Long, pageable: Pageable): List<QuestionHistoryResponseS> =
        questionHistoryRepository.findAllByCustomerId(customerId, pageable)
            .map(QuestionHistoryResponseS::of)

    fun getQuestionHistory(customerId: Long, token: String): QuestionHistoryResponseS =
        questionHistoryRepository.findByCustomerIdAndToken(customerId, token)
            .let(QuestionHistoryResponseS::of)

}

