package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.authority.AuthCustomer
import cherhy.jung.gptinterview.dependency.RedisReadService
import cherhy.jung.gptinterview.dependency.RedisWriteService
import cherhy.jung.gptinterview.domain.position.PositionType
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.util.getEnd
import cherhy.jung.gptinterview.util.getStart
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/question")
class QuestionController(
    private val questionReadService: QuestionReadService,
    private val redisReadService: RedisReadService,
    private val redisWriteService: RedisWriteService,
) {

    // 현재 읽기만 해도 redis 에 write 되는데 gpt api 에 답안을 제출한 문제들만 redis 에 write 할지 고민

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/history")
    fun getQuestionHistory(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
        @PageableDefault(size = 20, page = 0) pageable: Pageable,
    ): List<QuestionResponse> {

        val questionTokens = redisReadService.getQuestionTokens(
            customerId = authCustomer.customerId,
            start = pageable.getStart(),
            end = pageable.getEnd(),
        )

        return questionReadService.getQuestionHistories(questionTokens)
            .map(QuestionResponse::of)
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping
    fun getRandomQuestion(
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): QuestionResponse {
        val questionTokens = redisReadService.getQuestionTokens(authCustomer.customerId)

        return questionReadService.getQuestion(questionTokens)
            .let(QuestionResponse::of)
            .also {
                redisWriteService.addQuestionToken(authCustomer.customerId, it.token)
            }
    }


    @PreAuthorize("isAuthenticated()")
    @GetMapping("/{question-type}")
    fun getQuestionByQuestionType(
        @PathVariable(name = "question-type") questionType: QuestionType,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): QuestionResponse {
        val questionTokens = redisReadService.getQuestionTokens(authCustomer.customerId)

        return questionReadService.getQuestion(questionType, questionTokens)
            .let(QuestionResponse::of)
            .also {
                redisWriteService.addQuestionToken(authCustomer.customerId, it.token)
            }
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/PROGRAMING/{programing-type}")
    fun getProgramingQuestion(
        @PathVariable(name = "programing-type") programingType: ProgramingType,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): QuestionResponse {
        val questionTokens = redisReadService.getQuestionTokens(authCustomer.customerId)

        return questionReadService.getQuestion(programingType, questionTokens)
            .let(QuestionResponse::of)
            .also {
                redisWriteService.addQuestionToken(authCustomer.customerId, it.token)
            }
    }


    @PreAuthorize("isAuthenticated()")
    @GetMapping("/FRAMEWORK/{framework-type}")
    fun getFrameworkQuestion(
        @PathVariable(name = "framework-type") frameworkType: FrameworkType,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ): QuestionResponse {
        val questionTokens = redisReadService.getQuestionTokens(authCustomer.customerId)

        return questionReadService.getQuestion(frameworkType, questionTokens)
            .let(QuestionResponse::of)
            .also {
                redisWriteService.addQuestionToken(authCustomer.customerId, it.token)
            }
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/position/{position-type}")
    fun getQuestionByPositionType(
        @PathVariable(name = "position-type") positionType: PositionType,
        @AuthenticationPrincipal authCustomer: AuthCustomer,
    ) = "포지션 타입"

}