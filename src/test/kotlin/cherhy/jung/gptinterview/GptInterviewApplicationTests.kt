package cherhy.jung.gptinterview

import io.kotest.core.spec.style.StringSpec
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor

internal class GptInterviewApplicationTests : StringSpec({
    val encryptKey = "jungcherhy"
    val encryptAlgorithm = "PBEWITHMD5ANDDES"

    val listOfMap = listOf(
        mapOf("DATABASE_URL" to "jdbc:mysql://localhost:3501/iterview"),
        mapOf("DATABASE_USERNAME" to "root"),
        mapOf("DATABASE_PASSWORD" to "wjd0322189!"),
        mapOf("REDIS_HOST" to "localhost"),
        mapOf("REDIS_PORT" to "6379"),
        mapOf("MAIL_HOST" to "smtp.gmail.com"),
        mapOf("MAIL_PORT" to "587"),
        mapOf("MAIL_USERNAME" to "ekxk1234@naver.com"),
        mapOf("MAIL_PASSWORD" to "ioxgvylzqcfhzzet"),
        mapOf("GPT_API_KEY" to "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"),
        mapOf("JWT_SECRET" to "aW5jaGVvbi1hbmQtYnVjaGVvbi1sZWFmeS1wcm9qZWN0LWphdmEtc3ByaW5nLWJhY2tlbmQtcmVhY3QtYW5kLXR5cGVzcGlyLWZyb250ZW5kLWp3dC1zZWNyZXQta2V5"),
        mapOf("JWT_ALGORITHM" to "HmacSHA256"),
    )

    "encrypt and decrypt text with jasypt" {
//        val encryptKey = System.getenv("JASYPT_PASSWORD")
//        val encryptAlgorithm = System.getenv("JASYPT_ALGORITHM")

        val jasypt = StandardPBEStringEncryptor().apply {
            setPassword(encryptKey)
            setAlgorithm(encryptAlgorithm)
        }

        listOfMap.forEach {
            it.forEach { (key, value) ->
                val encrypt = jasypt.encrypt(value)
                println("$key=$encrypt")
            }
        }

        val jwtExpiration = 86400
        val jwtRefreshExpiration = 86400 * 30

        println("JWT_ACCESS_EXPIRATION=${jasypt.encrypt(jwtExpiration.toString())}")
        println("JWT_REFRESH_EXPIRATION=${jasypt.encrypt(jwtRefreshExpiration.toString())}")
    }
})
