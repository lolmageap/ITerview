package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.authority.AuthCustomer
import cherhy.jung.gptinterview.domain.position.PositionType
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/question")
class QuestionController(
    private val questionReadService: QuestionReadService,
) {

    // TODO: redis 의 question token not in 추가 -> repository
    @GetMapping
    fun getRandomQuestion() = questionReadService.getQuestion().let(QuestionResponse::of)

    @GetMapping("/{question-type}")
    fun getQuestionByQuestionType(
        @PathVariable(name = "question-type") questionType: QuestionType,
        @AuthenticationPrincipal authCustomer: AuthCustomer?,
        ) = questionReadService.getQuestion(questionType).let(QuestionResponse::of)

    @GetMapping("/PROGRAMING/{programing-type}")
    fun getProgramingQuestion(
        @PathVariable(name = "programing-type") programingType: ProgramingType,
        ) = questionReadService.getQuestion(programingType).let(QuestionResponse::of)

    @GetMapping("/FRAMEWORK/{framework-type}")
    fun getFrameworkQuestion(
        @PathVariable(name = "framework-type") frameworkType: FrameworkType,
        ) = questionReadService.getQuestion(frameworkType).let(QuestionResponse::of)

    @GetMapping("/position/{position-type}")
    fun getQuestionByPositionType(
        @PathVariable(name = "position-type") positionType: PositionType,
        ) = "포지션 타입"

}