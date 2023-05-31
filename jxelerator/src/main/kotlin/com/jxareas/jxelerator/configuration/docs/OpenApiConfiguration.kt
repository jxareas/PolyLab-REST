package com.jxareas.jxelerator.configuration.docs

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Default configuration class for OpenAPI.
 *
 * @author Jon Areas
 * @version 1.3
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
     * @param apiTitle         The title of the API.
     * @param apiDescription   The description of the API.
     * @param apiVersion       The version of the API.
     * @param apiContactName   The name of the contact person for the API.
     * @param apiContactEmail  The email of the contact person for the API.
     * @return The [OpenAPI] configuration.
     */
    @Bean
    fun countryOpenApi(
        @Value("\${apiTitle}") apiTitle: String,
        @Value("\${apiDescription}") apiDescription: String,
        @Value("\${apiVersion}") apiVersion: String,
        @Value("\${apiContactName}") apiContactName: String,
        @Value("\${apiContactEmail}") apiContactEmail: String,
    ): OpenAPI =
        OpenAPI()
            .components(Components())
            .info(
                Info()
                    .title(apiTitle)
                    .description(apiDescription)
                    .version(apiVersion)
                    .contact(Contact().name(apiContactName).email(apiContactEmail)),
            )

}
