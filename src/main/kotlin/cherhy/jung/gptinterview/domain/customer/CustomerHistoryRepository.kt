package cherhy.jung.gptinterview.domain.customer

import org.springframework.data.jpa.repository.JpaRepository

interface CustomerHistoryRepository: JpaRepository<CustomerHistory, Long>
