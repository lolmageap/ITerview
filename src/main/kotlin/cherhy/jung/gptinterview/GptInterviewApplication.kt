package cherhy.jung.gptinterview

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType

@ComponentScan(
    excludeFilters = [
        ComponentScan.Filter(
            type = FilterType.ASSIGNABLE_TYPE,
            classes = [FlywayAutoConfiguration::class],
        )
    ]
)
@ConfigurationPropertiesScan("cherhy.jung.gptinterview.property")
@SpringBootApplication
class GptInterviewApplication

fun main(args: Array<String>) {
    runApplication<GptInterviewApplication>(*args)
}