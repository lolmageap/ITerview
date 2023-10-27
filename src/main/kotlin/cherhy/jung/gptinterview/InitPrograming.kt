package cherhy.jung.gptinterview

import jakarta.annotation.PostConstruct
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
internal class InitPrograming(
    private val initPrograming: InitProgramingService,
    ) {

    @PostConstruct
    fun init() {
        initPrograming.init()
    }

    @Component
    @Transactional
    internal class InitProgramingService(private val em: EntityManager) {
        fun init() {

        }
    }

}