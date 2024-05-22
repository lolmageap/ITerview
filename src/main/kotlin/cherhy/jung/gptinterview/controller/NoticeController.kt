package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.UpdateNoticeRequest
import cherhy.jung.gptinterview.controller.dto.toUpdateNoticeVo
import cherhy.jung.gptinterview.domain.notice.NoticeWriteService
import cherhy.jung.gptinterview.exception.ClientResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus.NO_CONTENT
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus

@Tag(name = "공지사항")
@Controller
class NoticeController(
    private val noticeWriteService: NoticeWriteService,
) {
    @ResponseStatus(NO_CONTENT)
    @PutMapping("/notice/{id}")
    @Operation(summary = "공지사항 수정", description = "요청에 맞게 질문을 반환한다.")
    fun updateNotice(
        @PathVariable id: Long,
        @RequestBody request: UpdateNoticeRequest,
    ) =
        noticeWriteService.updateNotice(id, request.toUpdateNoticeVo())
            .let(ClientResponse.Companion::success)
}