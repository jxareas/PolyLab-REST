package com.jxareas.jxcore.annotations

import com.jxareas.jxcore.configuration.exception.ResponseExceptionResolver
import com.jxareas.jxcore.configuration.mapper.MapperConfiguration
import org.springframework.context.annotation.Import

/**
 * Annotation used to enable the default `JxCore` functionality in a module.
 *
 * The `EnableJxCore` annotation enables specific features provided by Jx Core library in a microservice.
 * It should be applied at the class level of a configuration class or the main application class.
 *
 * Usage:
 *
 * ```
 * @EnableJxCore
 * @SpringBootApplication
 * public class MySpringBootApplication {
 *     // Application configuration and code
 *     public static void main(String[] args) {
 *         SpringApplication.run(MySpringBootApplication.class, args);
 *     }
 * }
 * ```
 *
 * @since 2022-04-13
 * @version 1.1
 * @author Jon Areas
 *
 * @see org.springframework.boot.SpringApplication
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(ResponseExceptionResolver::class, MapperConfiguration::class)
annotation class EnableJxCore
