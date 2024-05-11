package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.domain.customer.entity.CustomerHistory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class CustomerHistoryWriteService(
    private val customerHistoryRepository: CustomerHistoryRepository,
) {
    @EventListener(CustomerHistory::class)
    fun saveCustomerHistory(
        customerHistory: CustomerHistory,
    ) =
        customerHistoryRepository.save(customerHistory)
}