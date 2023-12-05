package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.jwt.JwtFilter
import cherhy.jung.gptinterview.jwt.TokenProvider
import cherhy.jung.gptinterview.redis.RedisReadService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.SecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.DefaultSecurityFilterChain
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter


@Configuration
@EnableWebSecurity
class SecurityConfig(val jwtSecurityConfig: JwtSecurityConfig) {

    @Bean
    fun passwordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    @Throws(Exception::class) // 필요 없는 코드같아요 코틀린에서는. 꼭 마킹이 필요하면 그 떄 적어볼까요?
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain? {
        // 정렬이 조금 아쉽네요 기존 코드와 비교해볼까요?
        http.authorizeHttpRequests { requests ->
            requests.requestMatchers("/**").permitAll()
                .anyRequest().authenticated()
        }.csrf {
            it.disable()
        }.sessionManagement { sessionManagement ->
            sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        }.apply(jwtSecurityConfig)

        return http.build()
    }

}

@Configuration
class JwtSecurityConfig(
    private val tokenProvider: TokenProvider,
    private val redisReadService: RedisReadService,
) : SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity>() {

    override fun configure(http: HttpSecurity) {
        val customFilter = JwtFilter(tokenProvider, redisReadService)
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter::class.java)
    }
}