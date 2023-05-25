package com.jxareas.jxcore.annotations

import com.jxareas.jxcore.configuration.web.NonRestrictiveCorsPolicy
import org.springframework.context.annotation.Import
import org.springframework.web.servlet.config.annotation.EnableWebMvc

/**
 * Enables a non-restrictive CORS policy throughout the application.
 * This annotation should only be used in development mode and is not recommended for production environments.
 * It imports the [NonRestrictiveCorsPolicy] class and [EnableWebMvc] to handle CORS requests.
 *
 * CORS (Cross-Origin Resource Sharing) allows controlled access to resources from different origins.
 * By enabling a non-restrictive CORS policy, all origins are allowed to make requests to the application.
 * This can be potentially dangerous in production environments as it may expose sensitive data and APIs to unauthorized sources.
 *
 * Usage:
 *
 * ```
 * @EnableJxCore
 * @EnableNonRestrictiveCorsPolicy
 * @SpringBootApplication
 * public class MySpringBootApplication {
 *     // Application configuration and code
 *     public static void main(String[] args) {
 *         SpringApplication.run(MySpringBootApplication.class, args);
 *     }
 * }
 * ```
 *
 * @since 2023-05-13
 * @version 1.0
 * @author Jon Areas
 *
 * @see [org.springframework.boot.SpringApplication]
 * @see [EnableJxCore]
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(NonRestrictiveCorsPolicy::class)
@EnableWebMvc
annotation class EnableNonRestrictiveCorsPolicy
