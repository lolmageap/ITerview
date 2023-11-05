package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.dependency.GptApi
import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class GptController(
    private val gptApi: GptApi,
    ) {

    @PostMapping("/")
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.CREATED)
    fun postAndGet(@RequestBody question: String) = gptApi.generateText(question)

}