package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryInfoS
import org.springframework.data.domain.Pageable

@ReadService
class QuestionHistoryReadService(
    private val questionHistoryRepository: QuestionHistoryRepository,
) {

    fun getAllQuestionHistories(customerId: Long, pageable: Pageable): List<QuestionHistoryInfoS> =
        questionHistoryRepository.findAllByCustomerId(customerId, pageable)
            .map(QuestionHistoryInfoS::of)

    fun getQuestionHistory(customerId: Long, token: String): QuestionHistoryInfoS =
        questionHistoryRepository.findByCustomerIdAndToken(customerId, token)
            .let(QuestionHistoryInfoS::of)

}

