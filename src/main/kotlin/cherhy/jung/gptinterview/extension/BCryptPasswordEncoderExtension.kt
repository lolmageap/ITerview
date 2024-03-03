package cherhy.jung.gptinterview.extension

import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

fun BCryptPasswordEncoder.matchOrThrow(
    requestPassword: String,
    salt: String,
    originalPassword: String,
) {
    val password = requestPassword + salt
    val encodedPassword = this.encode(password)
    val isMatched = this.matches(encodedPassword, originalPassword)
    if (!isMatched)
        throw BadCredentialsException("password not match")
}