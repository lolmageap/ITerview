package cherhy.jung.gptinterview.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus

// 나중에 컨트롤러가 너무 많아지만, 그 때는 레스트 컨트롤러/ 컨트롤러 기준으로 패키지를 분리하는게 아니고 도메인 기준으로 해봐도 재밌겠네요.
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