package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.customer.dto.CustomerResponseVo
import cherhy.jung.gptinterview.exception.DomainName
import cherhy.jung.gptinterview.exception.DomainName.EMAIL
import cherhy.jung.gptinterview.exception.ExistException
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.data.repository.findByIdOrNull

@ReadService
class CustomerReadService(
    private val customerRepository: CustomerRepository,
) {
    fun getCustomerById(id: Long): CustomerResponseVo =
        customerRepository.findByIdOrNull(id)
            ?.let(CustomerResponseVo::of)
            ?: throw NotFoundException(DomainName.CUSTOMER)

    fun getCustomerByEmail(email: String): CustomerResponseVo =
        customerRepository.findByEmail(email)
            ?.let(CustomerResponseVo::of)
            ?: throw NotFoundException(DomainName.CUSTOMER)

    fun checkDuplicatedEmail(email: String) =
        customerRepository.existsByEmail(email).let { isExist ->
            if (isExist) throw ExistException(EMAIL)
        }
}