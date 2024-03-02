package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.dto.CustomerResponseS
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.dto.EditPasswordRequestS
import cherhy.jung.gptinterview.external.mail.MailComponent
import cherhy.jung.gptinterview.util.Generator
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class EditPasswordUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    private val mailComponent: MailComponent,
) {

    fun resetAndSendPassword(email: String) {
        val customer = customerReadService.getCustomerByEmail(email)
        val newPassword = Generator.generateRandomPassword()
        changePassword(customer, newPassword)
        mailComponent.sendPasswordMessage(email, newPassword)
    }

    fun editPassword(customerId: Long, editPasswordRequestS: EditPasswordRequestS) {
        val customer = customerReadService.getCustomerById(customerId)
        matchPassword(editPasswordRequestS.originalPassword, customer)
        changePassword(customer, editPasswordRequestS.editPassword)
    }

    private fun matchPassword(
        password: String,
        customer: CustomerResponseS,
    ) {
        val requestPassword = password + customer.salt
        val encodedPassword = bCryptPasswordEncoder.encode(requestPassword)
        val isMatched = bCryptPasswordEncoder.matches(encodedPassword, customer.password)
        if (!isMatched) throw BadCredentialsException("password not match")
    }

    private fun changePassword(
        customer: CustomerResponseS,
        editPassword: String,
    ) {
        val newPassword = bCryptPasswordEncoder.encode(editPassword + customer.salt)
        customerWriteService.editPassword(customer.id, newPassword)
    }

}