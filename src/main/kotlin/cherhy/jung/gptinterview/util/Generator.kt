package cherhy.jung.gptinterview.util

import java.time.LocalDate
import java.util.*

object Generator {

    fun generateToken(): String {
        val now = LocalDate.now().toString().replace("-", "")
        val uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 12)
        return "$now-$uuid"
    }

    fun generateSalt(): String {
        return UUID.randomUUID().toString().replace("-", "")
    }

}