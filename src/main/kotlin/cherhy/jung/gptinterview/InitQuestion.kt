package cherhy.jung.gptinterview

import jakarta.annotation.PostConstruct
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
internal class InitQuestion(
    private val initQuestionService: InitQuestionService,
    ) {

    @PostConstruct
    fun init() {
        initQuestionService.init()
    }

    @Component
    @Transactional
    internal class InitQuestionService(private val em: EntityManager) {
        fun init() {

        }
    }

}