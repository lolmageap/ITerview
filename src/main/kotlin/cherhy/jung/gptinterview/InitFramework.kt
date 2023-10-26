package cherhy.jung.gptinterview

import jakarta.annotation.PostConstruct
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional


@Component
internal class InitFramework(
    private val initFramework: InitFrameworkService,
) {

    @PostConstruct
    fun init() {
        initFramework.init()
    }

    @Component
    @Transactional
    internal class InitFrameworkService(private val em: EntityManager) {
        fun init() {

        }
    }

}