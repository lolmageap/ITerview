package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.authority.AuthCustomer
import cherhy.jung.gptinterview.dependency.RedisReadService
import cherhy.jung.gptinterview.dependency.RedisWriteService
import cherhy.jung.gptinterview.domain.position.PositionType
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.util.getEnd
import cherhy.jung.gptinterview.util.getStart
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/question")
class QuestionController(
    private val questionReadService: QuestionReadService,
    private val redisReadService: RedisReadService,
    private val redisWriteService: RedisWriteService,
) {

    // 현재 읽기만 해도 redis 에 write 되는데 gpt api 에 답안을 제출한 문제들만 redis 에 write 할지 고민

    @PreAuthorize("isAuthenticated()")
    @GetMapping
    fun getRandomQuestion(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @RequestBody questionRequest: QuestionRequest,
    ): QuestionResponse {
        val alreadyQuestion = redisReadService.getQuestionTokens(authCustomer.customerId)

        return questionReadService.getQuestion(questionRequest.toQuestionRequestS(), alreadyQuestion)
            .let(QuestionResponse::of)
            .also {
                redisWriteService.addQuestionToken(authCustomer.customerId, it.token)
            }
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/history")
    fun getQuestionHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @PageableDefault(size = 20, page = 0) pageable: Pageable,
    ): List<QuestionResponse> {

        val alreadyQuestion = redisReadService.getQuestionTokens(
            customerId = authCustomer.customerId,
            start = pageable.getStart(),
            end = pageable.getEnd(),
        )

        return questionReadService.getQuestionHistories(alreadyQuestion)
            .map(QuestionResponse::of)
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/position/{position-type}")
    fun getQuestionByPositionType(
        @PathVariable(name = "position-type") positionType: PositionType,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ) = "포지션 타입"

}