package com.jxareas.jxcore.common.exception

/**
 * Exception class representing a model not found error.
 * It is a sealed class that provides a hierarchy for specific model not found exceptions, extending the standard Exception class.
 * This hierarchy allows for more specific handling of different model not found scenarios.
 *
 * @param message The message describing the error.
 *
 * */
sealed class ModelNotFoundException(override val message: String) : Exception(message) {
    /**
     * Exception subclass representing a requested resource that could not be found.
     * This exception can be used to handle situations where a specific resource is not found within the system.
     */
    object ResourceNotFoundException : ModelNotFoundException("The requested resource could not be found")
}
