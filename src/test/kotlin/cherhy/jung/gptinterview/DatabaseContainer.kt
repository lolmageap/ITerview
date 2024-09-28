package cherhy.jung.gptinterview

import org.testcontainers.containers.MySQLContainer

val mysqlContainer
    get() =
        MySQLContainer<Nothing>("mysql:8").apply {
            portBindings.add("13306:3306")
            withDatabaseName("interview")
            withUsername("root")
            withPassword("root")
        }