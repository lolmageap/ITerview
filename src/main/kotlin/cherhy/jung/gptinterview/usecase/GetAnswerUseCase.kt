package cherhy.jung.gptinterview.usecase

import cherhy.jung.gptinterview.annotation.UseCase
import cherhy.jung.gptinterview.domain.question.AnswerReadService
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import cherhy.jung.gptinterview.domain.question.vo.AnswerDetailResponseVo

@UseCase
class GetAnswerUseCase(
    private val answerReadService: AnswerReadService,
    private val questionReadService: QuestionReadService,
) {
    fun execute(userId: Long, token: String): AnswerDetailResponseVo {
        val answer = answerReadService.getAnswer(userId, token)
        val question = questionReadService.getQuestionById(answer.questionId)
        return AnswerDetailResponseVo.of(answer, question)
    }
}