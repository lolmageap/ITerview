package cherhy.jung.gptinterview.util

object SpecialCharacterValidator {
    fun contains(
        value: String,
    ) {
        val matches = specialCharacters.any(value::contains)
        if (!matches) error("특수문자를 포함해야 합니다.")
    }

    private val specialCharacters = arrayListOf("!", "@", "#", "\$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "=", "[")
}