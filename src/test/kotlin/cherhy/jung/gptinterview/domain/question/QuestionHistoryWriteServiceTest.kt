package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionHistoryRequestS
import cherhy.jung.gptinterview.domain.question.entity.Question
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import io.kotest.core.test.isRootTest
import io.kotest.matchers.shouldNotBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class QuestionHistoryWriteServiceTest(
    @Autowired private val questionHistoryWriteService: QuestionHistoryWriteService,
    @Autowired private val customerRepository: CustomerRepository,
    @Autowired private val questionRepository: QuestionRepository,
    @Autowired private val questionHistoryRepository: QuestionHistoryRepository,
) : BehaviorSpec({

    Given("사용자와 질문, 답변, 질문 내역을 생성 한 뒤 ") {
        val customer = customerRepository.save(
            Customer(
                name = "정철희",
                email = "ekxk1234@naver.com",
                password = "abcd1234",
                salt = "random",
                token = "random",
            )
        )

        val question = questionRepository.save(
            Question(
                title = "SingleTon Pattern이 무엇인가요?",
                questionType = QuestionType.DESIGN_PATTERN,
                token = "random",
                level = QuestionLevel.LEVEL1,
            )
        )

        val answer = "어플리케이션 실행 시점부터 객체가 단 한개만 생성되고 값이 전역적으로 공유되는 패턴입니다."
        val feedback = "{ score: 100점, feedback: 완벽한 정답입니다.}"
        val historyRequest = QuestionHistoryRequestS.of(
            questionId = question.id,
            customerId = customer.id,
            answer = answer,
            feedback = feedback,
        )
        val history = historyRequest.toQuestionHistory()

        When("질문의 내역을 저장하고 ") {
            val addHistory = questionHistoryWriteService.addHistory(history)

            Then("반환된 토큰을 확인한다.") {
                addHistory shouldNotBe null
            }

        }
    }

}) {
    override suspend fun afterContainer(testCase: TestCase, result: TestResult) {
        if (testCase.isRootTest()) {
            customerRepository.deleteAllInBatch()
            questionRepository.deleteAllInBatch()
            questionHistoryRepository.deleteAllInBatch()
        }
    }
}
