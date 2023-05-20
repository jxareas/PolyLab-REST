package com.jxareas.jxcore.core.exception

import java.time.LocalDateTime

/**
 * Data transfer object (DTO) class representing an error response.
 * It encapsulates information about an error, including the date and time of occurrence, the error message, and the path where the error occurred.
 *
 * @property dateTime The date and time when the error occurred. Defaults to the current date and time.
 * @property message The error message describing the encountered issue.
 * @property path The path where the error occurred, providing additional context about the error location.
 *
 * @constructor Creates an instance of the ErrorResponseDto class with the specified values.
 */
data class ErrorResponseDto(
    val dateTime: LocalDateTime = LocalDateTime.now(),
    val message: String,
    val path: String,
)

