package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.dto.QuestionRequestS
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS
import cherhy.jung.gptinterview.exception.DomainName.QUESTION
import cherhy.jung.gptinterview.exception.NotFoundException

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
) {

    fun getQuestion(questionRequestS: QuestionRequestS, alreadyQuestion: MutableList<String>): QuestionResponseS =
        questionRepository.findByQuestionRequestS(questionRequestS, alreadyQuestion)
            .firstNotNullOfOrNull {
                it.let(QuestionResponseS::of)
            }
            ?: throw NotFoundException(QUESTION)

    fun getQuestionHistories(alreadyQuestion: MutableList<String>): List<QuestionResponseS> =
        questionRepository.findByTokensIn(alreadyQuestion)
            .map(QuestionResponseS::of)
}

