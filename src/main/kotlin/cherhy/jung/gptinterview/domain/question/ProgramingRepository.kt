package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.ProgramingMenu
import org.springframework.data.jpa.repository.JpaRepository

interface ProgramingRepository: JpaRepository<ProgramingMenu, Long> {
}