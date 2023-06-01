package com.jxareas.efficax.annotations

import com.jxareas.efficax.configuration.web.NonRestrictiveCorsPolicy
import org.springframework.context.annotation.Import
import org.springframework.web.servlet.config.annotation.EnableWebMvc

/**
 * Enables a non-restrictive CORS policy throughout the application.
 * This annotation should only be used in development mode and is not recommended for production environments.
 * It imports the [NonRestrictiveCorsPolicy] class and [EnableWebMvc] to handle CORS requests.
 *
 * CORS (Cross-Origin Resource Sharing) allows controlled access to resources from different origins.
 * By enabling a non-restrictive CORS policy, all origins are allowed to make requests to the application.
 *
 * NOTE: This can be potentially dangerous in production environments as it may expose sensitive data and APIs to unauthorized sources.
 *
 * Usage:
 *
 * ```
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
 * @author Jon Areas
 * @version 1.3
 * @see org.springframework.boot.SpringApplication
 * @see com.jxareas.efficax.annotations.EnableEfficax
 * @since 1.3
 *
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(NonRestrictiveCorsPolicy::class)
@EnableWebMvc
@MustBeDocumented
annotation class EnableNonRestrictiveCorsPolicy
