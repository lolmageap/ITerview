package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.GptReAnswerRequest
import cherhy.jung.gptinterview.controller.dto.GptRequest
import cherhy.jung.gptinterview.controller.dto.GptResponse
import cherhy.jung.gptinterview.domain.authority.Principal
import cherhy.jung.gptinterview.exception.ClientResponse
import cherhy.jung.gptinterview.usecase.RequestAnswerToGptUseCase
import cherhy.jung.gptinterview.usecase.RequestReAnswerToGptUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus.CREATED
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@Tag(name = "GPT 요청")
@RestController
class GptController(
    private val requestAnswerToGptUseCase: RequestAnswerToGptUseCase,
    private val requestReAnswerToGptUseCase: RequestReAnswerToGptUseCase,
) {
    @PostMapping("/answers")
    @ResponseStatus(CREATED)
    @Operation(summary = "답변 하기", description = "질문을 풀거나 풀지 않고 답안을 제출한 뒤 점수 및 피드백을 받는다.")
    fun requestAnswer(
        @RequestBody request: GptRequest,
        @AuthenticationPrincipal principal: Principal,
    ) =
        requestAnswerToGptUseCase.execute(principal.id, request)
            .let(GptResponse::of)
            .let(ClientResponse.Companion::success)

    @PostMapping("/re-answers")
    @ResponseStatus(CREATED)
    @Operation(summary = "피드백에 재답변 하기", description = "피드백 에 대한 답변을 이어서 제출 한다.")
    fun requestReAnswer(
        @RequestBody request: GptReAnswerRequest,
        @AuthenticationPrincipal principal: Principal,
    ) =
        requestReAnswerToGptUseCase.execute(principal.id, request)
            .let(GptResponse::of)
            .let(ClientResponse.Companion::success)
}