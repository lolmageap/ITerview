package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.QuestionRequest
import cherhy.jung.gptinterview.controller.dto.QuestionResponse
import cherhy.jung.gptinterview.controller.dto.toQuestionRequestS
import cherhy.jung.gptinterview.domain.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.exception.ClientResponse
import cherhy.jung.gptinterview.external.redis.RedisReadService
import cherhy.jung.gptinterview.external.redis.RedisWriteService
import cherhy.jung.gptinterview.extension.end
import cherhy.jung.gptinterview.extension.start
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
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
    @GetMapping
    @Operation(summary = "질문 받기", description = "요청에 맞게 질문을 반환한다.")
    fun getRandomQuestion(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @ModelAttribute request: QuestionRequest,
    ): ClientResponse<QuestionResponse> {
        val alreadyQuestions = redisReadService.getQuestionTokens(authCustomer.id)

        return questionReadService.getQuestion(request.toQuestionRequestS(), alreadyQuestions)
            .let(QuestionResponse::of)
            .let {
                redisWriteService.addQuestionToken(authCustomer.id, it.token)
                ClientResponse.success(it)
            }
    }

    @GetMapping("/histories")
    @Operation(summary = "질문 내역", description = "조회했던 질문들을 확인한다.")
    fun getQuestionHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @Parameter(hidden = true) @PageableDefault(size = 15, page = 0) pageable: Pageable,
    ): ClientResponse<List<QuestionResponse>> {

        val alreadyQuestions = redisReadService.getQuestionTokens(
            customerId = authCustomer.id,
            start = pageable.start,
            end = pageable.end,
        )

        return questionReadService.getQuestionHistories(alreadyQuestions)
            .map(QuestionResponse::of)
            .let(ClientResponse.Companion::success)
    }
}