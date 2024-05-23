package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.entity.Feedback
import cherhy.jung.gptinterview.domain.question.vo.FeedbackResponseVo
import cherhy.jung.gptinterview.domain.question.vo.of

@WriteService
class FeedbackWriteService(
    private val feedbackRepository: FeedbackRepository,
) {
    fun addFeedback(
        feedback: Feedback,
    ) =
        feedbackRepository.save(feedback)
            .let(FeedbackResponseVo::of)
}