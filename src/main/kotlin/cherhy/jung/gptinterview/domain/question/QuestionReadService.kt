package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
    ) {

    fun getQuestion(): QuestionResponseS =
        questionRepository.findRandomQuestion()
        .let(QuestionResponseS::of)

}

