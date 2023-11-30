package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryResponseS
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

@WriteService
class QuestionHistoryWriteService(
    private val questionHistoryWriteService: QuestionHistoryRepository,
) {

    fun addHistory(questionHistory: QuestionHistory): QuestionHistoryResponseS =
        questionHistoryWriteService.save(questionHistory)
            .let(QuestionHistoryResponseS::of)

}

