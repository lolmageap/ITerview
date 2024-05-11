package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.domain.customer.Customer
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.oauth2.core.user.OAuth2User

class Principal(
    private val customer: Customer,
) : UserDetails, OAuth2User {
    val customerId = customer.id
    val token = customer.token
    val provider = customer.provider
    val roles = authorities.map { it.authority }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return customer.customerAuthorities.map {
            SimpleGrantedAuthority("ROLE_${it.role}")
        }.toMutableList()
    }

    override fun getAttributes(): MutableMap<String, Any> =
        mutableMapOf(
            "id" to customerId,
            "token" to token,
            "provider" to provider,
            "roles" to roles,
        )

    override fun getName() = customer.username

    override fun getPassword(): String = customer.password

    override fun getUsername(): String = customer.username

    override fun isAccountNonExpired(): Boolean = customer.deleted.not()

    override fun isAccountNonLocked(): Boolean = customer.deleted.not()

    override fun isCredentialsNonExpired(): Boolean = customer.deleted.not()

    override fun isEnabled(): Boolean = customer.deleted.not()
    companion object {
        fun of(customer: Customer): Principal {
            return Principal(customer)
        }
    }
}