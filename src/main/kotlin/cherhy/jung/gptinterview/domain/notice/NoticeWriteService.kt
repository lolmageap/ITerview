package cherhy.jung.gptinterview.domain.notice

import cherhy.jung.gptinterview.annotation.WriteService
import cherhy.jung.gptinterview.domain.notice.vo.UpdateNoticeVo
import cherhy.jung.gptinterview.exception.MessageType
import cherhy.jung.gptinterview.exception.NotFoundException
import org.springframework.data.repository.findByIdOrNull

@WriteService
class NoticeWriteService(
    private val noticeRepository: NoticeRepository,
) {
    fun updateNotice(
        id: Long,
        request: UpdateNoticeVo,
    ) {
        noticeRepository.findByIdOrNull(id)
            ?.apply {
                title = request.title
                content = request.content
                category = request.category
            }
            ?: throw NotFoundException(MessageType.NOTICE)
    }
}