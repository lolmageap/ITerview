package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.domain.customer.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.external.mail.MailService
import cherhy.jung.gptinterview.external.redis.RedisWriteService
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
    @MockkBean private val mailService: MailService,
    @MockkBean private val redisWriteService: RedisWriteService,
) : BehaviorSpec({

    Given("회원이 ") {
        val customer = Customer(
            name = "정철희",
            email = "ekxk1234@naver.com",
            password = "abcd1234",
            salt = "random",
        )

        When("이메일 을 전송 하고 ") {
            every { customerReadService.checkDuplicatedEmail(any()) } just Runs
            every { mailService.sendMessage(any(), any()) } just Runs
            every { redisWriteService.addCertificate(any(), any()) } just Runs

            sendMailUseCase.sendCertificate(customer.email)

            Then("모두 실행 되었는 지 확인 한다.") {
                verify { customerReadService.checkDuplicatedEmail(any()) }
                verify { mailService.sendMessage(any(), any()) }
                verify { redisWriteService.addCertificate(any(), any()) }
            }
        }
    }

})
