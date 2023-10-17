package cherhy.jung.gptinterview.authority

import org.springframework.http.HttpStatus
import org.springframework.security.access.AccessDeniedException
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono
import java.io.IOException

@Component
class JwtAuthenticationEntryPoint : ServerAccessDeniedHandler {
    @Throws(IOException::class)
    override fun handle(exchange: ServerWebExchange, e: AccessDeniedException): Mono<Void> {
        return Mono.fromRunnable {
            exchange.response.statusCode = HttpStatus.UNAUTHORIZED
        }
    }
}