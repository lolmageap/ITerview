package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.property.DatabaseProperty
import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class FlywayConfig(
    private val databaseProperty: DatabaseProperty,
) {
    @Profile("!test")
    @Bean(initMethod = "migrate")
    fun flyway() =
        Flyway(
            Flyway.configure()
                .dataSource(
                    databaseProperty.url,
                    databaseProperty.username,
                    databaseProperty.password,
                )
                .baselineOnMigrate(true)
                .locations("classpath:db/migration")
        )
}