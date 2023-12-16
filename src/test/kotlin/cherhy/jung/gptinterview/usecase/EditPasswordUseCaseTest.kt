package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.dto.CustomerResponseS
import cherhy.jung.gptinterview.domain.customer.dto.EditPasswordRequestS
import cherhy.jung.gptinterview.mail.MailComponent
import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.Runs
import io.mockk.every
import io.mockk.just
import io.mockk.verify
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@SpringBootTest
class EditPasswordUseCaseTest(
    @Autowired private val editPasswordUseCase: EditPasswordUseCase,
    @MockkBean private val customerReadService: CustomerReadService,
    @MockkBean private val customerWriteService: CustomerWriteService,
    @MockkBean private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    @MockkBean private val mailComponent: MailComponent,
) : BehaviorSpec({

    Given("회원이 존재하고 ") {
        val customer = Customer(
            name = "정철희",
            email = "ekxk1234@naver.com",
            password = "abcd1234",
            salt = "random",
            token = "random",
        )

        When("비밀번호를 초기화 하면 ") {
            every { customerReadService.getCustomerByEmail(any()) } returns CustomerResponseS.of(customer)
            every { bCryptPasswordEncoder.encode(any()) } returns "encodedPassword"
            every { customerWriteService.editPassword(any(), any()) } just Runs
            every { mailComponent.sendPasswordMessage(any(), any()) } just Runs

            editPasswordUseCase.resetAndSendPassword(customer.email)
            Then("모두 실행되는지 확인하고 비밀번호가 초기화 되었는지 검증한다.") {
                verify { customerReadService.getCustomerByEmail(any()) }
                verify { bCryptPasswordEncoder.encode(any()) }
                verify { customerWriteService.editPassword(any(), any()) }
                verify { mailComponent.sendPasswordMessage(any(), any()) }
            }
        }

        When("비밀번호를 변경 하면 ") {
            val passwordRequestS = EditPasswordRequestS("originalPassword", "newPassword")

            every { customerReadService.getCustomerById(any()) } returns CustomerResponseS.of(customer)
            every {
                bCryptPasswordEncoder.encode(passwordRequestS.originalPassword + customer.salt)
            } returns "matchedPassword"

            every { bCryptPasswordEncoder.matches(any(), any()) } returns true
            every { customerWriteService.editPassword(any(), any()) } just Runs

            every {
                bCryptPasswordEncoder.encode(passwordRequestS.editPassword + customer.salt)
            } returns "encodedPassword"

            editPasswordUseCase.editPassword(customer.id, passwordRequestS)

            Then("모두 실행되는지 확인한다.") {
                verify { customerReadService.getCustomerById(any()) }
                verify { bCryptPasswordEncoder.encode(passwordRequestS.originalPassword + customer.salt) }
                verify { bCryptPasswordEncoder.matches(any(), any()) }
                verify { customerWriteService.editPassword(any(), any()) }
                verify { bCryptPasswordEncoder.encode(passwordRequestS.editPassword + customer.salt) }
            }
        }
    }

})
