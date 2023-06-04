package com.jxareas.jxelerator.configuration.docs

import com.jxareas.jxelerator.helpers.OpenApiHelper
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Default configuration class for OpenAPI.
 *
 * @author Jon Areas
 * @version 1.3
 * @see OpenApiHelper
 * @see OpenAPI
 * @see Info
 * @see Components
 * @since 1.0
 */
@Configuration
class OpenApiConfiguration {

    /**
     * Creates a bean for the OpenAPI configuration.
     *
     * @param title         The title of the API.
     * @param description   The description of the API.
     * @param version      The version of the API.
     * @param name   The name of the contact person for the API.
     * @param email  The email of the contact person for the API.
     * @return The [OpenAPI] configuration.
     */
    @Bean
    fun openApi(
        @Value("\${apiTitle}") title: String,
        @Value("\${apiDescription}") description: String,
        @Value("\${apiVersion}") version: String,
        @Value("\${apiContactName}") name: String,
        @Value("\${apiContactEmail}") email: String,
    ): OpenAPI = OpenApiHelper.buildDocs(title, description, version, name, email)

}
