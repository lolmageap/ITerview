package cherhy.jung.gptinterview

import cherhy.jung.gptinterview.domain.question.FrameworkRepository
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.entity.FrameworkMenu
import jakarta.annotation.PostConstruct
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
    internal class InitFrameworkService(
        private val frameworkRepository: FrameworkRepository,
    ) {
        fun init() {
            frameworkRepository.saveAll(
                mutableListOf(
                    FrameworkMenu(FrameworkType.SPRING),
                    FrameworkMenu(FrameworkType.REACT),
                    FrameworkMenu(FrameworkType.EXPRESS),
                    FrameworkMenu(FrameworkType.NEXT),
                    FrameworkMenu(FrameworkType.NEST),
                    FrameworkMenu(FrameworkType.DJANGO),
                    FrameworkMenu(FrameworkType.FLASK),
                    FrameworkMenu(FrameworkType.FAST_API),
                    FrameworkMenu(FrameworkType.UNITY),
                    FrameworkMenu(FrameworkType.DOTNET),
                    FrameworkMenu(FrameworkType.LARAVEL),
                )
            )
        }
    }

}