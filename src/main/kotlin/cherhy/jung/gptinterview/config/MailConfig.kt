package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.mail.MailProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender


@Configuration
class MailConfig(private val mailProperties: MailProperties) {

    @Bean
    fun javaMailService(): JavaMailSender =
        mailProperties.toJavaMailSender()

}