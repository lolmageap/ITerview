package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.position.Position

fun PositionResponse.Companion.of(
    positions: List<Position>,
) =
    PositionResponse(
        questionTypes = positions.flatMap { it.questionTypes }.toSet(),
        frameworkTypes = positions.flatMap { it.frameworkTypes }.toSet(),
        programingTypes = positions.flatMap { it.programingTypes }.toSet(),
    )