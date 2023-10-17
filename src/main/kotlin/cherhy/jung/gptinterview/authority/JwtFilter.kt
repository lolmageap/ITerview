package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.util.log
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletException
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.http.HttpServletRequest
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.util.StringUtils
import org.springframework.web.filter.GenericFilterBean
import java.io.IOException


class JwtFilter(private val tokenProvider: TokenProvider) : GenericFilterBean() {

    private val AUTHORIZATION_HEADER = "Authorization"

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(servletRequest: ServletRequest, servletResponse: ServletResponse?, filterChain: FilterChain) {
        val httpServletRequest: HttpServletRequest = servletRequest as HttpServletRequest
        val jwt: String? = resolveToken(httpServletRequest)
        val requestURI: String = httpServletRequest.requestURI
        if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) {
            val authentication: Authentication? = tokenProvider.getAuthentication(jwt)
            SecurityContextHolder.getContext().authentication = authentication
        } else {
            log.debug("유효한 JWT 토큰이 없습니다, uri: {}", requestURI)
        }
        filterChain.doFilter(servletRequest, servletResponse)
    }

    private fun resolveToken(request: HttpServletRequest): String? {
        val bearerToken: String = request.getHeader(AUTHORIZATION_HEADER)
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7)
        }
        return null
    }

}