package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.constant.QuestionLevel
import cherhy.jung.gptinterview.domain.question.constant.QuestionType
import cherhy.jung.gptinterview.domain.question.entity.Answer
import cherhy.jung.gptinterview.domain.question.entity.Question
import java.time.ZonedDateTime

data class AnswerResponseVo(
    val id: Long,
    val customerId: Long,
    val questionId: Long,
    val text: String,
    val token: String,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
) { companion object }

data class AnswerDetailResponseVo(
    val id: Long,
    val token: String,
    val answer: String,
    val createdAt: ZonedDateTime,
    val modifiedAt: ZonedDateTime,

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
        answer = answer.text,
        createdAt = answer.createdAt,
        modifiedAt = answer.updatedAt,

        type = question.questionType,
        level = question.level,
        question = question.title,
    )

    companion object
}