package cherhy.jung.gptinterview.config

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JasyptConfig {
    @Bean
    fun jasyptStringEncryptor() =
        StandardPBEStringEncryptor().apply {
            setAlgorithm(
                System.getProperty("JASYPT_ALGORITHM")
            )
            setPassword(
                System.getProperty("JASYPT_PASSWORD")
            )
        }
}