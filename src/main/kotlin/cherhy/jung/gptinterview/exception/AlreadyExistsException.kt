package cherhy.jung.gptinterview.exception

class AlreadyExistsException(
    property: MessageType,
): GlobalRuntimeException("${property.value}이(가) 이미 존재 합니다.")