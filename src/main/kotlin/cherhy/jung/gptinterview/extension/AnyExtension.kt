package cherhy.jung.gptinterview.extension

import cherhy.jung.gptinterview.annotation.Description
import cherhy.jung.gptinterview.annotation.LoggingDisable
import cherhy.jung.gptinterview.annotation.TargetCustomerId
import cherhy.jung.gptinterview.listener.ChangeValueCollector
import cherhy.jung.gptinterview.util.Entity

val Entity.className: String
    get() = this.javaClass.simpleName

fun Entity.extractFields() =
    this.javaClass.declaredFields.mapNotNull { field ->
        field.isAccessible = true
        field.getAnnotation(LoggingDisable::class.java)
            ?.let { return@mapNotNull null }

        val value = field.get(this)
        val description = field.getAnnotation(Description::class.java)?.value

        field.name to ChangeValueCollector(value, description)
    }.toMap()

val Entity.targetCustomerId: Long?
    get() = this.javaClass.declaredFields
        .first { it.getAnnotation(TargetCustomerId::class.java) != null }
        .let { field ->
            field.isAccessible = true
            field.get(this) as? Long
        }

val Entity.classDescription: String?
    get() = this.javaClass.getAnnotation(Description::class.java)?.value