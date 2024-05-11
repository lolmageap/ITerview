package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.domain.customer.CustomerHistory
import cherhy.jung.gptinterview.domain.customer.HistoryType
import cherhy.jung.gptinterview.extension.classDescription
import cherhy.jung.gptinterview.extension.className
import cherhy.jung.gptinterview.extension.extractFields
import cherhy.jung.gptinterview.extension.targetCustomerId
import cherhy.jung.gptinterview.util.Entity
import jakarta.persistence.PreRemove
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class JpaDeleteEventListener() {
    private lateinit var threadLocal: ThreadLocal<Principal>
    private lateinit var applicationEventPublisher: ApplicationEventPublisher

    constructor(
        threadLocal: ThreadLocal<Principal>,
        applicationEventPublisher: ApplicationEventPublisher,
    ) : this() {
        this.threadLocal = threadLocal
        this.applicationEventPublisher = applicationEventPublisher
    }

    @PreRemove
    fun preRemoveEvent(entity: Entity) {
        val principal = threadLocal.get() ?: return
        val customerId = principal.customerId

        val deletedFields = entity.extractFields()
        deletedFields.forEach { (fieldName, deletedField) ->
            val history = CustomerHistory.of(
                customerId = customerId,
                targetCustomerId = entity.targetCustomerId,
                type = HistoryType.DELETE,
                entityName = entity.className,
                entityDescription = entity.classDescription,
                fieldName = fieldName,
                fieldDescription = deletedField.description,
                beforeValue = deletedField.value.toString(),
                afterValue = null,
            )
            applicationEventPublisher.publishEvent(history)
        }
    }
}