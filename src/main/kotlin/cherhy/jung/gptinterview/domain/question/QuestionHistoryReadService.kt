package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService

@ReadService
class QuestionHistoryReadService(
    private val questionHistoryRepository: QuestionHistoryRepository,
) {

}

