package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.domain.question.entity.Framework
import org.springframework.data.jpa.repository.JpaRepository

interface FrameworkRepository : JpaRepository<Framework, Long>