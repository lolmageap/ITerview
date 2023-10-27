package cherhy.jung.gptinterview

import cherhy.jung.gptinterview.domain.question.ProgramingRepository
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.entity.ProgramingMenu
import jakarta.annotation.PostConstruct
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
    internal class InitProgramingService(
        private val programingRepository: ProgramingRepository,
    ) {
        fun init() {
            programingRepository.saveAll(
                mutableListOf(
                    ProgramingMenu(ProgramingType.`C++`, id = 1),
                    ProgramingMenu(ProgramingType.`C#`, id = 2),
                    ProgramingMenu(ProgramingType.C, id = 3),
                    ProgramingMenu(ProgramingType.JAVA, id = 4),
                    ProgramingMenu(ProgramingType.JAVASCRIPT, id = 5),
                    ProgramingMenu(ProgramingType.RUST, id = 6),
                    ProgramingMenu(ProgramingType.KOTLIN, id = 7),
                    ProgramingMenu(ProgramingType.PYTHON, id = 8),
                    ProgramingMenu(ProgramingType.SWIFT, id = 9),
                    ProgramingMenu(ProgramingType.CSS, id = 10),
                    ProgramingMenu(ProgramingType.GO, id = 11),
                    ProgramingMenu(ProgramingType.PHP, id = 12),
                )
            )
        }
    }

}