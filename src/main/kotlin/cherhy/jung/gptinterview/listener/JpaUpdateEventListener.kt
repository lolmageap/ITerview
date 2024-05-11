package cherhy.jung.gptinterview.listener

import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.domain.customer.constant.CustomerHistoryType
import cherhy.jung.gptinterview.domain.customer.entity.CustomerHistory
import cherhy.jung.gptinterview.extension.classDescription
import cherhy.jung.gptinterview.extension.className
import cherhy.jung.gptinterview.extension.extractFields
import cherhy.jung.gptinterview.extension.targetCustomerId
import cherhy.jung.gptinterview.external.cache.CacheReadService
import cherhy.jung.gptinterview.external.cache.CacheWriteService
import cherhy.jung.gptinterview.util.Entity
import cherhy.jung.gptinterview.util.FieldName
import cherhy.jung.gptinterview.util.UserKey
import jakarta.persistence.PostLoad
import jakarta.persistence.PostUpdate
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap

@Component
class JpaUpdateEventListener() {
    private lateinit var threadLocal: ThreadLocal<Principal>
    private lateinit var applicationEventPublisher: ApplicationEventPublisher
    private lateinit var cacheWriteService: CacheWriteService
    private lateinit var cacheReadService: CacheReadService
    val entityMap = ConcurrentHashMap<UserKey, Map<FieldName, ChangeValueCollector>>()

    constructor(
        threadLocal: ThreadLocal<Principal>,
        applicationEventPublisher: ApplicationEventPublisher,
        cacheWriteService: CacheWriteService,
        cacheReadService: CacheReadService,
    ) : this() {
        this.threadLocal = threadLocal
        this.applicationEventPublisher = applicationEventPublisher
        this.cacheWriteService = cacheWriteService
        this.cacheReadService = cacheReadService
    }

    @PostLoad
    fun preUpdateEvent(entity: Entity) {
        val principal = threadLocal.get() ?: return
        val userId = principal.customerId
        val key = "$userId-${entity.className}"

        try {
            val stateBeforeUpdate = entity.extractFields()
            entityMap[key] = stateBeforeUpdate
            cacheWriteService.setBeforeValue(key, stateBeforeUpdate)
        } finally {
            entityMap.remove(key)
        }
    }

    @PostUpdate
    fun postUpdateEvent(entity: Entity) {
        val principal = threadLocal.get() ?: return
        val customerId = principal.customerId
        val key = "$customerId-${entity.className}"

        val stateBeforeUpdate = cacheReadService.getBeforeValue(key)
        val stateAfterUpdate = entity.extractFields()

        stateAfterUpdate.forEach { (fieldName, updatedField) ->
            val beforeValue = stateBeforeUpdate[fieldName]?.value
            val afterValue = updatedField.value

            if (beforeValue != afterValue) {
                val history = CustomerHistory.of(
                    customerId = customerId,
                    targetCustomerId = entity.targetCustomerId,
                    type = CustomerHistoryType.UPDATE,
                    entityName = entity.className,
                    entityDescription = entity.classDescription,
                    fieldName = fieldName,
                    fieldDescription = updatedField.description,
                    beforeValue = beforeValue.toString(),
                    afterValue = afterValue.toString(),
                )

                applicationEventPublisher.publishEvent(history)
            }
        }
    }
}