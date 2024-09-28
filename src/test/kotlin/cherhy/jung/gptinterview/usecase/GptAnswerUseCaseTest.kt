package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.controller.dto.GptReAnswerRequest
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.domain.customer.entity.Customer
import cherhy.jung.gptinterview.domain.customer.vo.CustomerResponseVo
import cherhy.jung.gptinterview.domain.customer.vo.of
import cherhy.jung.gptinterview.domain.question.*
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import cherhy.jung.gptinterview.domain.question.vo.QuestionHistoryResponseVo
import cherhy.jung.gptinterview.domain.question.vo.QuestionResponseVo
import cherhy.jung.gptinterview.domain.question.vo.of
import cherhy.jung.gptinterview.external.gpt.GptClient
import cherhy.jung.gptinterview.mysqlContainer
import cherhy.jung.gptinterview.util.Generator
import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.extensions.testcontainers.perSpec
import io.kotest.matchers.string.shouldContain
import io.mockk.every
import io.mockk.verify
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class GptAnswerUseCaseTest(
    @Autowired private val requestReAnswerToGptUseCase: RequestReAnswerToGptUseCase,
    @Autowired private val customerRepository: CustomerRepository,
    @Autowired private val questionRepository: QuestionRepository,
    @Autowired private val answerReadService: AnswerReadService,
    @Autowired private val feedbackReadService: FeedbackReadService,

    @MockkBean private val gptClient: GptClient,
    @MockkBean private val customerReadService: CustomerReadService,
    @MockkBean private val questionReadService: QuestionReadService,
    @MockkBean private val questionHistoryWriteService: QuestionHistoryWriteService,
) : BehaviorSpec({
    beforeTest {
        mysqlContainer.start()
        listener(mysqlContainer.perSpec())
    }

    Given("회원이 질문과 답변을 요청 하면 ") {
        val customer = customerRepository.save(
            Customer(
                name = "정철희",
                username = "ekxk1234@naver.com",
                salt = "random",
            )
        )

        val question = questionRepository.save(
            Question(
                title = "SingleTon Pattern 이 무엇 인가요?",
                questionType = QuestionType.DESIGN_PATTERN,
                level = QuestionLevel.LEVEL1,
            )
        )

        val answer = "application 실행 시점 부터 객체가 단 한개만 생성 되고 값이 전역적 으로 공유 되는 패턴 입니다."
        val feedback = "score : 10, feedback : 완벽한 정답 이기에 피드백 할 것이 없습니다."

        val questionHistory = QuestionHistory.of(question.id, customer.id, question.title)
        val historyResponse = QuestionHistoryResponseVo.of(questionHistory)

        val findAnswers = answerReadService.getAnswers(questionHistory.questionId)
        val latestAnswer = findAnswers.maxBy { it.createdAt }

        val findFeedback = feedbackReadService.getFeedback(latestAnswer.id)
        val reAnswerRequest = GptReAnswerRequest(feedbackToken = findFeedback.token, answer = latestAnswer.text)

        When("GPT 가 채점과 피드백을 하고 ") {

            every { customerReadService.getCustomerById(customer.id) } returns CustomerResponseVo.of(customer)
            every { questionReadService.getQuestionByToken(question.token) } returns QuestionResponseVo.of(question)
            every {
                gptClient.requestAndReceiveFeedback(
                    Generator.questionToGpt(question.title, answer)
                )
            } returns feedback
            every { questionHistoryWriteService.addHistory(questionHistory) } returns historyResponse

            val feedBack = requestReAnswerToGptUseCase.execute(customer.id, reAnswerRequest)

            Then("점수와 피드백 이 정상적 으로 출력 되는지 검증 한다.") {
                feedBack.body shouldContain "score"
                feedBack.body shouldContain "feedback"
                verify { customerReadService.getCustomerById(customer.id) }
                verify { questionReadService.getQuestionByToken(question.token) }
                verify {
                    questionHistoryWriteService.addHistory(questionHistory)
                }
            }
        }
    }
})
