package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.entity.Answer

fun AnswerResponseVo.Companion.of(
    answer: Answer,
) =
    with(answer) {
        AnswerResponseVo(
            id = id,
            customerId = customerId,
            questionId = questionHistoryId,
            text = text,
            token = token,
            createdAt = createdAt,
            updatedAt = updatedAt,
        )
    }

fun AnswerDetailResponseVo.Companion.of(
    answer: AnswerResponseVo,
    question: QuestionResponseVo,
) =
    AnswerDetailResponseVo(
        id = answer.id,
        answer = answer.text,
        token = answer.token,
        createdAt = answer.createdAt,
        modifiedAt = answer.updatedAt,

        question = question.title,
        type = question.type,
        level = question.level,
    )
