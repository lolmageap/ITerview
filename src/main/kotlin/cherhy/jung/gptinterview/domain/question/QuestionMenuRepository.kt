package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.QuestionMenu
import org.springframework.data.jpa.repository.JpaRepository

interface QuestionMenuRepository: JpaRepository<QuestionMenu, Long> {
}