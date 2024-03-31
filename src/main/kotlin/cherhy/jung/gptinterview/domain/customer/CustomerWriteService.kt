package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.customer.vo.CustomerResponseVo
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
            this.password = encodedPassword
            this.provider = provider
            customerRepository.save(this)
            CustomerResponseVo.of(this)
        }

    fun editPassword(id: Long, newPassword: String) {
        val customer = customerRepository.findByIdOrNull(id)!!
        with(customer) {
            password = newPassword
        }

        customerRepository.save(customer)
    }
}