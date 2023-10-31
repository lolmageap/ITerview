package cherhy.jung.gptinterview.exception

class ExistException(private val property: Property) : GlobalRuntimeException(
    message = property.value + "이(가) 이미 존재합니다."
)