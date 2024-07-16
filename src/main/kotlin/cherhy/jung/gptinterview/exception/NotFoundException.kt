package cherhy.jung.gptinterview.exception

class NotFoundException(
    state: MessageType,
): GlobalRuntimeException("${state.value}이(가) 존재하지 않습니다.")