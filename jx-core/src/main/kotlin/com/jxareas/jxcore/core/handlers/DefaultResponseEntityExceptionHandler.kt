package com.jxareas.jxcore.core.handlers

import com.jxareas.jxcore.shared.constants.ExceptionConstants
import com.jxareas.jxcore.core.exception.ErrorResponseDto
import com.jxareas.jxcore.core.exception.ModelNotFoundException
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.ServletWebRequest
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.LocalDateTime

/**
 * Global exception handler that handles and processes exceptions in the application.
 * It extends the ResponseEntityExceptionHandler, which is a convenient base class for creating exception handlers in Spring MVC.
 *
 * @author Jon Areas
 * @version 1.0
 * @since 2022-04-11
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
object DefaultResponseEntityExceptionHandler : ResponseEntityExceptionHandler() {

    /**
     * Exception handler for handling general exceptions.
     * It handles every Exception type and returns an appropriate error response.
     *
     * @param exception The exception to handle.
     * @param request The web request associated with the exception.
     * @return ResponseEntity containing the error response as the response body.
     */
    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleExceptions(exception: Exception, request: WebRequest): ResponseEntity<ErrorResponseDto> {
        val errorResponse = ErrorResponseDto(
            LocalDateTime.now(),
            exception.message ?: ExceptionConstants.DEFAULT_ERROR_MESSAGE,
            request.getDescription(false),
        )
        return ResponseEntity.internalServerError().body(errorResponse)
    }

    /**
     * Exception handler for handling ModelNotFoundException.
     * It handles exceptions of type ModelNotFoundException and returns an appropriate error response.
     *
     * @param exception The ModelNotFoundException to handle.
     * @param request The web request associated with the exception.
     * @return ResponseEntity containing the error response as the response body.
     */
    @ExceptionHandler(ModelNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleModelNotFound(
        exception: ModelNotFoundException,
        request: WebRequest,
    ): ResponseEntity<ErrorResponseDto> {
        val errorResponse = ErrorResponseDto(
            LocalDateTime.now(),
            exception.message, request.getDescription(false),
        )
        return ResponseEntity(errorResponse, HttpStatus.NOT_FOUND)
    }

    /**
     * Overridden method to handle MethodArgumentNotValidException.
     * It handles exceptions of type MethodArgumentNotValidException and returns a validation error response.
     *
     * @param ex The MethodArgumentNotValidException to handle.
     * @param headers The headers for the response.
     * @param status The HTTP status for the response.
     * @param request The web request associated with the exception.
     * @return ResponseEntity containing the validation error response as the response body.
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    override fun handleMethodArgumentNotValid(
        ex: MethodArgumentNotValidException,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest,
    ): ResponseEntity<Any> {
        val errors: MutableMap<String, String?> = HashMap()
        ex.bindingResult.fieldErrors
            .forEach { error: FieldError ->
                val fieldName = error.field
                val message = error.defaultMessage
                errors[fieldName] = message
            }
        val errorResponse = ErrorResponseDto(LocalDateTime.now(), errors.toString(), request.getDescription(false))
        return ResponseEntity.badRequest().body(errorResponse)
    }

    /**
     * Overridden method to handle exceptions that occur within Spring MVC internals.
     * It handles exceptions of type Exception that occur within Spring MVC internals and returns an appropriate error response.
     *
     * @param ex The exception to handle.
     * @param body The response body.
     * @param headers The headers for the response.
     * @param statusCode The HTTP status code for the response.
     * @param request The web request associated with the exception.
     * @return ResponseEntity containing the error response as the response body.
     */
    override fun handleExceptionInternal(
        ex: java.lang.Exception,
        body: Any?,
        headers: HttpHeaders,
        status: HttpStatus,
        request: WebRequest,
    ): ResponseEntity<Any> {
        val servletWebRequest = request as ServletWebRequest
        val errorResponse = ErrorResponseDto(
            message = ExceptionConstants.DEFAULT_ERROR_MESSAGE,
            path = servletWebRequest.request.requestURI,
        )
        return ResponseEntity.status(status).headers(headers).body(errorResponse)
    }
}
