package cherhy.jung.gptinterview.domain.customer

import jakarta.persistence.*

@Entity
class CustomerAuthority(
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    val role: CustomerRole,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
)