package cherhy.jung.gptinterview.controller.dto

import cherhy.jung.gptinterview.domain.question.vo.AnswerDetailResponseVo
import cherhy.jung.gptinterview.external.gpt.GptResponseVo

fun AnswerResponse.Companion.of(
    response: AnswerDetailResponseVo,
) =
    with(response) {
        AnswerResponse(
            token = token,
            question = question,
            answer = answer,
            type = type,
            level = level,
        )
    }

fun GptResponse.Companion.of(
    responseVo: GptResponseVo,
) =
    with(responseVo) {
        GptResponse(
            token = token,
            body = body,
        )
    }