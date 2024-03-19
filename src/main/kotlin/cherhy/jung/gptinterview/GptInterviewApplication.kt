package cherhy.jung.gptinterview

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan("cherhy.jung.gptinterview.property")
@SpringBootApplication(exclude = [
    FlywayAutoConfiguration::class
])
class GptInterviewApplication

fun main(args: Array<String>) {
    runApplication<GptInterviewApplication>(*args)
}