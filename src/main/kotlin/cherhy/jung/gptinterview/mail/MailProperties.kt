package cherhy.jung.gptinterview.mail

import org.springframework.beans.factory.annotation.Value
import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.stereotype.Component
import java.util.*


@Component
class MailProperties {
    @Value("\${spring.mail.username}")
    lateinit var id: String

    @Value("\${spring.mail.password}")
    lateinit var password: String

    @Value("\${spring.mail.host}")
    lateinit var host: String

    @Value("\${spring.mail.port}")
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
            it.username = id
            it.password = password
            it.port = port
            it.javaMailProperties = mailProperties
            it.defaultEncoding = "UTF-8"
        }

}