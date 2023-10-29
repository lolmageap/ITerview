package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.util.BaseDeleteEntity
import jakarta.persistence.*
import org.hibernate.annotations.SQLDelete


@Entity
@SQLDelete(sql = "update customer set deleted = true where id = ?")
class Customer(
    var name: String,

    val email: String,

    var password: String,

    val salt: String,

    @Column(unique = true)
    val token: String,

) : BaseDeleteEntity() {

    @JoinColumn(name = "customer_id")
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    var customerAuthorities: List<CustomerAuthority> = mutableListOf(
        CustomerAuthority(role = CustomerRole.MEMBER)
    )

}