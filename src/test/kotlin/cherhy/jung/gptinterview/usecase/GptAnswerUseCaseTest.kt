package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.controller.GptRequest
import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerResponseS
import cherhy.jung.gptinterview.domain.gpt.GptApi
import cherhy.jung.gptinterview.domain.question.QuestionHistoryWriteService
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import cherhy.jung.gptinterview.util.Generator
import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.string.shouldContain
import io.mockk.every
import io.mockk.verify
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class GptAnswerUseCaseTest(
    @Autowired private val gptAnswerUseCase: GptAnswerUseCase,

    @MockkBean private val gptApi: GptApi,
    @MockkBean private val customerReadService: CustomerReadService,
    @MockkBean private val questionReadService: QuestionReadService,
    @MockkBean private val questionHistoryWriteService: QuestionHistoryWriteService,
) : BehaviorSpec({

    given("회원이 질문과 답변을 요청하면 ") {
        val customer = Customer(
                name = "정철희",
                email = "ekxk1234@naver.com",
                password = "abcd1234",
                salt = "random",
                token = "random",
            )

        val question = Question(
                title = "SingleTon Pattern이 무엇인가요?",
                questionType = QuestionType.DESIGN_PATTERN,
                token = "random",
                level = QuestionLevel.LEVEL1,
            )

        val answer = "어플리케이션 실행 시점부터 객체가 단 한개만 생성되고 값이 전역적으로 공유되는 패턴입니다."
        val gptRequest = GptRequest(questionToken = question.token, answer = answer)
        val questionHistory = QuestionHistory(question.id, customer.id, answer)

        When("GPT가 채점과 피드백을 하고 ") {

            every { customerReadService.getCustomerById(customer.id) } returns CustomerResponseS.of(customer)
            every { questionReadService.getQuestionByToken(question.token) } returns QuestionResponseS.of(question)
            every { questionHistoryWriteService.addHistory(questionHistory) } returns questionHistory
            every {
                gptApi.generateText(
                    Generator.generateQuestionToGpt(question.title, answer)
                )
            } returns "점수 : 10, 피드백 : 완벽한 정답이기에 피드백 할 것이 없습니다."

            val feedBack = gptAnswerUseCase.requestAnswerToGpt(customerId = customer.id, gptRequest = gptRequest)

            then("점수와 피드백이 정상적으로 출력되는지 검증한다.") {

                feedBack shouldContain "점수"
                feedBack shouldContain "피드백"
                verify { customerReadService.getCustomerById(customer.id) }
                verify { questionReadService.getQuestionByToken(question.token) }
                verify {
                    questionHistoryWriteService.addHistory(questionHistory)
                }

            }
        }
    }

})
