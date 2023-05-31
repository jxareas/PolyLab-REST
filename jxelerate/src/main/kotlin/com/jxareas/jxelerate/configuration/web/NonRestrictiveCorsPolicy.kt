package com.jxareas.jxelerate.configuration.web

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Configuration class for enabling a non-restrictive Cross-Origin Resource Sharing (CORS) policy.
 * Implements the [WebMvcConfigurer] interface to customize the Spring MVC configuration.
 *
 * @author Jon Areas
 * @since 1.2
 * @version 1.3
 */
@Configuration
class NonRestrictiveCorsPolicy : WebMvcConfigurer {
    /**
     * Override the [addCorsMappings] method from [WebMvcConfigurer] interface and allows
     * cross-origin requests from any origin by adding a mapping.
     *
     * @param registry the [CorsRegistry] to configure CORS mappings.
     */
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
    }
}
