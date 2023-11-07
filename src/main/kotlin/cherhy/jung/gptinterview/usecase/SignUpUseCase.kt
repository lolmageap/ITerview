package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerRequest
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.toCustomer
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class SignUpUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val passwordEncoder: BCryptPasswordEncoder,
) {

    fun signUp(customerRequest: CustomerRequest) {
        customerReadService.duplicationEmailCheck(customerRequest.email)
        val encodedPassword = passwordEncoder.encode(customerRequest.password + customerRequest.salt)
        customerWriteService.saveCustomer(customerRequest.toCustomer(), encodedPassword)
    }

}