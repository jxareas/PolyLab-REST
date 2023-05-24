package com.jxareas.jxcore.common.annotations

import com.jxareas.jxcore.configuration.exception.ResponseExceptionResolver
import com.jxareas.jxcore.configuration.mapper.MapperConfiguration
import org.springframework.context.annotation.Import

/**
 * Annotation to enable the `JxCore` default configuration.
 * Imports the required components for.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(ResponseExceptionResolver::class, MapperConfiguration::class)
annotation class EnableJxCore
