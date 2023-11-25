package cherhy.jung.gptinterview.restcontroller

import cherhy.jung.gptinterview.domain.customer.AuthCustomer
import cherhy.jung.gptinterview.usecase.GptAnswerUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@Tag(name = "GPT 요청")
@RestController
class GptController(
    private val gptAnswerUseCase: GptAnswerUseCase,
) {

    @PostMapping("/answers")
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "답변 하기", description = "질문을 풀고 답안을 제출한 뒤 점수 및 피드백을 받는다.")
    fun requestAnswer(
        @RequestBody gptRequest: GptRequest,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): String =
        gptAnswerUseCase.requestAnswerToGpt(authCustomer.customerId, gptRequest)

    @GetMapping("/answers/{token}")
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "답변 하기", description = "질문을 풀고 답안을 제출한 뒤 점수 및 피드백을 받는다.")
    fun getOnlyFeedback(
        @PathVariable token: String,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): String =
        gptAnswerUseCase.requestOnlyFeedbackToGpt(authCustomer.customerId, token)


}