package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
@WriteService
class QuestionReadService(private val questionRepository: QuestionRepository) {

    fun getQuestion() {}

}

