package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.domain.customer.vo.CustomerRequestVo
import cherhy.jung.gptinterview.domain.customer.vo.toCustomer
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class SignUpUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val passwordEncoder: BCryptPasswordEncoder,
) {
    fun execute(request: CustomerRequestVo) {
        customerReadService.checkDuplicatedEmail(request.username)
        val encodedPassword = passwordEncoder.encode(request.password + request.salt)
        customerWriteService.saveCustomer(request.toCustomer(), encodedPassword, Provider.LOCAL)
    }
}