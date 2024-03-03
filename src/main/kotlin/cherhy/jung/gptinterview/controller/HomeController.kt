package cherhy.jung.gptinterview.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Tag(name = "메인")
@Controller
class HomeController {
    @GetMapping("/")
    fun home(): String = "index.html"

    @GetMapping("/login")
    fun login(): String = "login.html"
}