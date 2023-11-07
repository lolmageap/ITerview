package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.controller.GptRequest
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.gpt.GptApi
import cherhy.jung.gptinterview.domain.question.QuestionHistoryWriteService
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import cherhy.jung.gptinterview.util.Generator
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class GptAnswerUseCase(
    private val gptApi: GptApi,
    private val customerReadService: CustomerReadService,
    private val questionReadService: QuestionReadService,
    private val questionHistoryWriteService: QuestionHistoryWriteService,
) {

    fun requestAnswerToGpt(customerId: Long, gptRequest: GptRequest): String {
        val customer = customerReadService.getCustomerById(customerId)
        val question = questionReadService.getQuestionByToken(gptRequest.questionToken)

        val questionToGpt = Generator.generateQuestionToGpt(
            question = question.detail,
            answer = gptRequest.answer,
        )

        return gptApi.generateText(questionToGpt)
            .also {
                questionHistoryWriteService.addHistory(
                    QuestionHistory(question.id, customer.id)
                )
            }
    }

}