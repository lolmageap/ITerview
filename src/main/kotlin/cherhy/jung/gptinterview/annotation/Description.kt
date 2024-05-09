package cherhy.jung.gptinterview.annotation

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD)
annotation class Description(
    val value: String = "",
)
