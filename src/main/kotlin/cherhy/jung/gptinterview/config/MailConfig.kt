package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.mail.MailProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender

@Configuration
@EnableConfigurationProperties(MailProperties::class)
class MailConfig(private val mailProperties: MailProperties) {

    @Bean
    fun javaMailService(): JavaMailSender =
        mailProperties.toJavaMailSender()

}