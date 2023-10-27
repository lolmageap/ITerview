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
                    ProgramingMenu(ProgramingType.`C++`),
                    ProgramingMenu(ProgramingType.`C#`),
                    ProgramingMenu(ProgramingType.C),
                    ProgramingMenu(ProgramingType.JAVA),
                    ProgramingMenu(ProgramingType.JAVASCRIPT),
                    ProgramingMenu(ProgramingType.RUST),
                    ProgramingMenu(ProgramingType.KOTLIN),
                    ProgramingMenu(ProgramingType.PYTHON),
                    ProgramingMenu(ProgramingType.SWIFT),
                    ProgramingMenu(ProgramingType.CSS),
                    ProgramingMenu(ProgramingType.GO),
                    ProgramingMenu(ProgramingType.PHP),
                )
            )
        }
    }

}