package cherhy.jung.gptinterview.domain.customer

import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long> {

    fun existsByEmail(email: String): Boolean
    fun findByEmail(email: String): Customer?

}