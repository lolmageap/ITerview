package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.exception.DomainName
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

@ReadService
class AuthCustomerReadService(
    private val customerRepository: CustomerRepository,
) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        return customerRepository.findByEmail(username)
            ?.let { AuthCustomer(it) }
            ?: throw NotFoundException(DomainName.CUSTOMER)
    }

}