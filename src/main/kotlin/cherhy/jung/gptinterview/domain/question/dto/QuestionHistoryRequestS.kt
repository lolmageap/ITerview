package cherhy.jung.gptinterview.domain.question.dto

data class QuestionHistoryRequestS(
    val questionId: Long,
    val customerId: Long,
    val feedback: String,
    val answer: String = "정답을 가르쳐줘",
)