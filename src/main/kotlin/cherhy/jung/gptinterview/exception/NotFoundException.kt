package cherhy.jung.gptinterview.exception

class NotFoundException(
    private val state: MessageType,
) : GlobalRuntimeException(
    message = "${state.value}이(가) 존재하지 않습니다."
)