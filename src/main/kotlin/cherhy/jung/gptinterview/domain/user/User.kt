package cherhy.jung.gptinterview.domain.user

import cherhy.jung.gptinterview.util.BaseDeleteEntity
import jakarta.persistence.Entity
import org.hibernate.annotations.SQLDelete


@Entity
@SQLDelete(sql = "update user set deleted = true where id = ?")
class User(
    var name: String,
    val email: String,
    var password: String,
) : BaseDeleteEntity() {

    var role: UserRole = UserRole.MEMBER
        get() = role

    fun update(name: String){
        this.name = name
    }

}