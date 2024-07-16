package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.controller.dto.GptReAnswerRequest
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.question.*
import cherhy.jung.gptinterview.domain.question.entity.Answer
import cherhy.jung.gptinterview.domain.question.entity.Feedback
import cherhy.jung.gptinterview.external.gpt.GptClient
import cherhy.jung.gptinterview.external.gpt.GptResponseVo
import cherhy.jung.gptinterview.external.gpt.of
import cherhy.jung.gptinterview.util.Generator

@UseCase
class RequestReAnswerToGptUseCase(
    private val gptClient: GptClient,
    private val questionHistoryReadService: QuestionHistoryReadService,
    private val customerReadService: CustomerReadService,
    private val feedbackReadService: FeedbackReadService,
    private val answerWriteService: AnswerWriteService,
    private val feedbackWriteService: FeedbackWriteService,
) {
    fun execute(customerId: Long, request: GptReAnswerRequest): GptResponseVo {
        val customer = customerReadService.getCustomerById(customerId)
        val feedback = feedbackReadService.getFeedbackByToken(request.feedbackToken)
        val history = questionHistoryReadService.getQuestionHistoryById(feedback.questionHistoryId)

        val questionToGpt = Generator.reAnswerToGpt(history.question, feedback.text, request.answer)

        val answer = Answer.of(customer.id, history.id, request.answer)
        val savedAnswer = answerWriteService.addAnswer(answer)

        val newFeedback = gptClient.requestAndReceiveFeedback(questionToGpt)

        val feedbackEntity = Feedback.of(customer.id, history.id, savedAnswer.id, newFeedback)
        feedbackWriteService.addFeedback(feedbackEntity)

        return GptResponseVo.of(feedback.token, newFeedback)
    }
}