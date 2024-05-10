package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.domain.BaseEntity
import jakarta.persistence.Entity

@Entity
class CustomerHistory(
    val customerId: Long,
    val targetCustomerId: Long,
    val type: HistoryType,
    val entityName: String,
    val entityDescription: String?,
    val fieldName: String,
    val fieldDescription: String?,
    val beforeValue: String?,
    val afterValue: String?,
): BaseEntity() {
    companion object {
        fun of(
            customerId: Long,
            targetCustomerId: Long,
            type: HistoryType,
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

enum class HistoryType {
    CREATE,
    UPDATE,
    DELETE,
}