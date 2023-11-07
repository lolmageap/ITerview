package cherhy.jung.gptinterview.annotation

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
@Transactional(readOnly = false)
annotation class WriteService(
    @get:AliasFor(annotation = Component::class) val value: String = "",
)