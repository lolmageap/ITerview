package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerResponseS
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.EditPasswordRequestS
import cherhy.jung.gptinterview.util.Generator
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class EditPasswordUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
) {

    fun resetPassword(email: String): String {
        val customer = customerReadService.getCustomerByEmail(email)
        return Generator.generateRandomPassword().also { newPassword ->
            changePassword(newPassword, customer)
        }
    }

    fun editPassword(customerId: Long, editPasswordRequestS: EditPasswordRequestS) {
        val customer = customerReadService.getCustomerById(customerId)
        matchPassword(editPasswordRequestS.originalPassword, customer)
        changePassword(editPasswordRequestS.editPassword, customer)
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
        editPassword: String,
        customer: CustomerResponseS,
    ) {
        val newPassword = bCryptPasswordEncoder.encode(editPassword + customer.salt)
        customerWriteService.editPassword(customer.id, newPassword)
    }

}