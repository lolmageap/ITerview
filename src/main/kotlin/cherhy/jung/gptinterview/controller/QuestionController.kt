package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.QuestionReadService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/question")
class QuestionController(
    private val questionReadService: QuestionReadService,
) {

    @GetMapping
    fun get() = questionReadService.getQuestion()

}