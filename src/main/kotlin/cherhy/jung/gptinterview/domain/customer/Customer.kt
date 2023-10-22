package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.util.BaseDeleteEntity
import jakarta.persistence.Entity
import org.hibernate.annotations.SQLDelete


@Entity
@SQLDelete(sql = "update customer set deleted = true where id = ?")
class Customer(
    var name: String,
    val email: String,
    var password: String,
) : BaseDeleteEntity() {

    var role: CustomerRole = CustomerRole.MEMBER
        get() = role

    fun update(name: String){
        this.name = name
    }

}