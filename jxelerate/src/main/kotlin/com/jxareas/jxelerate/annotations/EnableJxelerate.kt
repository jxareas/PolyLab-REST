package com.jxareas.jxelerate.annotations

import com.jxareas.jxelerate.configuration.docs.OpenApiConfiguration
import com.jxareas.jxelerate.configuration.exception.ResponseExceptionResolver
import com.jxareas.jxelerate.configuration.mapper.MapperConfiguration
import org.springframework.context.annotation.Import

/**
 * Annotation used to enable the default `Jxelerate` functionality in a module.
 *
 * The `EnableJxelerate` annotation enables specific features provided by Jx Core library in a microservice.
 * It should be applied at the class level of a configuration class or the main application class.
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
 * @since 1.0
 * @version 1.3
 *
 * @see org.springframework.boot.SpringApplication
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(ResponseExceptionResolver::class, MapperConfiguration::class, OpenApiConfiguration::class)
annotation class EnableJxelerate
