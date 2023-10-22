package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.Entity


@Entity
class CustomerAuthority(
    role: CustomerRole
) : BaseEntity()