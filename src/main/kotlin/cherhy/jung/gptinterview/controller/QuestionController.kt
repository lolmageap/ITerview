package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.position.PositionType
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/question")
class QuestionController(
    private val questionReadService: QuestionReadService,
) {

    @GetMapping
    fun getRandomQuestion() = questionReadService.getQuestion().let(QuestionResponse::of)

    @GetMapping("/{question-type}")
    fun getQuestionByQuestionType(@PathVariable(name = "question-type") questionType: QuestionType) = "질문타입"

    @GetMapping("/position/{position-type}")
    fun getQuestionByPositionType(@PathVariable(name = "position-type") positionType: PositionType) = "포지션타입"

}