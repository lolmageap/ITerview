package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.FrameworkMenu
import org.springframework.data.jpa.repository.JpaRepository

interface FrameworkRepository: JpaRepository<FrameworkMenu, Long> {
}