package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.DependsOn
import org.springframework.mail.javamail.JavaMailSenderImpl
import java.util.*

@DependsOn("jasyptStringEncryptor")
@ConfigurationProperties("spring.mail")
data class MailProperty(
    val username: String,
    val password: String,
    val host: String,
    val port: Int,
) {
    private val mailProperties: Properties =
        Properties().apply {
            setProperty("mail.transport.protocol", "smtp")
            setProperty("mail.smtp.auth", "true")
            setProperty("mail.smtp.starttls.enable", "true")
            setProperty("mail.debug", "true")
            setProperty("mail.smtp.ssl.trust", "smtp.gmail.com")
            setProperty("mail.smtp.ssl.enable", "true")
        }

    fun toJavaMailSender(): JavaMailSenderImpl =
        JavaMailSenderImpl().also {
            it.host = host
            it.username = username
            it.password = password
            it.port = port
            it.javaMailProperties = mailProperties
            it.defaultEncoding = "UTF-8"
        }
}