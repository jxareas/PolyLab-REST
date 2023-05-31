package com.jxareas.jxelerate.annotations

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.web.bind.annotation.RestControllerAdvice

/**
 * Annotation used to mark the [com.jxareas.jxelerate.configuration.exception.ResponseExceptionResolver] class as a global exception resolver.
 * It is used to handle and process exceptions in the application.
 *
 * The `ResponseExceptionResolver` class extends the `ResponseEntityExceptionHandler`,
 * which is a convenient base class for creating exception handlers in Spring MVC.
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
 * @since 1.0
 * @version 1.3
 *
 * @see org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
 * @see org.springframework.web.bind.annotation.RestControllerAdvice
 * @see org.springframework.core.annotation.Order
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
internal annotation class ExceptionResolver
