package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.dto.CustomerRequestVo
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class SignUpUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val passwordEncoder: BCryptPasswordEncoder,
) {
    fun signUp(request: CustomerRequestVo) {
        customerReadService.checkDuplicatedEmail(request.email)
        val encodedPassword = passwordEncoder.encode(request.password + request.salt)
        customerWriteService.saveCustomer(request.toCustomer(), encodedPassword)
    }
}