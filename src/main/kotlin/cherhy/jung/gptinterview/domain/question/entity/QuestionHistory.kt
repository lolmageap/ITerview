package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.util.BaseEntity
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob

@Entity
class QuestionHistory(

    val questionId: Long,

    val customerId: Long,

    val answer: String,
    
    @Lob
    @Column(columnDefinition = "TEXT")
    val feedback: String,

    val token: String = Generator.generateToken(),

    ) : BaseEntity()
