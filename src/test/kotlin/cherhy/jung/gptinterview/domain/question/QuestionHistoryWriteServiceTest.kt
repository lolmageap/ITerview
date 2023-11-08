package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.findByIdOrNull

@SpringBootTest
class QuestionHistoryWriteServiceTest(
    @Autowired private val customerRepository: CustomerRepository,
    @Autowired private val questionRepository: QuestionRepository,
    @Autowired private val questionHistoryWriteService: QuestionHistoryWriteService,
    @Autowired private val questionHistoryRepository: QuestionHistoryRepository,
) : BehaviorSpec({

    given("사용자와 질문, 답변, 질문 내역을 생성한다.") {
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

        val questionHistory = QuestionHistory(
                questionId = question.id,
                customerId = customer.id,
                answer = answer,
            )

        `when`("질문의 내역을 저장한다.") {
            val addHistory = questionHistoryWriteService.addHistory(questionHistory)
            val result = questionHistoryRepository.findByIdOrNull(addHistory.id)!!

            then("질문의 내역이 저장되었는지 확인한다.") {
                result.questionId shouldBe customer.id
                result.customerId shouldBe question.id
                result.answer shouldBe answer
            }

        }
    }

})
