package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Question
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface QuestionRepository: JpaRepository<Question, Long>, QuestionRepositoryCustom {

    @Query(value = "SELECT q FROM Question q ORDER BY RAND() LIMIT 1")
    fun findAllOrderByRandom(): Question

}