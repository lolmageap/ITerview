package cherhy.jung.gptinterview

import io.kotest.core.spec.style.StringSpec
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor

internal class GptInterviewApplicationTests : StringSpec({

    val listOfMap = listOf(
        mapOf("DATABASE_URL" to "jdbc:mysql://localhost:3501/iterview"),
        mapOf("DATABASE_USERNAME" to "root"),
        mapOf("DATABASE_PASSWORD" to "your-password"),
        mapOf("REDIS_HOST" to "localhost"),
        mapOf("REDIS_PORT" to "6379"),
        mapOf("MAIL_HOST" to "smtp.gmail.com"),
        mapOf("MAIL_PORT" to "587"),
        mapOf("MAIL_USERNAME" to "your-email"),
        mapOf("MAIL_PASSWORD" to "your-password"),
        mapOf("GPT_API_KEY" to "your-api-key"),
        mapOf("JWT_SECRET" to "your-secret"),
        mapOf("JWT_ALGORITHM" to "your-algorithm"),
    )

    "encrypt and decrypt text with jasypt" {
        val encryptKey = System.getenv("JASYPT_PASSWORD")
        val encryptAlgorithm = System.getenv("JASYPT_ALGORITHM")

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
