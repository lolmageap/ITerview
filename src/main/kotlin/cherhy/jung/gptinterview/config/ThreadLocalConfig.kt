package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ThreadLocalConfig {
    private val threadLocal = ThreadLocal<AuthCustomer>()

    @Bean
    fun threadLocal(): ThreadLocal<AuthCustomer> {
        return threadLocal
    }

    val userId
        get() = threadLocal.get().id

    fun clear() {
        threadLocal.remove()
    }
}