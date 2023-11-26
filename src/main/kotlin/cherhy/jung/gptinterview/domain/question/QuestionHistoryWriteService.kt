package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

@WriteService
class QuestionHistoryWriteService(
    private val questionHistoryWriteService: QuestionHistoryRepository,
) {
    fun addHistory(
        questionId: Long,
        customerId: Long,
        feedback: String,
        answer: String = "정답을 가르쳐줘",
    ): String =
        questionHistoryWriteService.save(
            QuestionHistory(
                questionId = questionId,
                customerId = customerId,
                answer = answer,
                feedback = feedback,
            )
        ).token
}

