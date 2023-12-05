package cherhy.jung.gptinterview.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer

@Configuration
@EnableJpaAuditing
class JpaConfig {

    // *require review: jpa에서는 0이 1페이지라서, 이 부분을 쓰신거 같은데 이거는 application.properties(yml)에서 설정이 가능하지 않나요?
    @Bean
    fun customize(): PageableHandlerMethodArgumentResolverCustomizer? {
        return PageableHandlerMethodArgumentResolverCustomizer {
            it.setOneIndexedParameters(true)
        }
    }

}