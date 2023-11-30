package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

data class QuestionHistoryRequestS(
    val questionId: Long,
    val customerId: Long,
    val feedback: String,
    val answer: String,
) {
    companion object {
        fun of(
            questionId: Long,
            customerId: Long,
            feedback: String,
            answer: String = "정답을 가르쳐줘",
        ): QuestionHistoryRequestS =
            QuestionHistoryRequestS(
                questionId = questionId,
                customerId = customerId,
                feedback = feedback,
                answer = answer,
            )

    }
}

fun QuestionHistoryRequestS.toQuestionHistory(): QuestionHistory =
    QuestionHistory(
        questionId = questionId,
        customerId = customerId,
        feedback = feedback,
        answer = answer,
    )