package com.jxareas.jxcore.annotations

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.web.bind.annotation.RestControllerAdvice

/**
 * Annotation used to mark the [com.jxareas.jxcore.configuration.exception.ResponseExceptionResolver] class as a global exception resolver.
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
 * @since 2022-04-13
 * @version 1.1
 * @author Jon Areas
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