package cherhy.jung.gptinterview.exception

class ExistException(private val property: Property) : GlobalRuntimeException(
    message = property.value + "이(가) 존재하지 않습니다."
) {

    override val code: Int = 802

}