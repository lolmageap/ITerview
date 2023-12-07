package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.mail.MailProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender


@Configuration
class MailConfig(private val mailProperties: MailProperties) {
    // *require
    // review: 아래 값들은 Properties 파일을 만들어서 관리해보는건 어떨까요?
    // 아래와 같이 클래스를 만들면 응집도를 높힌 코드도 만들 수 있겠네요.  javaMailService 객체를 Properties 클래스에서 만들 수 있을거에요.
//    class MailProperties(
//        val id
//        ..
//        ...
//    ) {
//       fun toJavaMailSender()
//}

    @Bean
    fun javaMailService(): JavaMailSender =
        mailProperties.toJavaMailSender()

}