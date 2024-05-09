package cherhy.jung.gptinterview.config

import jakarta.persistence.PreRemove
import org.springframework.stereotype.Component

@Component
class JpaDeleteEventListener() {
    @PreRemove
    fun preRemoveEvent(target: Any) {

    }
}