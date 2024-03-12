package cherhy.jung.gptinterview.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebSecurity
class SecurityConfig(val jwtSecurityConfig: JwtSecurityConfig) {
    @Bean
    fun passwordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain? {
        http.authorizeHttpRequests { requests ->
            requests
                .requestMatchers("/answers/**").authenticated()
                .requestMatchers("/authorities/reset-password").authenticated()
                .requestMatchers("/authorities/password").authenticated()
                .requestMatchers("/questions/**").authenticated()
                .anyRequest().permitAll()
        }
            .csrf {
                it.disable()
            }.cors {
                corsConfigurer()
            }
            .sessionManagement { sessionManagement ->
                sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            }
            .apply(jwtSecurityConfig)

        return http.build()
    }

    @Bean
    fun corsConfigurer(): WebMvcConfigurer {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry.addMapping("/**")
                    .allowedMethods("GET", "POST", "PATCH", "PUT", "DELETE")
                    .allowedHeaders("*")
                    .allowCredentials(true)
                    .allowedOriginPatterns("*")
                    .maxAge(3000)
            }
        }
    }
}