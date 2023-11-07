package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory
import org.springframework.data.jpa.repository.JpaRepository

interface QuestionHistoryRepository : JpaRepository<QuestionHistory, Long> {


}