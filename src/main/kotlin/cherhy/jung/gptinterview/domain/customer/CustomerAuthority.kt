package cherhy.jung.gptinterview.domain.customer

import jakarta.persistence.*


@Entity
class CustomerAuthority(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    // 기본적으로 Enum은 @Column을 정의해서 길이를 조금 넣어볼까요?
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    val role: CustomerRole,
)