package cherhy.jung.gptinterview.extension

val String.isNumber: Boolean
    get() = this.matches(Regex("^[0-9]*$"))