package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.domain.customer.entity.Customer
import cherhy.jung.gptinterview.domain.customer.vo.CustomerResponseVo
import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.data.repository.findByIdOrNull

@WriteService
class CustomerWriteService(
    private val customerRepository: CustomerRepository,
) {
    fun saveCustomer(
        customer: Customer,
        encodedPassword: String,
        provider: Provider,
    ) =
        with(customer) {
            password = encodedPassword
            this.provider = provider
            CustomerResponseVo.of(this)
        }

    fun editPassword(
        id: Long,
        newPassword: String,
    ) =
        customerRepository.findByIdOrNull(id)
            ?.run { password = newPassword }
            ?: throw NotFoundException(MessageType.CUSTOMER)
}