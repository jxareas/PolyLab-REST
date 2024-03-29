package com.jxareas.jxelerator.exception

import org.springframework.web.context.request.WebRequest
import java.time.LocalDateTime

/**
 * [ErrorResponseDto] is a Data Transfer Object (DTO) class representing an error response.
 * It encapsulates information about an error, including the date and time of occurrence, the error message,
 * and the path where the error occurred.
 *
 * @param message The error message describing the encountered issue.
 * @param path The path where the error occurred, providing additional context about the error location.
 * @param dateTime The date and time when the error occurred. Defaults to the current date and time.
 *
 * @constructor Creates an instance of the ErrorResponseDto class with the specified values.
 *
 * @author Jon Areas
 * @version 1.3
 * @see ModelNotFoundException
 * @see com.jxareas.jxelerator.configuration.exception.ResponseExceptionResolver
 * @see WebRequest
 * @since 1.0
 */
data class ErrorResponseDto(
    val message: String,
    val path: String,
    val dateTime: LocalDateTime = LocalDateTime.now()
) {
    /**
     * Creates an instance of [ErrorResponseDto] with the exception message and request information.
     *
     * @param exceptionMessage The exception message describing the encountered issue.
     * @param request The [WebRequest] object containing information about the current request.
     */
    constructor(exceptionMessage: String, request: WebRequest) : this(
        exceptionMessage,
        request.getDescription(false)
    )
}

