package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.domain.customer.Customer
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class AuthCustomer(
    private val customer: Customer,
): UserDetails {

    val customerId = customer.id
    val token = customer.token

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return customer.customerAuthorities.map {
            SimpleGrantedAuthority("ROLE_${it.role}") as GrantedAuthority
        }.toMutableList()
    }


    override fun getPassword(): String  = customer.password

    override fun getUsername(): String = customer.email

    override fun isAccountNonExpired(): Boolean = !customer.deleted

    override fun isAccountNonLocked(): Boolean = !customer.deleted

    override fun isCredentialsNonExpired(): Boolean = !customer.deleted

    override fun isEnabled(): Boolean = !customer.deleted
}