package cherhy.jung.gptinterview.domain.question.vo

import cherhy.jung.gptinterview.domain.question.constant.HistoryType
import cherhy.jung.gptinterview.domain.question.entity.Question
import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

fun QuestionResponseVo.Companion.of(
    question: Question,
) =
    with(question) {
        QuestionResponseVo(
            id = id,
            token = token,
            title = title,
            type = questionType,
            level = level,
        )
    }

fun QuestionHistoryResponseVo.Companion.of(
    questionHistory: QuestionHistory,
) =
    with(questionHistory) {
        QuestionHistoryResponseVo(
            id = id,
            token = token,
            question = text,
            questionId = questionId,
            createdAt = createdAt,
            updatedAt = updatedAt,
        )
    }

fun QuestionHistoryDetailResponseVo.Companion.of(
    answer: AnswerResponseVo,
) =
    with(answer) {
        QuestionHistoryDetailResponseVo(
            token = token,
            historyType = HistoryType.ANSWER,
            text = text,
            createdAt = createdAt,
            updatedAt = updatedAt,
        )
    }

fun QuestionHistoryDetailResponseVo.Companion.of(
    feedback: FeedbackResponseVo,
) =
    with(feedback) {
        QuestionHistoryDetailResponseVo(
            token = token,
            historyType = HistoryType.FEEDBACK,
            text = text,
            createdAt = createdAt,
            updatedAt = updatedAt,
        )
    }