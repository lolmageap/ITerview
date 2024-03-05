package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.dto.CustomerResponseVo
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.dto.EditPasswordRequestVo
import cherhy.jung.gptinterview.extension.matchOrThrow
import cherhy.jung.gptinterview.external.mail.MailService
import cherhy.jung.gptinterview.util.Generator
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class EditPasswordUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    private val mailService: MailService,
) {
    fun resetAndSendPassword(email: String) {
        val customer = customerReadService.getCustomerByEmail(email)
        val newPassword = Generator.generateRandomPassword()
        changePassword(customer, newPassword)
        mailService.sendPasswordMessage(email, newPassword)
    }

    fun editPassword(customerId: Long, request: EditPasswordRequestVo) {
        val customer = customerReadService.getCustomerById(customerId)
        bCryptPasswordEncoder.matchOrThrow(request.originalPassword, customer.salt, customer.password)
        changePassword(customer, request.editPassword)
    }

    private fun changePassword(
        customer: CustomerResponseVo,
        editPassword: String,
    ) {
        val newPassword = bCryptPasswordEncoder.encode(editPassword + customer.salt)
        customerWriteService.editPassword(customer.id, newPassword)
    }
}