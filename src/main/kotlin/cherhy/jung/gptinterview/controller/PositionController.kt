package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.position.Position
import cherhy.jung.gptinterview.domain.position.PositionType
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@Tag(name = "포지션")
@RestController
@RequestMapping("/position")
class PositionController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "포지션 정보", description = "요청한 포지션의 상세 스펙에 대해 조회한다.")
    fun getPosition(
        @RequestParam positionTypes: List<PositionType>,
    ) =
        positionTypes
            .map(Position::of)
            .let { positions ->
                PositionResponse.of(positions)
            }
}