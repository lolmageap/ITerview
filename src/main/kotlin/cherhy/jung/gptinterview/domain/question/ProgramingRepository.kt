package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Programing
import org.springframework.data.jpa.repository.JpaRepository

interface ProgramingRepository: JpaRepository<Programing, Long> {
}