package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerRequestS
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.toCustomer
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class SignUpUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val passwordEncoder: BCryptPasswordEncoder,
) {

    fun signUp(customerRequestS: CustomerRequestS) {
        customerReadService.duplicationEmailCheck(customerRequestS.email)
        val encodedPassword = passwordEncoder.encode(customerRequestS.password + customerRequestS.salt)
        customerWriteService.saveCustomer(customerRequestS.toCustomer(), encodedPassword)
    }

}