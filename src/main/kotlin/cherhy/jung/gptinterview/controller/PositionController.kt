package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.PositionResponse
import cherhy.jung.gptinterview.controller.dto.of
import cherhy.jung.gptinterview.domain.position.PositionFactory
import cherhy.jung.gptinterview.domain.position.PositionType
import cherhy.jung.gptinterview.exception.ClientResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.*
import java.util.*

@Tag(name = "포지션")
@RestController
@RequestMapping("/positions")
class PositionController {
    @ResponseStatus(OK)
    @GetMapping
    @Operation(summary = "포지션 정보", description = "요청한 포지션의 상세 스펙에 대해 조회한다.")
    fun getPosition(
        @RequestParam positionTypes: EnumSet<PositionType>,
    ) =
        positionTypes.map(PositionFactory::valueOf)
            .let(PositionResponse::of)
            .let(ClientResponse.Companion::success)
}