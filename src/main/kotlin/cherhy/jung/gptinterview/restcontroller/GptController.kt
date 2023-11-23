package cherhy.jung.gptinterview.restcontroller

import cherhy.jung.gptinterview.domain.customer.AuthCustomer
import cherhy.jung.gptinterview.domain.question.QuestionHistoryReadService
import cherhy.jung.gptinterview.usecase.GptAnswerUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@Tag(name = "답변")
@RestController
@RequestMapping("/answers")
class GptController(
    private val gptAnswerUseCase: GptAnswerUseCase,
    private val questionHistoryReadService: QuestionHistoryReadService,
) {

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "답변 하기", description = "질문을 풀고 답안을 제출한 뒤 점수 및 피드백을 받는다.")
    fun postAndGet(
        @RequestBody gptRequest: GptRequest,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): String =
        gptAnswerUseCase.requestAnswerToGpt(authCustomer.customerId, gptRequest)

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/histories")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "답변 내역", description = "풀었던 질문들을 확인한다.")
    fun getAnswerHistories(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @Parameter(hidden = true) @PageableDefault(size = 20, page = 0) pageable: Pageable,
    ): List<AnswerResponse> =
        questionHistoryReadService.getAllQuestionHistories(authCustomer.customerId, pageable)
            .map(AnswerResponse::of)

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/histories/{token}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "답변 내역", description = "풀었던 질문의 답변 내용을 포함하여 조회한다.")
    fun getAnswerHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @PathVariable token: String,
    ): AnswerResponse =
        questionHistoryReadService.getQuestionHistory(authCustomer.customerId, token)
            .let(AnswerResponse::of)

}