package com.jxareas.jxelerate.annotations

import com.jxareas.jxelerate.configuration.docs.OpenApiConfiguration
import com.jxareas.jxelerate.configuration.exception.ResponseExceptionResolver
import com.jxareas.jxelerate.configuration.mapper.MapperConfiguration
import org.springframework.context.annotation.Import

/**
 * Annotation used to enable the default `Jxelerate` functionality in a module.
 *
 * The [EnableJxelerate] annotation must be applied at the class level of the main application class.
 *
 * Usage:
 *
 * ```
 * @EnableJxelerate
 * @SpringBootApplication
 * public class MySpringBootApplication {
 *     // Application configuration and code
 *     public static void main(String[] args) {
 *         SpringApplication.run(MySpringBootApplication.class, args);
 *     }
 * }
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @see org.springframework.boot.SpringApplication
 * @since 1.0
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(ResponseExceptionResolver::class, MapperConfiguration::class, OpenApiConfiguration::class)
annotation class EnableJxelerate
