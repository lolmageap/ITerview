package cherhy.jung.gptinterview.config

import cherhy.jung.gptinterview.property.DatabaseProperty
import org.flywaydb.core.Flyway
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(DatabaseProperty::class)
class FlywayConfig(
    private val databaseProperty: DatabaseProperty,
) {
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