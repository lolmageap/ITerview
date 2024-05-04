package cherhy.jung.gptinterview.config

import jakarta.persistence.PostUpdate
import jakarta.persistence.PreRemove
import jakarta.persistence.PreUpdate
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@Configuration
@EnableJpaAuditing
class JpaConfig {

    @PreUpdate
    fun preUpdateEvent(target: Any) {
        val userId = ThreadLocalConfig().userId
        println("userId = $userId")
        println("target = $target")
    }

    @PostUpdate
    fun postUpdateEvent(target: Any) {

    }

    @PreRemove
    fun preRemoveEvent(target: Any) {

    }

}