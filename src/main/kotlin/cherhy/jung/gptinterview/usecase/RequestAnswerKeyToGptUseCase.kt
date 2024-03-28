package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.external.gpt.GptClient
import cherhy.jung.gptinterview.external.gpt.GptResponseVo
import cherhy.jung.gptinterview.domain.question.QuestionHistoryWriteService
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import cherhy.jung.gptinterview.util.Generator

@UseCase
class RequestAnswerKeyToGptUseCase(
    private val gptClient: GptClient,
    private val customerReadService: CustomerReadService,
    private val questionReadService: QuestionReadService,
    private val questionHistoryWriteService: QuestionHistoryWriteService,
) {
    fun execute(customerId: Long, token: String): GptResponseVo {
        val customer = customerReadService.getCustomerById(customerId)
        val question = questionReadService.getQuestionByToken(token)

        val questionToGpt = Generator.answerKeyToGpt(question.title)

        val feedback = gptClient.requestAndReceiveFeedback(questionToGpt)

        val questionHistory = QuestionHistory.of(question.id, customer.id, feedback)
        val history = questionHistoryWriteService.addHistory(questionHistory)

        return GptResponseVo(history.token, feedback)
    }
}