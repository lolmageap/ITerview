package cherhy.jung.gptinterview.domain.customer.entity

import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.domain.customer.constant.CustomerHistoryType
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class CustomerHistory(
    val customerId: Long,
    val targetCustomerId: Long?,
    @Enumerated(EnumType.STRING)
    val type: CustomerHistoryType,
    val entityName: String,
    val entityDescription: String?,
    val fieldName: String,
    val fieldDescription: String?,
    val beforeValue: String?,
    val afterValue: String?,
): BaseEntity() {
    @Column(unique = true)
    val token: String = Generator.token()

    companion object {
        fun of(
            customerId: Long,
            targetCustomerId: Long?,
            type: CustomerHistoryType,
            entityName: String,
            entityDescription: String?,
            fieldName: String,
            fieldDescription: String?,
            beforeValue: String?,
            afterValue: String?,
        ) = CustomerHistory(
            customerId = customerId,
            targetCustomerId = targetCustomerId,
            type = type,
            entityName = entityName,
            entityDescription = entityDescription,
            fieldName = fieldName,
            fieldDescription = fieldDescription,
            beforeValue = beforeValue,
            afterValue = afterValue,
        )
    }
}