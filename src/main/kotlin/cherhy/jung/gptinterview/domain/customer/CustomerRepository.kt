package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.domain.customer.entity.Customer
import org.springframework.data.jpa.repository.EntityGraph
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long> {
    fun existsByUsername(
        email: String,
    ): Boolean

    @EntityGraph(attributePaths = ["customerAuthorities"])
    fun findWithAuthorityByUsername(
        email: String,
    ): Customer?

    fun findByUsername(
        email: String,
    ): Customer?

    fun findByUsernameAndProvider(
        email: String,
        provider: Provider,
    ): Customer?
}