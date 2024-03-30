package cherhy.jung.gptinterview.external.jwt

import cherhy.jung.gptinterview.extension.authorization
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.http.HttpServletRequest
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.GenericFilterBean
import javax.security.sasl.AuthenticationException

class JwtFilter(
    private val tokenProvider: TokenProvider,
) : GenericFilterBean() {
    override fun doFilter(
        servletRequest: ServletRequest,
        servletResponse: ServletResponse?,
        filterChain: FilterChain,
    ) {
        val httpServletRequest: HttpServletRequest = servletRequest as HttpServletRequest

        val authentication =
            httpServletRequest.authorization?.let {
                if (tokenProvider.validateToken(it)) {
                    tokenProvider.getAuthentication(it)
                } else {
                    throw AuthenticationException()
                }
            }

        SecurityContextHolder.getContext().authentication = authentication
        filterChain.doFilter(servletRequest, servletResponse)
    }
}