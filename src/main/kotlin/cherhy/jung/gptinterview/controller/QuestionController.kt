package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.redis.RedisReadService
import cherhy.jung.gptinterview.redis.RedisWriteService
import cherhy.jung.gptinterview.util.getEnd
import cherhy.jung.gptinterview.util.getStart
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus.OK
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@Tag(name = "질문")
@RestController
@RequestMapping("/questions")
class QuestionController(
    private val questionReadService: QuestionReadService,
    private val redisReadService: RedisReadService,
    private val redisWriteService: RedisWriteService,
) {

    @PreAuthorize("isAuthenticated()")
    @GetMapping
    @ResponseStatus(OK)
    @Operation(summary = "질문 받기", description = "요청에 맞게 질문을 반환한다.")
    fun getRandomQuestion(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @ModelAttribute questionRequest: QuestionRequest,
    ): QuestionResponse {
        val alreadyQuestions = redisReadService.getQuestionTokens(authCustomer.customerId)

        return questionReadService.getQuestion(questionRequest.toQuestionRequestS(), alreadyQuestions)
            .let(QuestionResponse::of)
            .also {
                redisWriteService.addQuestionToken(authCustomer.customerId, it.token)
            }
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/histories")
    @ResponseStatus(OK)
    @Operation(summary = "질문 내역", description = "조회했던 질문들을 확인한다.")
    fun getQuestionHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @Parameter(hidden = true) @PageableDefault(size = 15, page = 0) pageable: Pageable,
    ): List<QuestionResponse> {

        val alreadyQuestions = redisReadService.getQuestionTokens(
            customerId = authCustomer.customerId,
            start = pageable.getStart(),
            end = pageable.getEnd(),
        )

        return questionReadService.getQuestionHistories(alreadyQuestions)
            .map(QuestionResponse::of)
    }

}