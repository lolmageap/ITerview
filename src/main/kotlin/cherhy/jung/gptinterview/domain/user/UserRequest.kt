package cherhy.jung.gptinterview.domain.user

data class UserRequest(
    val name: String,
    val email: String,
    var password: String,
) {
    fun changePassword(password: String) {
        this.password = password
    }
}

fun UserRequest.toUser(): User = User(name, email, password)