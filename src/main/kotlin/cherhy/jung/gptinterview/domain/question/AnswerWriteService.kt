package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.question.entity.Answer
import cherhy.jung.gptinterview.domain.question.vo.AnswerResponseVo

@WriteService
class AnswerWriteService(
    private val answerRepository: AnswerRepository,
) {
    fun addAnswer(answer: Answer) =
        answerRepository.save(answer)
            .let(AnswerResponseVo::of)
}