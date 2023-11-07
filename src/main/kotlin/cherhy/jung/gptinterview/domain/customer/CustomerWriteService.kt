package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.WriteService

@WriteService
class CustomerWriteService(
    private val customerRepository: CustomerRepository,
) {
    fun saveCustomer(customer: Customer, password: String) {
        customer.changePassword(password)
        customerRepository.save(customer)
    }

}