package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.gpt.GptApi
import cherhy.jung.gptinterview.domain.question.QuestionHistoryWriteService
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import cherhy.jung.gptinterview.restcontroller.GptRequest
import cherhy.jung.gptinterview.util.Generator
import cherhy.jung.gptinterview.util.Validator
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
            question = question.title,
            answer = gptRequest.answer,
        )

        return gptApi.generateText(questionToGpt)
            .let { feedback ->
                val modifiedFeedback = Validator.validateJsonFormat(feedback)

                questionHistoryWriteService.addHistory(
                    QuestionHistory(
                        questionId = question.id,
                        customerId = customer.id,
                        answer = gptRequest.answer,
                        feedback = modifiedFeedback,
                    )
                )
                modifiedFeedback
            }
    }

    fun requestOnlyAnswerKeyToGpt(customerId: Long, token: String): String {
        val customer = customerReadService.getCustomerById(customerId)
        val question = questionReadService.getQuestionByToken(token)

        val questionToGpt = Generator.generateAnswerKeyToGpt(question.title)

        return gptApi.generateText(questionToGpt)
            .let { feedback ->
                val modifiedFeedback = Validator.validateJsonFormat(feedback)

                questionHistoryWriteService.addHistory(
                    QuestionHistory(
                        questionId = question.id,
                        customerId = customer.id,
                        feedback = modifiedFeedback,
                    )
                )
                modifiedFeedback
            }
    }

}