package cherhy.jung.gptinterview.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfig {
    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate().apply {
            this.requestFactory = HttpComponentsClientHttpRequestFactory()
        }
    }
}