package cherhy.jung.gptinterview.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer

@Configuration
@EnableJpaAuditing
class JpaConfig {

    @Bean
    fun customize(): PageableHandlerMethodArgumentResolverCustomizer? {
        return PageableHandlerMethodArgumentResolverCustomizer {
            it.setOneIndexedParameters(true)
        }
    }

}