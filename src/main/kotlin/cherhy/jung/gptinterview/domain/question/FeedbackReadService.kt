package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.vo.FeedbackResponseVo

@WriteService
class FeedbackReadService(
    private val feedbackRepository: FeedbackRepository,
) {
    fun getFeedbacks(answerIds: List<Long>) =
        feedbackRepository.findAllByAnswerIdIn(answerIds)
            .map(FeedbackResponseVo::of)
}