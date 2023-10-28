package cherhy.jung.gptinterview.domain.position

import org.springframework.data.jpa.repository.JpaRepository

interface PositionRepository: JpaRepository<PositionMenu, Long> {
}