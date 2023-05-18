package com.jxareas.jxcore.core.exception

import java.time.LocalDateTime

data class ErrorResponseDto(
    private val dateTime: LocalDateTime = LocalDateTime.now(),
    private val message: String,
    private val path: String,
)

