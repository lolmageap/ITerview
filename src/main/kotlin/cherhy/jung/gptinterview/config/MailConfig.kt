package cherhy.jung.gptinterview.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl
import java.util.*


@Configuration
class MailConfig {
    // review: 아래 값들은 Properites 파일을 만들어서 관리해보는건 어떨까요?
    // 아래와 같이 클래스를 만들면 응집도를 높힌 코드도 만들 수 있겠네요.  javaMailService 객체를 Properties클래스에서 만들 수 있을거에요.
//    class MailProperties(
//        val id
//        ..
//        ...
//    ) {
//       fun toJavaMailSender()
//}
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