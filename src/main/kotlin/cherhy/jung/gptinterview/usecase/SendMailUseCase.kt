package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.mail.MailComponent
import cherhy.jung.gptinterview.redis.RedisWriteService
import cherhy.jung.gptinterview.util.Generator

@UseCase
class SendMailUseCase(
    private val customerReadService: CustomerReadService,
    private val mailComponent: MailComponent,
    private val redisWriteService: RedisWriteService,
) {

    fun sendCertificate(email: String) {
        customerReadService.checkDuplicatedEmail(email)
        val certificate = Generator.generateCertificate()
        mailComponent.sendMessage(email, certificate)
        redisWriteService.addCertificate(email, certificate)
    }

    fun sendResetPassword(email: String, resetPassword: String) =
        mailComponent.sendPasswordMessage(email, resetPassword)

}