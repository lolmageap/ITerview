package cherhy.jung.gptinterview.exception

import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.lang.IllegalArgumentException


@RestControllerAdvice
class ControllerAdvisor {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun methodArgumentNotValidException(e: MethodArgumentNotValidException): ResponseEntity<Map<String, String?>>? {
        val error = e.allErrors
            .filterIsInstance<FieldError>()
            .associate { it.field to it.defaultMessage }

        return ResponseEntity.badRequest().body(error)
    }

    @ExceptionHandler(ExistException::class)
    fun existException(e: ExistException): ResponseEntity<Any> {
        val response = ClientResponse.fail(e.message)
        return ResponseEntity.status(e.code).body(response)
    }

    @ExceptionHandler(NotFoundException::class)
    fun notFoundException(e: NotFoundException): ResponseEntity<Any> {
        val response = ClientResponse.fail(e.message)
        return ResponseEntity.status(e.code).body(response)
    }

    @ExceptionHandler(IllegalArgumentException::class)
    fun illegalArgumentException(e: IllegalArgumentException): ResponseEntity<Any> {
        val response = ClientResponse.fail(e.message)
        return ResponseEntity.status(801).body(response)
    }

    @ExceptionHandler(IllegalStateException::class)
    fun illegalStateException(e: IllegalStateException): ResponseEntity<Any> {
        val response = ClientResponse.fail(e.message)
        return ResponseEntity.status(746).body(response)
    }

    @ExceptionHandler(GlobalRuntimeException::class)
    fun removeFailedException(e: GlobalRuntimeException): ResponseEntity<Any> {
        val response = ClientResponse.fail(e.message)
        return ResponseEntity.status(500).body(response)
    }

}