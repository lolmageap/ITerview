package cherhy.jung.gptinterview.domain.question.entity

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.util.BaseEntity
import jakarta.persistence.*

@Entity
@Table(indexes = [
    Index(name = "IDX_PROGRAMING_FRAMEWORK_ID", columnList = "question_id", unique = true)
])
class Framework(

    @OneToOne
    @JoinColumn(
        name = "question_id",
        foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT),
    )
    val question: Question,

    @Enumerated(EnumType.STRING)
    val frameworkType: FrameworkType,

    ) : BaseEntity()