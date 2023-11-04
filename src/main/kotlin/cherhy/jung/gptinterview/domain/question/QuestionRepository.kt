package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Question
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface QuestionRepository: JpaRepository<Question, Long>, QuestionRepositoryCustom {

    @Query(value = "SELECT q FROM Question q where q.token not in :tokens ORDER BY RAND() LIMIT 1")
    fun findTopByRandom(@Param(value = "tokens") tokens: MutableList<String>): Question?

}