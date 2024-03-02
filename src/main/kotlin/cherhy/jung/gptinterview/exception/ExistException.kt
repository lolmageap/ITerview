package cherhy.jung.gptinterview.exception

class ExistException(private val property: DomainName) : GlobalRuntimeException(
    message = property.value + "이(가) 이미 존재 합니다."
)