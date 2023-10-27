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
                    QuestionMenu(QuestionType.DATABASE),
                    QuestionMenu(QuestionType.NETWORK),
                    QuestionMenu(QuestionType.DESIGN_PATTERN),
                    QuestionMenu(QuestionType.TEST),
                    QuestionMenu(QuestionType.OS),
                    QuestionMenu(QuestionType.STRUCTURE),
                    QuestionMenu(QuestionType.VCS),
                    QuestionMenu(QuestionType.PROGRAMING),
                    QuestionMenu(QuestionType.FRAMEWORK),
                )
            )
        }
    }

}