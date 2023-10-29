package cherhy.jung.gptinterview.domain.question

import cherhy.jung.gptinterview.annotation.ReadService
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.dto.QuestionResponseS

@ReadService
class QuestionReadService(
    private val questionRepository: QuestionRepository,
    ) {

    fun getQuestion(): QuestionResponseS =
        questionRepository.findAllOrderByRandom()
            .let(QuestionResponseS::of)

    fun getQuestion(questionType: QuestionType): QuestionResponseS =
        questionRepository.findByQuestionType(questionType)
            .firstNotNullOf {
                it.let(QuestionResponseS::of)
            }

    fun getQuestion(programingType: ProgramingType): QuestionResponseS =
        questionRepository.findByProgramingType(programingType)
            .firstNotNullOf {
                it.let(QuestionResponseS::of)
            }

    fun getQuestion(frameworkType: FrameworkType): QuestionResponseS =
        questionRepository.findByFrameworkType(frameworkType)
            .firstNotNullOf {
                it.let(QuestionResponseS::of)
            }

}

