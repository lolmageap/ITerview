package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.QuestionReadService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class QuestionController(
    private val questionReadService: QuestionReadService
) {

    @PostMapping
    fun get() = questionReadService.getQuestion()

}