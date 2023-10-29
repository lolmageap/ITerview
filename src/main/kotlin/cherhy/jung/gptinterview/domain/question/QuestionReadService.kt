package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
    ) {

    fun getQuestion() {}

}

