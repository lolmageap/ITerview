package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

@WriteService
class QuestionHistoryWriteService(
    private val questionHistoryWriteService: QuestionHistoryRepository,
) {
    fun addHistory(questionHistory: QuestionHistory) =
        questionHistoryWriteService.save(questionHistory)
}

