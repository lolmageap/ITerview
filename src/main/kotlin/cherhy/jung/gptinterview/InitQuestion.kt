package cherhy.jung.gptinterview

import cherhy.jung.gptinterview.domain.question.QuestionMenuRepository
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.entity.QuestionMenu
import jakarta.annotation.PostConstruct
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
    internal class InitQuestionService(
        private val questionMenuRepository: QuestionMenuRepository,
    ) {
        fun init() {
            questionMenuRepository.saveAll(
                mutableListOf(
                    QuestionMenu(QuestionType.DATABASE, id = 1),
                    QuestionMenu(QuestionType.NETWORK, id = 2),
                    QuestionMenu(QuestionType.DESIGN_PATTERN, id = 3),
                    QuestionMenu(QuestionType.TEST, id = 4),
                    QuestionMenu(QuestionType.OS, id = 5),
                    QuestionMenu(QuestionType.STRUCTURE, id = 6),
                    QuestionMenu(QuestionType.VCS, id = 7),
                    QuestionMenu(QuestionType.PROGRAMING, id = 8),
                    QuestionMenu(QuestionType.FRAMEWORK, id = 9),
                )
            )
        }
    }

}