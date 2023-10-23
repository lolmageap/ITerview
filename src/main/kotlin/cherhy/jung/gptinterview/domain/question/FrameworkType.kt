package cherhy.jung.gptinterview.domain.question

enum class FrameworkType(private val language: ProgramingType) {
    SPRING(ProgramingType.JAVA),
    VIEW(ProgramingType.JAVASCRIPT),
    REACT(ProgramingType.JAVASCRIPT),
    JQUERY(ProgramingType.JAVASCRIPT),
    ANGULAR(ProgramingType.JAVASCRIPT),
    EXPRESS(ProgramingType.JAVASCRIPT),
    NEST(ProgramingType.JAVASCRIPT),
    DJANGO(ProgramingType.PYTHON),
    FLASK(ProgramingType.PYTHON),
    FAST_API(ProgramingType.PYTHON),
    KTOR(ProgramingType.KOTLIN),
    DOTNET(ProgramingType.C),
    LARAVEL(ProgramingType.PHP)
}