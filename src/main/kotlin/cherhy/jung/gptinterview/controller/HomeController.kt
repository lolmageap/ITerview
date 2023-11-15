package cherhy.jung.gptinterview.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus

@Tag(name = "메인")
@Controller
class HomeController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun home(): String = "index.html"

    @GetMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    fun login(): String = "login.html"

}