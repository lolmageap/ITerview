package cherhy.jung.gptinterview.domain.customer

import org.springframework.stereotype.Service

@Service
class CustomerHistoryReadService(
    private val customerHistoryRepository: CustomerHistoryRepository,
)