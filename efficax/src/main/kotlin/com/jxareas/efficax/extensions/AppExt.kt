package com.jxareas.efficax.extensions

import org.springframework.boot.SpringApplication
import kotlin.reflect.KClass

/**
 * Runs the Spring Boot application for the specified application class and command-line arguments.
 *
 * @param applicationClass The class representing the Spring Boot application.
 * @param args The command-line arguments passed to the application.
 *
 * @author Jon Areas
 * @since 1.3
 * @version 1.3
 *
 * @see org.springframework.boot.SpringApplication.run
 */
fun runApp(applicationClass: KClass<*>, vararg args : String) {
    SpringApplication.run(applicationClass.java, *args)
}

/**
 * Runs the Spring Boot application for the specified class and command-line arguments.
 *
 * @param T The type representing the Spring Boot application class.
 * @param args The command-line arguments passed to the application.
 * @throws IllegalArgumentException if the class is not annotated with @SpringBootApplication.
 *
 * @author Jon Areas
 * @since 1.3
 * @version 1.3
 *
 * @see org.springframework.boot.SpringApplication.run
 */
inline fun <reified T : Any> KClass<T>.with(vararg args: String) {
    val annotation = java.getAnnotation(org.springframework.boot.autoconfigure.SpringBootApplication::class.java)
    annotation?.let {
        SpringApplication.run(java, *args)
    } ?: throw IllegalArgumentException("Class ${java.name} is not annotated with @SpringBootApplication.")
}
