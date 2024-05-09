package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.extension.accessToken
import cherhy.jung.gptinterview.external.jwt.TokenProvider
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor

@Component
class PrincipalInterceptor(
    private val tokenProvider: TokenProvider,
    private val threadLocal: ThreadLocal<Principal>,
): HandlerInterceptor {
    override fun preHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
    ): Boolean {
        val jwt = request.accessToken ?: return true
        if (jwt.isBlank()) return true
        
        val principal = tokenProvider.getPrincipal(jwt)
        threadLocal.set(principal)
        return true
    }

    override fun afterCompletion(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        ex: Exception?,
    ) {
        threadLocal.remove()
    }
}