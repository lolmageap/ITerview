package cherhy.jung.gptinterview

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(private val gptApi: GptApi) {

    @PostMapping
    suspend fun get(@RequestBody question: String) = gptApi.generateText(question)

}