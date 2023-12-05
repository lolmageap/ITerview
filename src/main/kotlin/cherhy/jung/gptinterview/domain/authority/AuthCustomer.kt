package cherhy.jung.gptinterview.domain.authority

import cherhy.jung.gptinterview.domain.customer.Customer
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

// 하나의 패키지에 너무 많은 클래스들이 있네요!
// 이럴때는 서비스는 서비스 따로, 엔티티를 다루는 리포지토리와 엔티티모델은 같이 둬보는건 어떨까요?
class AuthCustomer(
    private val customer: Customer,
) : UserDetails {

    val customerId = customer.id
    val token = customer.token

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return customer.customerAuthorities.map {
            SimpleGrantedAuthority("ROLE_${it.role}") as GrantedAuthority
        }.toMutableList()
    }


    override fun getPassword(): String = customer.password

    override fun getUsername(): String = customer.email

    override fun isAccountNonExpired(): Boolean = !customer.deleted

    override fun isAccountNonLocked(): Boolean = !customer.deleted

    override fun isCredentialsNonExpired(): Boolean = !customer.deleted

    override fun isEnabled(): Boolean = !customer.deleted
}