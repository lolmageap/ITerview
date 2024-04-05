package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.entity.Answer
import cherhy.jung.gptinterview.domain.question.entity.Question

data class AnswerResponseVo(
    val id: Long,
    val customerId: Long,
    val questionId: Long,
    val answer: String,
    val feedback: String,
    val token: String,
    val createdAt: String,
    val updatedAt: String,
) {
    companion object {
        fun of(
            answer: Answer,
        ) =
            AnswerResponseVo(
                id = answer.id,
                customerId = answer.customerId,
                questionId = answer.questionId,
                answer = answer.answer,
                feedback = answer.feedback,
                token = answer.token,
                createdAt = answer.createdAt.toString(),
                updatedAt = answer.updatedAt.toString(),
            )
    }
}

data class AnswerDetailResponseVo(
    val id: Long,
    val token: String,
    val answer: String,
    val feedback: String,
    val createdAt: String,
    val modifiedAt: String,

    val type: QuestionType,
    val level: QuestionLevel,
    val question: String,
) {

    constructor(
        answer: Answer,
        question: Question,
    ) : this(
        id = answer.id,
        token = answer.token,
        answer = answer.answer,
        feedback = answer.feedback,
        createdAt = answer.createdAt.toString(),
        modifiedAt = answer.updatedAt.toString(),

        type = question.questionType,
        level = question.level,
        question = question.title,
    )

    companion object {
        fun of(
            answer: AnswerResponseVo,
            question: QuestionResponseVo,
        ) =
            AnswerDetailResponseVo(
                id = answer.id,
                answer = answer.answer,
                feedback = answer.feedback,
                token = answer.token,
                createdAt = answer.createdAt,
                modifiedAt = answer.updatedAt,

                question = question.title,
                type = question.type,
                level = question.level,
            )
    }
}