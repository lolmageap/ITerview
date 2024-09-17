package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.customer.CustomerReadService
import cherhy.jung.gptinterview.domain.customer.CustomerWriteService
import cherhy.jung.gptinterview.domain.customer.vo.EditPasswordRequestVo
import cherhy.jung.gptinterview.extension.matchOrThrow
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@UseCase
class EditPasswordUseCase(
    private val customerReadService: CustomerReadService,
    private val customerWriteService: CustomerWriteService,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
) {
    fun execute(
        customerId: Long,
        request: EditPasswordRequestVo,
    ) {
        val customer = customerReadService.getCustomerById(customerId)
        bCryptPasswordEncoder.matchOrThrow(request.originalPassword, customer.salt, customer.password)

        val newPassword = bCryptPasswordEncoder.encode(request.editPassword + customer.salt)
        customerWriteService.editPassword(customer.id, newPassword)
    }
}