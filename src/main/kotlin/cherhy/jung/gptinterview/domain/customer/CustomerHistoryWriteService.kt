package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.customer.entity.CustomerHistory
import org.springframework.context.event.EventListener

@WriteService
class CustomerHistoryWriteService(
    private val customerHistoryRepository: CustomerHistoryRepository,
) {
    @EventListener(value = [CustomerHistory::class])
    fun saveCustomerHistory(
        customerHistory: CustomerHistory,
    ) {
        customerHistoryRepository.save(customerHistory)
    }
}