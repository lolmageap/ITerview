package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.QuestionHistoryDetailResponse
import cherhy.jung.gptinterview.controller.dto.QuestionResponse
import cherhy.jung.gptinterview.controller.dto.of
import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.exception.ClientResponse
import cherhy.jung.gptinterview.extension.reversedOffset
import cherhy.jung.gptinterview.external.cache.CacheReadService
import cherhy.jung.gptinterview.usecase.GetQuestionHistoriesUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus.OK
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@Tag(name = "질문")
@RestController
@RequestMapping("/questions")
class QuestionHistoryController(
    private val questionReadService: QuestionReadService,
    private val cacheReadService: CacheReadService,
    private val getQuestionHistoriesUseCase: GetQuestionHistoriesUseCase,
) {
    // TODO : history 를 cache 에 넣지 말고 직접 조회 하는 방식 으로 변경 -> method 에 @Cacheable 추가
    @ResponseStatus(OK)
    @GetMapping("/histories")
    @Operation(summary = "질문 내역", description = "조회했던 질문들을 확인한다.")
    fun getQuestionHistory(
        @AuthenticationPrincipal principal: Principal,
        @Parameter(hidden = true) @PageableDefault(size = 15, page = 0) pageable: Pageable,
    ): ClientResponse<List<QuestionResponse>> {
        val alreadyQuestions = cacheReadService.getQuestionTokens(
            customerId = principal.customerId,
            reversedOffset = pageable.reversedOffset,
            size = pageable.pageSize,
        )

        return questionReadService.getQuestionHistories(alreadyQuestions)
            .map(QuestionResponse::of)
            .let(ClientResponse.Companion::success)
    }

    @ResponseStatus(OK)
    @GetMapping("/histories/{token}")
    @Operation(summary = "질문 내역", description = "조회했던 질문의 내용을 포함하여 확인한다.")
    fun getQuestionHistory(
        @AuthenticationPrincipal principal: Principal,
        @PathVariable token: String,
    ) =
        getQuestionHistoriesUseCase.execute(principal.customerId, token)
            .map(QuestionHistoryDetailResponse::of)
            .let(ClientResponse.Companion::success)
}