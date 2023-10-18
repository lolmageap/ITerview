package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.authority.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/authority")
class AuthorityController(private val authUserService: AuthUserService) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/sign-in")
    fun signIn(@RequestBody signInRequest: SignInRequest) = authUserService.signIn(signInRequest.toUserRequest())

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/sign-up")
    fun signUp(@RequestBody signUpRequest: SignUpRequest) = authUserService.signUp(signUpRequest.toUserRequest())

    @PostMapping("/sign-out")
    fun signOut() {}

}