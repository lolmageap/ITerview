package cherhy.jung.gptinterview.mail

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.stereotype.Component
import java.util.*


@Component
@ConfigurationProperties("spring.mail")
class MailProperties {

    lateinit var username: String

    lateinit var password: String

    lateinit var host: String

    var port: Int = 0

    val mailProperties: Properties =
        Properties().apply {
            setProperty("mail.transport.protocol", "smtp")
            setProperty("mail.smtp.auth", "true")
            setProperty("mail.smtp.starttls.enable", "true")
            setProperty("mail.debug", "true")
            setProperty("mail.smtp.ssl.trust", "smtp.mailplug.co.kr")
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