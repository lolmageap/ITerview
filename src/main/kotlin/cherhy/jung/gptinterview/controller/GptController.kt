package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.customer.AuthCustomer
import cherhy.jung.gptinterview.usecase.GptAnswerUseCase
import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/answer")
class GptController(
    private val gptAnswerUseCase: GptAnswerUseCase,
) {

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.CREATED)
    fun postAndGet(
        @RequestBody gptRequest: GptRequest,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): String =
        gptAnswerUseCase.requestAnswerToGpt(authCustomer.customerId, gptRequest)

}