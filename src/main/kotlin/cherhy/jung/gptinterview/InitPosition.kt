package cherhy.jung.gptinterview

import cherhy.jung.gptinterview.domain.position.PositionMenu
import cherhy.jung.gptinterview.domain.position.PositionRepository
import cherhy.jung.gptinterview.domain.position.PositionType
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
internal class InitPosition(
    private val initPositionService: InitPositionService,
    ) {

    @PostConstruct
    fun init() {
        initPositionService.init()
    }

    @Component
    @Transactional
    internal class InitPositionService(
        private val positionRepository: PositionRepository,
    ) {
        fun init() {
            positionRepository.saveAll(
                mutableListOf(
                    PositionMenu(PositionType.GAME, id = 1),
                    PositionMenu(PositionType.DATA_ANALYSIS, id = 2),
                    PositionMenu(PositionType.DATA_ENGINEER, id = 3),
                    PositionMenu(PositionType.BACKEND, id = 4),
                    PositionMenu(PositionType.FRONTEND, id = 5),
                    PositionMenu(PositionType.SECURITY, id = 6),
                    PositionMenu(PositionType.ANDROID, id = 7),
                    PositionMenu(PositionType.WEB, id = 8),
                    PositionMenu(PositionType.PUBLISHER, id = 9),
                    PositionMenu(PositionType.AI, id = 10),
                    PositionMenu(PositionType.BLOCKCHAIN, id = 11),
                    PositionMenu(PositionType.DBA, id = 12),
                )
            )
        }
    }

}