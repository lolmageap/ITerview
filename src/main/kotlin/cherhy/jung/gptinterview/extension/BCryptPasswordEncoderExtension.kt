package cherhy.jung.gptinterview.extension

import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

fun BCryptPasswordEncoder.matchOrThrow(
    rawPassword: String,
    salt: String,
    encodedPassword: String,
) {
    val password = rawPassword + salt
    val isMatched = this.matches(password, encodedPassword)
    if (!isMatched)
        throw BadCredentialsException("password not match")
}