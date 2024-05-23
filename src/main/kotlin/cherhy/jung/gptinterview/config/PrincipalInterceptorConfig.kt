package cherhy.jung.gptinterview.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class PrincipalInterceptorConfig(
    private val principalInterceptor: PrincipalInterceptor,
) : WebMvcConfigurer {
    override fun addInterceptors(
        registry: InterceptorRegistry,
    ) {
        registry.addInterceptor(principalInterceptor)
    }
}