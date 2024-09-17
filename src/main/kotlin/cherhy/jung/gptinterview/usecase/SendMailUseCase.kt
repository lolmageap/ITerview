package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.external.mail.MailService
import cherhy.jung.gptinterview.external.cache.CacheWriteService
import cherhy.jung.gptinterview.util.Generator

@UseCase
class SendMailUseCase(
    private val customerReadService: CustomerReadService,
    private val mailService: MailService,
    private val cacheWriteService: CacheWriteService,
) {
    fun execute(
        email: String,
    ) {
        customerReadService.checkDuplicatedEmail(email)
        val certificate = Generator.certificate
        mailService.sendMessage(email, certificate)
        cacheWriteService.addCertificate(email, certificate)
    }
}