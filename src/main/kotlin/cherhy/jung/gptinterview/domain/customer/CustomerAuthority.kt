package cherhy.jung.gptinterview.domain.customer

import jakarta.persistence.*


@Entity
class CustomerAuthority(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @Enumerated(EnumType.STRING)
    val role: CustomerRole,
)