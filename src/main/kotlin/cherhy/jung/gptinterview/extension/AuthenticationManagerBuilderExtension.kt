package cherhy.jung.gptinterview.extension

import cherhy.jung.gptinterview.domain.authority.Principal
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder

fun AuthenticationManagerBuilder.convertUserDetails(
    authenticationToken: UsernamePasswordAuthenticationToken,
): Principal {
    val authenticate = this.`object`.authenticate(authenticationToken)
    return authenticate.principal as Principal
}