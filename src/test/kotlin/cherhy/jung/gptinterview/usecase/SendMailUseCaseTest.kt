package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.domain.customer.entity.Customer
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.external.mail.MailService
import cherhy.jung.gptinterview.external.cache.CacheWriteService
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
    @MockkBean private val cacheWriteService: CacheWriteService,
) : BehaviorSpec({

    Given("회원이 ") {
        val customer = Customer(
            name = "정철희",
            username = "ekxk1234@naver.com",
            salt = "random",
        )

        When("이메일 을 전송 하고 ") {
            every { customerReadService.checkDuplicatedEmail(any()) } just Runs
            every { mailService.sendMessage(any(), any()) } just Runs
            every { cacheWriteService.addCertificate(any(), any()) } just Runs

            sendMailUseCase.execute(customer.username)

            Then("모두 실행 되었는 지 확인 한다.") {
                verify { customerReadService.checkDuplicatedEmail(any()) }
                verify { mailService.sendMessage(any(), any()) }
                verify { cacheWriteService.addCertificate(any(), any()) }
            }
        }
    }

})
