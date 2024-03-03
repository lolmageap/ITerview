package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.PositionResponse
import cherhy.jung.gptinterview.domain.position.PositionFactory
import cherhy.jung.gptinterview.domain.position.PositionType
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@Tag(name = "포지션")
@RestController
@RequestMapping("/positions")
class PositionController {
    @GetMapping
    @Operation(summary = "포지션 정보", description = "요청한 포지션의 상세 스펙에 대해 조회한다.")
    fun getPosition(
        @RequestParam positionTypes: List<PositionType>,
    ): PositionResponse {
        val positions = positionTypes.map(PositionFactory::generatePosition)
        return positions.let { PositionResponse.of(it) }
    }
}