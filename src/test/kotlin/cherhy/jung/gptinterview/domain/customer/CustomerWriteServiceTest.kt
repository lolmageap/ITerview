package cherhy.jung.gptinterview.domain.customer

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import io.kotest.core.test.isRootTest
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.findByIdOrNull

@SpringBootTest
class CustomerWriteServiceTest(
    @Autowired private val customerWriteService: CustomerWriteService,
    @Autowired private val customerRepository: CustomerRepository,
) : BehaviorSpec({

    Given("회원이 존재하고 ") {
        val customer = customerRepository.save(
            Customer(
                name = "정철희",
                email = "ekxk1234@naver.com",
                password = "abcd1234",
                salt = "random",
                token = "random",
            )
        )
        val newPassword = "newPassword"

        When("비밀번호를 수정하면 ") {
            customerWriteService.editPassword(customer.id, newPassword)
            then("비밀번호가 변경된다.") {
                val findCustomer = customerRepository.findByIdOrNull(customer.id)!!
                findCustomer.password shouldNotBe customer.password
                findCustomer.password shouldBe newPassword
                findCustomer.modifiedAt!! shouldBeGreaterThan findCustomer.createdAt!!
            }
        }
    }

}) {
    override suspend fun afterContainer(testCase: TestCase, result: TestResult) {
        if (testCase.isRootTest()) {
            customerRepository.deleteAllInBatch()
        }
    }
}
