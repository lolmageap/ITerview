package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.domain.BaseDeleteEntity
import jakarta.persistence.*


@Entity
// 오 이코드는 제거해보는게 어떨까요? 삭제를 한다고 한다면 서비스에서 그냥 업데이트를 치는 코드를 만들게 하고, 서비스의 메소드명을 딜리트로 하면 될거 같아요.
// 그러면 Customer(BaseDeleteEntity)에 delete()라는 메서드가 생기고 조금 더 표현이 풍부해지겠네요. 아래 코드가 들어오면 쿼리쪽으로 조금 기능이 빠진거같아요.
class Customer(
    var name: String,

    val email: String,

    var password: String,

    val salt: String,

    @Column(unique = true)
    val token: String,

) : BaseDeleteEntity() {


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