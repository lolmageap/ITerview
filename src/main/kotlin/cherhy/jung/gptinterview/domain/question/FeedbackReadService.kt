package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.vo.FeedbackResponseVo
import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException

@WriteService
class FeedbackReadService(
    private val feedbackRepository: FeedbackRepository,
) {
    fun getFeedbacks(answerIds: List<Long>) =
        feedbackRepository.findAllByAnswerIdIn(answerIds)
            .map(FeedbackResponseVo::of)

    fun getFeedbackByToken(token: String) =
        feedbackRepository.findByToken(token)
            ?.let(FeedbackResponseVo::of)
            ?: throw NotFoundException(MessageType.FEEDBACK)
}