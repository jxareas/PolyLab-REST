package com.jxareas.jxcore.core.exception

sealed class ModelNotFoundException(override val message: String) : Exception(message) {
    object ResourceNotFoundException : ModelNotFoundException("The requested resource could not be found")
}
