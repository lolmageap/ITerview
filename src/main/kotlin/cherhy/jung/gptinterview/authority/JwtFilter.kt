package cherhy.jung.gptinterview.authority

import cherhy.jung.gptinterview.component.RedisReadService
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletException
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.http.HttpServletRequest
import org.springframework.security.access.AccessDeniedException
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.util.StringUtils
import org.springframework.web.filter.GenericFilterBean
import java.io.IOException


class JwtFilter(
    private val tokenProvider: TokenProvider,
    private val redisReadService: RedisReadService,
) : GenericFilterBean() {

    companion object {
        const val AUTHORIZATION_HEADER = "Authorization"
    }

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(servletRequest: ServletRequest, servletResponse: ServletResponse?, filterChain: FilterChain) {
        val httpServletRequest: HttpServletRequest = servletRequest as HttpServletRequest
        val jwt: String = getResolveToken(httpServletRequest)

        val authentication: Authentication? = if (tokenProvider.validateToken(jwt)) {
            tokenProvider.getAuthentication(jwt)
        } else {
            val refreshToken = redisReadService.getJwtToken(jwt) ?: throw AccessDeniedException("잘못된 토큰")
            tokenProvider.getAuthentication(refreshToken)
        }

        SecurityContextHolder.getContext().authentication = authentication
        filterChain.doFilter(servletRequest, servletResponse)
    }


    private fun getResolveToken(request: HttpServletRequest): String {
        val bearerToken: String = request.getHeader(AUTHORIZATION_HEADER)
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7)
        }
        throw AccessDeniedException("잘못된 토큰")
    }

}