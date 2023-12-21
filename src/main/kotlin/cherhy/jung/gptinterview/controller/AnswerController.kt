package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.AnswerResponse
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.question.QuestionHistoryReadService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*


@Tag(name = "답변")
@RestController
@RequestMapping("/answers")
class AnswerController(
    private val questionHistoryReadService: QuestionHistoryReadService,
) {

    @GetMapping("/histories")
    @Operation(summary = "답변 내역", description = "풀었던 질문들을 확인한다.")
    fun getAnswerHistories(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @Parameter(hidden = true) @PageableDefault(size = 15, page = 0) pageable: Pageable,
    ): List<AnswerResponse> =
        questionHistoryReadService.getAllQuestionHistories(authCustomer.customerId, pageable)
            .map(AnswerResponse::of)

    @GetMapping("/histories/{token}")
    @Operation(summary = "답변 내역", description = "풀었던 질문의 답변 내용을 포함하여 조회한다.")
    fun getAnswerHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @PathVariable token: String,
    ): AnswerResponse =
        questionHistoryReadService.getQuestionHistory(authCustomer.customerId, token)
            .let(AnswerResponse::of)

}