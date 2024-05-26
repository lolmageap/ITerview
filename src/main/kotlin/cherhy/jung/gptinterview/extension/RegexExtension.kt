package cherhy.jung.gptinterview.extension

fun Regex.min(size: Int) = "$this|^.{${size},}\$".toRegex()
fun Regex.max(size: Int) = "$this|^.{0,${size}}\$".toRegex()
fun Regex.range(min: Int, max: Int) = "$this|^.{${min},${max}}\$".toRegex()

operator fun Regex.plus(other: Regex): Regex =
    Regex("(?=.*${this.pattern})(?=.*${other.pattern}).*")

fun Regex.exclude(vararg specialCharacters: String): Regex {
    val original = this.pattern
    val exclude = specialCharacters.joinToString("")
    val excludeRegex = "[$exclude]".toRegex()
    val newRegex = original.replace(excludeRegex.toString(), "")
    return newRegex.toRegex()
}