package com.jxareas.jxelerator.helpers

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info

/**
 * Helper for constructing OpenAPI documentation.
 *
 * @author Jon Areas
 * @version 1.3
 * @see com.jxareas.jxelerator.configuration.docs.OpenApiConfiguration
 * @see OpenAPI
 * @see Info
 * @see Components
 * @since 1.0
 */
internal object OpenApiHelper {

    /**
     * Builds an instance of [OpenAPI] using the provided parameters.
     *
     * @param title The title of the API documentation.
     * @param description The description of the API documentation.
     * @param version The version of the API.
     * @param name The name of the contact person.
     * @param email The email address of the contact person.
     * @return An instance of [OpenAPI].
     */
    fun buildDocs(title : String, description: String, version : String, name : String, email : String) : OpenAPI =
        OpenAPI()
            .components(Components())
            .info(
                Info()
                    .title(title)
                    .description(description)
                    .version(version)
                    .contact(Contact().name(name).email(email)),
            )

}
