package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.external.mail.MailService
import cherhy.jung.gptinterview.util.Generator
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class ResetPasswordUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    private val mailService: MailService,
) {
    fun execute(
        email: String,
    ) {
        val customer = customerReadService.getCustomerByEmail(email)
        val generatedPassword = Generator.randomPassword

        val newPassword = bCryptPasswordEncoder.encode(generatedPassword + customer.salt)
        customerWriteService.editPassword(customer.id, newPassword)
        mailService.sendPasswordMessage(email, newPassword)
    }
}