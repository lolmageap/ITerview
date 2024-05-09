package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.domain.authority.Principal
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ThreadLocalConfig {
    private val threadLocal = ThreadLocal<Principal>()

    @Bean
    fun threadLocal(): ThreadLocal<Principal> {
        return threadLocal
    }
}