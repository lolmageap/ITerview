package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.exception.*
import org.springframework.http.HttpStatus
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class ControllerAdvisor {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun methodArgumentNotValidException(e: MethodArgumentNotValidException): Map<String, String?> {
        return e.allErrors
            .filterIsInstance<FieldError>()
            .associate { "message" to it.defaultMessage }
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(ExistException::class)
    fun existException(e: ExistException): ClientResponse<Any> {
        return ClientResponse.fail(e.message)
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException::class)
    fun notFoundException(e: NotFoundException): ClientResponse<Any> {
        return ClientResponse.fail(e.message)
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException::class)
    fun illegalArgumentException(e: IllegalArgumentException): ClientResponse<Any> {
        return ClientResponse.fail(e.message)
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalStateException::class)
    fun illegalStateException(e: IllegalStateException): ClientResponse<Any> {
        return ClientResponse.fail(e.message)
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(GptNotGeneratedException::class)
    fun gptNotGeneratedException(e: GptNotGeneratedException): ClientResponse<Any> {
        return ClientResponse.fail(e.message)
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BadCredentialsException::class)
    fun badCredentialsException(e: BadCredentialsException): ClientResponse<Any> {
        return ClientResponse.fail("비밀번호가 일치하지 않습니다.")
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(GlobalRuntimeException::class)
    fun globalRuntimeException(e: GlobalRuntimeException): ClientResponse<Any> {
        return ClientResponse.fail(e.message)
    }

}