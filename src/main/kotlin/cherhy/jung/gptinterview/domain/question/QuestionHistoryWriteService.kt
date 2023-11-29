package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryRequestS
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

@WriteService
class QuestionHistoryWriteService(
    private val questionHistoryWriteService: QuestionHistoryRepository,
) {
    fun addHistory(
        questionHistoryRequestS: QuestionHistoryRequestS,
    ): String =
        questionHistoryWriteService.save(
            QuestionHistory(
                questionId = questionHistoryRequestS.questionId,
                customerId = questionHistoryRequestS.customerId,
                answer = questionHistoryRequestS.feedback,
                feedback = questionHistoryRequestS.answer,
            )
        ).token
}

