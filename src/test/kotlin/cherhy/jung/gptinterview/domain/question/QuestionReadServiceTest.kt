package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.customer.entity.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType.JAVA
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel.LEVEL1
import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel.LEVEL2
import cherhy.jung.gptinterview.domain.question.constant.QuestionType.DESIGN_PATTERN
import cherhy.jung.gptinterview.domain.question.constant.QuestionType.PROGRAMING
import cherhy.jung.gptinterview.domain.question.vo.QuestionRequestVo
import cherhy.jung.gptinterview.domain.question.entity.Programing
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.exception.NotFoundException
import cherhy.jung.gptinterview.mysqlContainer
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import io.kotest.core.test.isRootTest
import io.kotest.extensions.testcontainers.perSpec
import io.kotest.matchers.collections.shouldBeOneOf
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class QuestionReadServiceTest(
    @Autowired private val questionReadService: QuestionReadService,
    @Autowired private val questionRepository: QuestionRepository,
    @Autowired private val customerRepository: CustomerRepository,
    @Autowired private val programingRepository: ProgramingRepository,
) : BehaviorSpec({
    beforeTest {
        mysqlContainer.start()
        listener(mysqlContainer.perSpec())
    }

    Given("회원과 질문이 존재하고 ") {

        customerRepository.save(
            Customer(
                name = "정철희",
                username = "ekxk1234@naver.com",
                salt = "random",
            )
        )

        val question = questionRepository.save(
            Question(
                title = "SingleTon Pattern이 무엇인가요?",
                questionType = DESIGN_PATTERN,
                level = LEVEL1,
            )
        )

        When("사용자가 정상적인 키(토큰)로 조회를 시도하면 ") {
            val findQuestion = questionReadService.getQuestionByToken(question.token)
            then("질문이 조회 된다.") {
                findQuestion shouldNotBe null
                findQuestion.title shouldBe question.title
                findQuestion.type shouldBe question.questionType
                findQuestion.level shouldBe question.level
            }
        }

        When("사용자가 잘못된 키(토큰)로 조회를 시도하면 ") {
            then("NotFoundException 이 발생한다.") {
                shouldThrow<NotFoundException> { questionReadService.getQuestionByToken("fail-token") }
            }
        }
    }

    Given("회원과 질문들이 존재하고 ") {

        customerRepository.save(
            Customer(
                name = "정철희2",
                username = "ekxk1234@gamil.com",
                salt = "random",
            )
        )

        val question1 = Question(
            title = "SingleTon Pattern이 무엇인가요?",
            questionType = DESIGN_PATTERN,
            level = LEVEL1,
        )

        val question2 = Question(
            title = "Java 가상 머신(JVM)이란 무엇인가요?",
            questionType = PROGRAMING,
            level = LEVEL2,
        )

        val question3 = Question(
            title = "Java의 가비지 컬렉션(garbage collection)이란 무엇인가요?",
            questionType = PROGRAMING,
            level = LEVEL2,
        )

        questionRepository.saveAll(
            listOf(question1, question2, question3)
        )

        val programing1 = Programing(question2.id, JAVA)
        val programing2 = Programing(question3.id, JAVA)

        programingRepository.saveAll(
            listOf(programing1, programing2)
        )

        When("사용자가 질문의 타입을 선택하지 않은 뒤 요청하면 ") {
            val questionRequest = QuestionRequestVo()
            val question = questionReadService.getQuestion(questionRequest)

            then("전체에서 질문을 랜덤으로 한개 출력한다.") {
                question shouldNotBe null
                question.type shouldBeOneOf listOf(PROGRAMING, DESIGN_PATTERN)
                question.level shouldBeOneOf listOf(LEVEL1, LEVEL2)
            }
        }

        When("사용자가 DESIGN_PATTERN 과 JAVA 를 선택한 뒤 요청하면") {
            val questionRequest = QuestionRequestVo(listOf(DESIGN_PATTERN), listOf(JAVA))
            val question = questionReadService.getQuestion(questionRequest)

            then("DESIGN_PATTERN 과 JAVA 에서 질문을 랜덤으로 한개 출력한다.") {
                question shouldNotBe null
                question.type shouldBeOneOf listOf(PROGRAMING, DESIGN_PATTERN)
            }
        }

        When("사용자가 DESIGN_PATTERN 을 선택한뒤 요청하면 ") {
            val questionRequest = QuestionRequestVo(questionTypes = listOf(DESIGN_PATTERN))
            val question = questionReadService.getQuestion(questionRequest)

            then("질문의 타입이 DESIGN_PATTERN 인 질문을 출력한다.") {
                question shouldNotBe null
                question.type shouldBe DESIGN_PATTERN
                question.level shouldBe LEVEL1
            }
        }

        When("사용자가 JAVA 를 선택한뒤 요청하면 ") {
            val questionRequest = QuestionRequestVo(programingTypes = listOf(JAVA))
            val question = questionReadService.getQuestion(questionRequest)

            then("질문의 타입이 JAVA 인 질문을 출력한다.") {
                question shouldNotBe null
                question.type shouldBe PROGRAMING
                question.level shouldBe LEVEL2
            }
        }

        When("사용자가 이전에 봤던 질문만 존재한다면 ") {
            val questionRequest = QuestionRequestVo()
            val alreadyQuestions = listOf(question1.token, question2.token, question3.token)

            then("더 이상 출력될 질문이 없기에 NotFoundException 이 발생한다.") {
                shouldThrow<NotFoundException> { questionReadService.getQuestion(questionRequest, alreadyQuestions) }
            }
        }

        When("사용자가 이전에 봤던 질문만 존재한다면 ") {
            val alreadyQuestions = listOf(question1.token, question2.token, question3.token)
            val histories = questionReadService.getQuestionHistories(alreadyQuestions)

            then("질문들을 모두 조회 한다.") {
                histories.size shouldBe 3
            }
        }
    }

}) {
    override suspend fun afterContainer(testCase: TestCase, result: TestResult) {
        if (testCase.isRootTest()) {
            withContext(Dispatchers.IO) {
                questionRepository.deleteAllInBatch()
            }
            withContext(Dispatchers.IO) {
                customerRepository.deleteAllInBatch()
            }
            withContext(Dispatchers.IO) {
                programingRepository.deleteAllInBatch()
            }
        }
    }
}