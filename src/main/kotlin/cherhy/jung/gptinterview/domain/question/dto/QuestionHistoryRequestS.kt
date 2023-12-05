package cherhy.jung.gptinterview.domain.question.dto

import cherhy.jung.gptinterview.domain.question.entity.QuestionHistory

data class QuestionHistoryRequestS(
    val questionId: Long,
    val customerId: Long,
    val feedback: String,
    val answer: String,
) {
    fun toQuestionHistory(): QuestionHistory =
        QuestionHistory(
            questionId = questionId,
            customerId = customerId,
            feedback = feedback,
            answer = answer,
        )

    companion object {
        private const val DEFAULT_ANSWER = "정답을 가르쳐줘"

        fun of(
            questionId: Long,
            customerId: Long,
            feedback: String,
            answer: String = DEFAULT_ANSWER,
        ): QuestionHistoryRequestS =
            QuestionHistoryRequestS(
                questionId = questionId,
                customerId = customerId,
                feedback = feedback,
                answer = answer,
            )
    }
}