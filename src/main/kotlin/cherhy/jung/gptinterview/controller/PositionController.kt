package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.position.Position
import cherhy.jung.gptinterview.domain.position.PositionType
import cherhy.jung.gptinterview.domain.question.QuestionReadService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/position")
class PositionController(
    private val questionReadService: QuestionReadService,
) {

    @Operation(summary = "포지션 정보", description = "요청한 포지션의 상세 스펙에 대해 조회한다.")
    @GetMapping("/{position-type}")
    fun getPosition(
        @PathVariable(name = "position-type") positionType: PositionType,
    ) = Position.from(positionType)
        .let(PositionResponse::of)
}