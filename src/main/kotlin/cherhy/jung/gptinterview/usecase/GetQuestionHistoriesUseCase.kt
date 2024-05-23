package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.question.AnswerReadService
import cherhy.jung.gptinterview.domain.question.FeedbackReadService
import cherhy.jung.gptinterview.domain.question.QuestionHistoryReadService
import cherhy.jung.gptinterview.domain.question.vo.QuestionHistoryDetailResponseVo
import cherhy.jung.gptinterview.domain.question.vo.of

@UseCase
class GetQuestionHistoriesUseCase(
    private val answerReadService: AnswerReadService,
    private val questionHistoryReadService: QuestionHistoryReadService,
    private val feedbackReadService: FeedbackReadService,
) {
    fun execute(userId: Long, token: String): List<QuestionHistoryDetailResponseVo> {
        val questionHistory = questionHistoryReadService.getQuestionHistory(userId, token)
        val answers = answerReadService.getAnswers(questionHistory.id)
        val answerIds = answers.map { it.id }
        val feedbacks = feedbackReadService.getFeedbacks(answerIds)

        val answerCollection = answers.map(QuestionHistoryDetailResponseVo::of)
        val feedbackCollection = feedbacks.map(QuestionHistoryDetailResponseVo::of)

        val historyCollection = answerCollection + feedbackCollection
        return historyCollection.sortedBy { it.createdAt }
    }
}