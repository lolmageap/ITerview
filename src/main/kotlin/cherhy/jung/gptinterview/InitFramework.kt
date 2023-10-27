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
                    FrameworkMenu(FrameworkType.SPRING, id = 1),
                    FrameworkMenu(FrameworkType.REACT, id = 2),
                    FrameworkMenu(FrameworkType.EXPRESS, id = 3),
                    FrameworkMenu(FrameworkType.NEXT, id = 4),
                    FrameworkMenu(FrameworkType.NEST, id = 5),
                    FrameworkMenu(FrameworkType.DJANGO, id = 6),
                    FrameworkMenu(FrameworkType.FLASK, id = 7),
                    FrameworkMenu(FrameworkType.FAST_API, id = 8),
                    FrameworkMenu(FrameworkType.UNITY, id = 9),
                    FrameworkMenu(FrameworkType.DOTNET, id = 10),
                    FrameworkMenu(FrameworkType.LARAVEL, id = 11),
                )
            )
        }
    }

}