package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.domain.user.User
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class AuthUser(private val user: User): UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> =
        mutableListOf<GrantedAuthority>( SimpleGrantedAuthority("ROLE_" + user.role.toString()) )

    override fun getPassword(): String  = user.password

    override fun getUsername(): String = user.email

    override fun isAccountNonExpired(): Boolean = user.deleted

    override fun isAccountNonLocked(): Boolean = user.deleted

    override fun isCredentialsNonExpired(): Boolean = user.deleted

    override fun isEnabled(): Boolean = user.deleted
}