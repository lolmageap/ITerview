package cherhy.jung.gptinterview.util

object RegexGenerator {
    val email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\$".toRegex()
    val phone = "^\\d{3}-\\d{3,4}-\\d{4}\$".toRegex()
    val date = "^\\d{4}-\\d{2}-\\d{2}\$".toRegex()
    val time = "^\\d{2}:\\d{2}\$".toRegex()
    val dateTime = "^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}\$".toRegex()
    val url = "^http[s]?://[^\\s]+\$".toRegex()
    val ip = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\$".toRegex()

    val number = "^[0-9]*\$".toRegex()
    val alphabet = "^[a-zA-Z]*\$".toRegex()
    val korean = "^[가-힣]*\$".toRegex()
    val specialCharacter = "^[!@#\$%^&*()_+\\-=\\[\\]{};':\\\"\\\\|,.<>\\/?]*\$".toRegex()
}