package com.jxareas.jxelerator.configuration.web

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Configuration class for enabling a non-restrictive Cross-Origin Resource Sharing (CORS) policy.
 * Implements the [WebMvcConfigurer] interface to customize the Spring MVC configuration.
 *
 * @author Jon Areas
 * @version 1.3
 * @see com.jxareas.jxelerator.annotations.EnableNonRestrictiveCorsPolicy
 * @since 1.2
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
            .allowedOrigins("*")
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowedHeaders("*")
    }
}
