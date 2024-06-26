package cherhy.jung.gptinterview.domain.customer

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.customer.entity.CustomerHistory
import org.springframework.transaction.event.TransactionalEventListener

@WriteService
class CustomerHistoryWriteService(
    private val customerHistoryRepository: CustomerHistoryRepository,
) {
    @TransactionalEventListener(value = [CustomerHistory::class])
    fun saveCustomerHistory(
        customerHistory: CustomerHistory,
    ) {
        customerHistoryRepository.save(customerHistory)
    }
}