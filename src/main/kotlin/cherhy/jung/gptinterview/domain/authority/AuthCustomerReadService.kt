package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.customer.CustomerRepository
import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

@ReadService
class AuthCustomerReadService(
    private val customerRepository: CustomerRepository,
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        return customerRepository.findWithAuthorityByUsername(username)
            ?.let(AuthCustomer::of)
            ?: throw NotFoundException(MessageType.CUSTOMER)
    }
}