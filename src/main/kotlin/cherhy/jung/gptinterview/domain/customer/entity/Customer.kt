package cherhy.jung.gptinterview.domain.customer.entity

import cherhy.jung.gptinterview.domain.BaseDeleteEntity
import cherhy.jung.gptinterview.domain.customer.constant.CustomerRole
import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.*

@Entity
class Customer(
    var name: String,
    val username: String,

    @Enumerated(EnumType.STRING)
    val provider: Provider,

    val salt: String,
) : BaseDeleteEntity() {
    lateinit var password: String

    @Column(unique = true)
    val token: String = Generator.token

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "customer_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    val authorities = mutableListOf(
        CustomerAuthority(CustomerRole.MEMBER)
    )
}