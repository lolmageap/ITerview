package cherhy.jung.gptinterview.domain.user

import org.springframework.data.repository.kotlin.CoroutineCrudRepository


interface UserRepository : CoroutineCrudRepository<User, Long> {

    fun existsByEmail(email: String): Boolean
    fun findByEmail(email: String): User?

}