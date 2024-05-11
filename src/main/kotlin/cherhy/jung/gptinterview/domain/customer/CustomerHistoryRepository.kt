package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.domain.customer.entity.CustomerHistory
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerHistoryRepository: JpaRepository<CustomerHistory, Long>
