package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.vo.CustomerResponseVo
import cherhy.jung.gptinterview.domain.customer.vo.EditPasswordRequestVo
import cherhy.jung.gptinterview.external.mail.MailService
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
    @Autowired private val resetPasswordUseCase: ResetPasswordUseCase,
    @MockkBean private val customerReadService: CustomerReadService,
    @MockkBean private val customerWriteService: CustomerWriteService,
    @MockkBean private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    @MockkBean private val mailService: MailService,
) : BehaviorSpec({

    Given("회원이 존재 하고 ") {
        val customer = Customer(
            name = "정철희",
            email = "ekxk1234@naver.com",
            password = "abcd1234",
            salt = "random",
        )

        When("비밀번호 를 초기화 하면 ") {
            every { customerReadService.getCustomerByEmail(any()) } returns CustomerResponseVo.of(customer)
            every { bCryptPasswordEncoder.encode(any()) } returns "encodedPassword"
            every { customerWriteService.editPassword(any(), any()) } just Runs
            every { mailService.sendPasswordMessage(any(), any()) } just Runs

            resetPasswordUseCase.execute(customer.email)
            Then("모두 실행 되는지 확인 하고 비밀번호 가 초기화 되었는 지 검증 한다.") {
                verify { customerReadService.getCustomerByEmail(any()) }
                verify { bCryptPasswordEncoder.encode(any()) }
                verify { customerWriteService.editPassword(any(), any()) }
                verify { mailService.sendPasswordMessage(any(), any()) }
            }
        }

        When("비밀번호 를 변경 하면 ") {
            val passwordRequestS = EditPasswordRequestVo("originalPassword", "newPassword")

            every { customerReadService.getCustomerById(any()) } returns CustomerResponseVo.of(customer)
            every {
                bCryptPasswordEncoder.encode(passwordRequestS.originalPassword + customer.salt)
            } returns "matchedPassword"

            every { bCryptPasswordEncoder.matches(any(), any()) } returns true
            every { customerWriteService.editPassword(any(), any()) } just Runs

            every {
                bCryptPasswordEncoder.encode(passwordRequestS.editPassword + customer.salt)
            } returns "encodedPassword"

            editPasswordUseCase.execute(customer.id, passwordRequestS)

            Then("모두 실행 되는지 확인 한다.") {
                verify { customerReadService.getCustomerById(any()) }
                verify { bCryptPasswordEncoder.encode(passwordRequestS.originalPassword + customer.salt) }
                verify { bCryptPasswordEncoder.matches(any(), any()) }
                verify { customerWriteService.editPassword(any(), any()) }
                verify { bCryptPasswordEncoder.encode(passwordRequestS.editPassword + customer.salt) }
            }
        }
    }

})
