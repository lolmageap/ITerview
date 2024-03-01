package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.property.MailProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender

@Configuration
@EnableConfigurationProperties(MailProperty::class)
class MailConfig(
    private val mailProperty: MailProperty,
) {

    @Bean
    fun javaMailService(): JavaMailSender =
        mailProperty.toJavaMailSender()

}