package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.gpt.GptApi
import cherhy.jung.gptinterview.domain.question.QuestionHistoryWriteService
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryRequestS
import cherhy.jung.gptinterview.domain.question.dto.toQuestionHistory
import cherhy.jung.gptinterview.restcontroller.GptRequest
import cherhy.jung.gptinterview.util.Generator

@UseCase
class GptAnswerUseCase(
    private val gptApi: GptApi,
    private val customerReadService: CustomerReadService,
    private val questionReadService: QuestionReadService,
    private val questionHistoryWriteService: QuestionHistoryWriteService,
) {

    fun requestAnswerToGpt(customerId: Long, gptRequest: GptRequest): GptResponseS {
        val customer = customerReadService.getCustomerById(customerId)
        val question = questionReadService.getQuestionByToken(gptRequest.questionToken)
        val questionToGpt = Generator.generateQuestionToGpt(question.title, gptRequest.answer)
        val feedback = gptApi.generateText(questionToGpt)
        val questionHistory = QuestionHistoryRequestS.of(question.id, customer.id, feedback, gptRequest.answer)
        val history = questionHistoryWriteService.addHistory(questionHistory.toQuestionHistory())
        return GptResponseS(history.token, feedback)
    }

    fun requestOnlyAnswerKeyToGpt(customerId: Long, token: String): GptResponseS {
        val customer = customerReadService.getCustomerById(customerId)
        val question = questionReadService.getQuestionByToken(token)
        val questionToGpt = Generator.generateAnswerKeyToGpt(question.title)
        val feedback = gptApi.generateText(questionToGpt)
        val questionHistory = QuestionHistoryRequestS.of(question.id, customer.id, feedback)
        val history = questionHistoryWriteService.addHistory(questionHistory.toQuestionHistory())
        return GptResponseS(history.token, feedback)
    }

}