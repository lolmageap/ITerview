package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.WriteService
import org.springframework.data.repository.findByIdOrNull

@WriteService
class CustomerWriteService(
    private val customerRepository: CustomerRepository,
) {
    fun saveCustomer(customer: Customer, encodedPassword: String) {
        with(customer) {
            password = encodedPassword
        }

        customerRepository.save(customer)
    }

    fun editPassword(id: Long, newPassword: String) {
        val customer = customerRepository.findByIdOrNull(id)!!
        with(customer) {
            password = newPassword
        }

        customerRepository.save(customer)
    }
}