package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.QuestionRequest
import cherhy.jung.gptinterview.controller.dto.QuestionResponse
import cherhy.jung.gptinterview.controller.dto.toQuestionRequestS
import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.exception.ClientResponse
import cherhy.jung.gptinterview.external.cache.CacheReadService
import cherhy.jung.gptinterview.external.cache.CacheWriteService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@Tag(name = "질문")
@RestController
@RequestMapping("/questions")
class QuestionController(
    private val questionReadService: QuestionReadService,
    private val cacheReadService: CacheReadService,
    private val cacheWriteService: CacheWriteService,
) {
    @GetMapping
    @Operation(summary = "질문 받기 (질문 조회)", description = "요청에 맞게 질문을 반환한다.")
    fun getRandomQuestion(
        @AuthenticationPrincipal principal: Principal,
        @ModelAttribute request: QuestionRequest,
    ): ClientResponse<QuestionResponse> {
        val alreadyQuestions = cacheReadService.getQuestionTokens(principal.customerId)

        return questionReadService.getQuestion(request.toQuestionRequestS(), alreadyQuestions)
            .let(QuestionResponse::of)
            .let {
                cacheWriteService.addQuestionToken(principal.customerId, it.token)
                ClientResponse.success(it)
            }
    }

    @PostMapping("/attributes")
    @Operation(summary = "마지막에 사용한 질문의 속성", description = "마지막에 사용한 질문의 속성을 캐시에 저장한다.")
    fun getQuestionAttributes(
        @AuthenticationPrincipal principal: Principal,
        @ModelAttribute request: QuestionRequest,
    ) =
        cacheWriteService.addQuestionAttributes(principal.customerId, request)
            .let(ClientResponse.Companion::success)

    @GetMapping("/attributes")
    @Operation(summary = "마지막에 사용한 질문의 속성", description = "마지막에 사용한 질문의 속성을 캐시에서 가져온다.")
    fun getQuestionAttributes(
        @AuthenticationPrincipal principal: Principal,
    ) =
        cacheReadService.getQuestionAttributes(principal.customerId)
            .let(ClientResponse.Companion::success)
}