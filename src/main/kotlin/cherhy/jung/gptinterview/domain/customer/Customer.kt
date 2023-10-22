package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.util.BaseDeleteEntity
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import org.hibernate.annotations.SQLDelete


@Entity
@SQLDelete(sql = "update customer set deleted = true where id = ?")
class Customer(
    var name: String,
    val email: String,
    var password: String,
    val token: String,
) : BaseDeleteEntity() {

    @OneToMany
    var customerAuthorities: List<CustomerAuthority> = mutableListOf(
        CustomerAuthority(CustomerRole.MEMBER)
    )

    fun update(name: String){
        this.name = name
    }

}