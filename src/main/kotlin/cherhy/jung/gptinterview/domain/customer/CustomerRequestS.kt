package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.util.Generator

data class CustomerRequestS(
    val name: String,
    val email: String,
    var password: String,
) {
    val salt: String = Generator.generateSalt()

    fun toCustomer(): Customer = Customer(
        name = name,
        email = email,
        password = password,
        token = Generator.generateToken(),
        salt = salt,
    )
}

// 확장함수로 해야할까요?~
// 직접 만든 클래스는 확장함수를 만들지 않아도 될것 같아요.
// 자바나 스프링에서 제공하는 클래스(내가 수정 못하는) 그런 애들은 만들만 하겠네요!
