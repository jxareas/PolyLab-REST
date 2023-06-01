package com.jxareas.efficax.exception

/**
 * Exception class representing a 'model not found' error.
 *
 * @author Jon Areas
 * @version 1.3
 * @param message The message describing the error.
 * @see Exception
 * @see ResourceNotFoundException
 * @since 1.3
 * */
sealed class ModelNotFoundException(override val message: String) : Exception(message) {
    /**
     * Exception subclass representing a requested resource that could not be found.
     * This exception can be used to handle situations where a specific resource is not found within the system.
     * @author Jon Areas
     * @version 1.3
     * @see ModelNotFoundException
     * @since 1.3
     */
    object ResourceNotFoundException : ModelNotFoundException("The requested resource could not be found")
}
