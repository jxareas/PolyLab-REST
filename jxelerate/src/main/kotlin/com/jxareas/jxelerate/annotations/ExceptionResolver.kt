package com.jxareas.jxelerate.annotations

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.web.bind.annotation.RestControllerAdvice

/**
 * Internal annotation used to mark a class as a global exception resolver.
 *
 * Usage:
 *
 * ```
 * @ExceptionResolver
 * object ResponseExceptionResolver : ResponseEntityExceptionHandler() {
 *     // Exception handling methods
 * }
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @see org.springframework.core.annotation.Order
 * @see org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
 * @see org.springframework.web.bind.annotation.RestControllerAdvice
 * @since 1.0
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
@MustBeDocumented
internal annotation class ExceptionResolver
