package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.domain.BaseDeleteEntity
import jakarta.persistence.*


@Entity
// *require 오 이코드는 제거해보는게 어떨까요? 삭제를 한다고 한다면 서비스에서 그냥 업데이트를 치는 코드를 만들게 하고, 서비스의 메소드명을 딜리트로 하면 될거 같아요.
// 그러면 Customer(BaseDeleteEntity)에 delete()라는 메서드가 생기고 조금 더 표현이 풍부해지겠네요. 아래 코드가 들어오면 쿼리쪽으로 조금 기능이 빠진거같아요.
class Customer(
    var name: String,

    val email: String,

    var password: String,

    val salt: String,

    @Column(unique = true)
    val token: String,

) : BaseDeleteEntity() { // 맨 앞에 탭이 붙어있는게 조금 그렇군요 이런것도 신경을 조금 써뽈가요?

    // 아래 코드는 Customer 의 권한인데, Customer 안에 변수로 넣어도 될거같고
    // 조인컬럼도 빼볼까요? fk를 안맺으려고 하신거 같은데, 이것은 쿼리로 테이블을 만들 떄 (resources/sql) 같은곳 또는
    // flyway 같은 것을 사용해서 테이블을 만들게 시키면 이 코드는 필요 없을거에요

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "customer_id")
    var customerAuthorities: List<CustomerAuthority> = mutableListOf(
        CustomerAuthority(role = CustomerRole.MEMBER)
    )

    fun editPassword(password: String) {
        this.password = password
    }

}