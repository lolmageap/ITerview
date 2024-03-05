package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.GptRequest
import cherhy.jung.gptinterview.controller.dto.GptResponse
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.usecase.GptAnswerUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus.CREATED
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@Tag(name = "GPT 요청")
@RestController
class GptController(
    private val gptAnswerUseCase: GptAnswerUseCase,
) {
    @PostMapping("/answers")
    @ResponseStatus(CREATED)
    @Operation(summary = "답변 하기", description = "질문을 풀고 답안을 제출한 뒤 점수 및 피드백을 받는다.")
    fun requestAnswer(
        @RequestBody request: GptRequest,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): GptResponse =
        gptAnswerUseCase.requestAnswerToGpt(authCustomer.customerId, request)
            .let(GptResponse::of)

    @GetMapping("/answers/{token}")
    @ResponseStatus(CREATED)
    @Operation(summary = "답안 요청", description = "질문을 풀지 않고 모범 답안을 받는다.")
    fun getOnlyFeedback(
        @PathVariable token: String,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): GptResponse =
        gptAnswerUseCase.requestOnlyAnswerKeyToGpt(authCustomer.customerId, token)
            .let(GptResponse::of)
}