package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.question.QuestionHistoryReadService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus.OK
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

// 해당 패키지에 dto 패키지를 만들고 그 안에 DTO들은 몰아넣어도~ 괜찮겠네요~

@Tag(name = "답변")
@RestController
@RequestMapping("/answers")
class AnswerController(
    private val questionHistoryReadService: QuestionHistoryReadService,
) {

    @PreAuthorize("isAuthenticated()") // *require seucirtyconfig에서 정의해도 괜찮아보여요. 대부분이 isAuthenticated일거고 config만 보면 어느 API가 무슨 권한이 필요한지 알 수 있거든요.
    @GetMapping("/histories")
    @ResponseStatus(OK) // 해당 코드가 필요할까요?
    @Operation(summary = "답변 내역", description = "풀었던 질문들을 확인한다.")
    fun getAnswerHistories(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @Parameter(hidden = true) @PageableDefault(size = 15, page = 0) pageable: Pageable,
    ): List<AnswerResponse> =
        questionHistoryReadService.getAllQuestionHistories(authCustomer.customerId, pageable)
            .map(AnswerResponse::of)

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/histories/{token}")
    @ResponseStatus(OK)
    @Operation(summary = "답변 내역", description = "풀었던 질문의 답변 내용을 포함하여 조회한다.")
    fun getAnswerHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @PathVariable token: String,
    ): AnswerResponse =
        questionHistoryReadService.getQuestionHistory(authCustomer.customerId, token)
            .let(AnswerResponse::of)

}