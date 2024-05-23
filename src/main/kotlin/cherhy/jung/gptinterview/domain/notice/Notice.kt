package cherhy.jung.gptinterview.domain.notice

import cherhy.jung.gptinterview.annotation.Description
import cherhy.jung.gptinterview.annotation.LoggingDisable
import cherhy.jung.gptinterview.annotation.TargetCustomerId
import cherhy.jung.gptinterview.domain.BaseEntity
import cherhy.jung.gptinterview.listener.JpaUpdateEventListener
import cherhy.jung.gptinterview.util.Generator
import jakarta.persistence.*

@Entity
@Description("공지사항")
@EntityListeners(JpaUpdateEventListener::class)
class Notice(
    @TargetCustomerId
    @Description("등록한 회원 id")
    val customerId: Long,

    @Description("제목")
    var title: String,

    @Lob
    @Description("내용")
    @Column(columnDefinition = "TEXT")
    var content: String,

    @Description("카테고리")
    @Enumerated(EnumType.STRING)
    var category: Category,

    @Description("조회수")
    @LoggingDisable
    var viewCount: Long,

    @Description("좋아요 수")
    @LoggingDisable
    var likeCount: Long,
): BaseEntity() {
    @Description("uuid")
    @LoggingDisable
    @Column(unique = true)
    val token: String = Generator.token
}