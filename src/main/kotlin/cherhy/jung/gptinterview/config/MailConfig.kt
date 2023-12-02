package cherhy.jung.gptinterview.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl
import java.util.*


@Configuration
class MailConfig {
    @Value("\${spring.mail.username}")
    private val id: String? = null

    @Value("\${spring.mail.password}")
    private val password: String? = null

    @Value("\${spring.mail.host}")
    private val host: String? = null

    @Value("\${spring.mail.port}")
    private val port = 0

    @Bean
    fun javaMailService(): JavaMailSender {
        val javaMailSender = JavaMailSenderImpl()
        javaMailSender.host = host
        javaMailSender.username = id
        javaMailSender.password = password
        javaMailSender.port = port
        javaMailSender.setJavaMailProperties(mailProperties)
        javaMailSender.defaultEncoding = "UTF-8"
        return javaMailSender
    }

    private val mailProperties: Properties =
        Properties().apply {
            setProperty("mail.transport.protocol", "smtp")
            setProperty("mail.smtp.auth", "true")
            setProperty("mail.smtp.starttls.enable", "true")
            setProperty("mail.debug", "true")
            setProperty("mail.smtp.ssl.trust", "smtp.mailplug.co.kr")
            setProperty("mail.smtp.ssl.enable", "true")
        }

}