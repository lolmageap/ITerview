package cherhy.jung.gptinterview.extension

import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder

fun AuthenticationManagerBuilder.convertUserDetails(
    authenticationToken: UsernamePasswordAuthenticationToken,
): AuthCustomer {
    val authenticate = this.`object`.authenticate(authenticationToken)
    return authenticate.principal as AuthCustomer
}