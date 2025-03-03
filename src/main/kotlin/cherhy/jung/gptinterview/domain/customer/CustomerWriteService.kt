package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.domain.customer.entity.Customer
import cherhy.jung.gptinterview.domain.customer.vo.CustomerResponseVo
import cherhy.jung.gptinterview.domain.customer.vo.of
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
    ) =
        with(customer) {
            this.password = encodedPassword
            customerRepository.save(this)
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