package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.mail.MailComponent
import cherhy.jung.gptinterview.redis.RedisWriteService
import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.Runs
import io.mockk.every
import io.mockk.just
import io.mockk.verify
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SendMailUseCaseTest(
    @Autowired private val sendMailUseCase: SendMailUseCase,
    @MockkBean private val customerReadService: CustomerReadService,
    @MockkBean private val mailComponent: MailComponent,
    @MockkBean private val redisWriteService: RedisWriteService,
) : BehaviorSpec({

    Given("회원이 ") {
        val customer = Customer(
            name = "정철희",
            email = "ekxk1234@naver.com",
            password = "abcd1234",
            salt = "random",
            token = "random",
        )

        When("이메일을 전송하고 ") {
            every { customerReadService.checkDuplicatedEmail(any()) } just Runs
            every { mailComponent.sendMessage(any(), any()) } just Runs
            every { redisWriteService.addCertificate(any(), any()) } just Runs

            sendMailUseCase.sendCertificate(customer.email)

            Then("모두 실행되었는지 확인한다.") {
                verify { customerReadService.checkDuplicatedEmail(any()) }
                verify { mailComponent.sendMessage(any(), any()) }
                verify { redisWriteService.addCertificate(any(), any()) }
            }
        }

        When("변경한 비밀번호 전송을 ") {
            val resetPassword = "reset-password"
            every { mailComponent.sendPasswordMessage(any(), any()) } just Runs

            sendMailUseCase.sendResetPassword(customer.email, resetPassword)

            Then("실행되었는지 확인한다.") {
                verify { mailComponent.sendPasswordMessage(any(), any()) }
            }
        }
    }

})
