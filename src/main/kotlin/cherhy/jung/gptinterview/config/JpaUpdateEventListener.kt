package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.annotation.Description
import cherhy.jung.gptinterview.annotation.LoggingDisable
import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.external.cache.CacheWriteService
import jakarta.persistence.PostLoad
import jakarta.persistence.PostUpdate
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap

typealias Entity = Any
typealias UserKey = String
typealias FieldName = String

@Component
class JpaUpdateEventListener() {
    private lateinit var threadLocal: ThreadLocal<Principal>
    private lateinit var applicationEventPublisher: ApplicationEventPublisher
    private lateinit var cacheWriteService: CacheWriteService
    val entityMap = ConcurrentHashMap<UserKey, Map<FieldName, Log>>()

    constructor(
        threadLocal: ThreadLocal<Principal>,
        applicationEventPublisher: ApplicationEventPublisher,
        cacheWriteService: CacheWriteService,
    ) : this() {
        this.threadLocal = threadLocal
        this.applicationEventPublisher = applicationEventPublisher
        this.cacheWriteService = cacheWriteService
    }

    @PostLoad
    fun preUpdateEvent(entity: Entity) {
        val principal = threadLocal.get() ?: return
        val userId = principal.id
        val key = "$userId-${entity.name}"

        try {
            val stateBeforeUpdate = entity.extractFields()
            entityMap[key] = stateBeforeUpdate
            cacheWriteService.setEntity(key, stateBeforeUpdate)
        } finally {
            entityMap.remove(key)
        }
    }

    @PostUpdate
    fun postUpdateEvent(entity: Entity) {
        val principal = threadLocal.get() ?: return
        val userId = principal.id
        val key = "$userId-${entity.name}"

        val stateBeforeUpdate = entityMap[key] ?: return
        val stateAfterUpdate = entity.extractFields()

        val updatedFields = stateAfterUpdate.filter { (fieldName, log) ->
            stateBeforeUpdate[fieldName]?.value != log.value
        }

        if (updatedFields.isNotEmpty()) {
            TODO("applicationEventPublisher.publishEvent()")
        }
    }

    private val Entity.name: String
        get() = this::class.simpleName ?: ""

    private fun Entity.extractFields() =
        this.javaClass.declaredFields.map { field ->
            field.isAccessible = true
            field.getAnnotation(LoggingDisable::class.java)
                ?.let { return@map null }

            val value = field.get(this)
            val description = field.getAnnotation(Description::class.java)?.value

            field.name to Log(value, description)
        }
            .filterNotNull()
            .toMap()

    data class Log(
        val value: Any,
        val description: String?,
    )
}