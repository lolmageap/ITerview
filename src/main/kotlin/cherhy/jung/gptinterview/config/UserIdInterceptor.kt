package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.extension.authorization
import cherhy.jung.gptinterview.external.jwt.TokenProvider
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor

@Component
class UserIdInterceptor(
    private val tokenProvider: TokenProvider,
    private val threadLocal: ThreadLocal<AuthCustomer>,
): HandlerInterceptor {
    override fun preHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
    ): Boolean {
        val token = request.authorization
            ?: return false

        val authenticate = tokenProvider.getAuthentication(token)
        val authCustomer = authenticate?.principal as AuthCustomer
        threadLocal.set(authCustomer)
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