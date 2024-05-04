package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.QuestionHistoryDetailResponse
import cherhy.jung.gptinterview.controller.dto.QuestionResponse
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.exception.ClientResponse
import cherhy.jung.gptinterview.extension.end
import cherhy.jung.gptinterview.extension.start
import cherhy.jung.gptinterview.external.cache.CacheReadService
import cherhy.jung.gptinterview.usecase.GetQuestionHistoriesUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "질문")
@RestController
@RequestMapping("/questions")
class QuestionHistoryController(
    private val questionReadService: QuestionReadService,
    private val cacheReadService: CacheReadService,
    private val getQuestionHistoriesUseCase: GetQuestionHistoriesUseCase,
) {
    // TODO : history 를 cache 에 넣지 말고 직접 조회 하는 방식 으로 변경 -> method 에 @Cacheable 추가
    @GetMapping("/histories")
    @Operation(summary = "질문 내역", description = "조회했던 질문들을 확인한다.")
    fun getQuestionHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @Parameter(hidden = true) @PageableDefault(size = 15, page = 0) pageable: Pageable,
    ): ClientResponse<List<QuestionResponse>> {
        val alreadyQuestions = cacheReadService.getQuestionTokens(
            customerId = authCustomer.id,
            start = pageable.start,
            end = pageable.end,
        )

        return questionReadService.getQuestionHistories(alreadyQuestions)
            .map(QuestionResponse::of)
            .let(ClientResponse.Companion::success)
    }

    @GetMapping("/histories/{token}")
    @Operation(summary = "질문 내역", description = "조회했던 질문의 내용을 포함하여 확인한다.")
    fun getQuestionHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @PathVariable token: String,
    ) =
        getQuestionHistoriesUseCase.execute(authCustomer.id, token)
            .map(QuestionHistoryDetailResponse::of)
            .let(ClientResponse.Companion::success)
}