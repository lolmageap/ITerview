package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.domain.BaseDeleteEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.*


@Entity
class Customer(
    var name: String,

    val email: String,

    var password: String,

    val salt: String,

) : BaseDeleteEntity() {

    @Column(unique = true)
    val token: String = Generator.generateToken()

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "customer_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var customerAuthorities: List<CustomerAuthority> = mutableListOf(
        CustomerAuthority(CustomerRole.MEMBER)
    )

}

@Entity
class CustomerAuthority(
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    val role: CustomerRole,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
)

enum class CustomerRole(private val text: String) {
    MEMBER("일반 회원"), ADMIN("관리자")
}