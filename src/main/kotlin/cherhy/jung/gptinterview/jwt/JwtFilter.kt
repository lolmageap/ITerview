package cherhy.jung.gptinterview.jwt

import cherhy.jung.gptinterview.util.authorization
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletException
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.http.HttpServletRequest
import org.springframework.security.access.AccessDeniedException
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.GenericFilterBean
import java.io.IOException


class JwtFilter(
    private val tokenProvider: TokenProvider,
) : GenericFilterBean() {

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(
        servletRequest: ServletRequest,
        servletResponse: ServletResponse?,
        filterChain: FilterChain
    ) {
        val httpServletRequest: HttpServletRequest = servletRequest as HttpServletRequest
        val jwt: String = getResolveToken(httpServletRequest)

        val authentication: Authentication? =
            jwt.let {
                if (tokenProvider.validateToken(jwt)) {
                    tokenProvider.getAuthentication(jwt)
                } else {
                    throw AccessDeniedException("토큰이 문제가 생겼습니다.")
                }
            }

        SecurityContextHolder.getContext().authentication = authentication
        filterChain.doFilter(servletRequest, servletResponse)
    }

    private fun getResolveToken(request: HttpServletRequest): String {
        val bearerToken: String? = request.authorization
        bearerToken?.let {
            if (bearerToken.startsWith("Bearer ")) {
                return bearerToken.substring(7)
            }
            else throw AccessDeniedException("잘못된 토큰")
        } ?: throw AccessDeniedException("잘못된 토큰")
    }

}