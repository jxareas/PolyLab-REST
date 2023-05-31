package com.jxareas.jxelerate.common.helpers

import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.net.URI

/**
 * A helper class providing utility methods for constructing URIs.
 *
 * @author Jon Areas
 * @version 1.3
 * @see URI
 * @since 1.1
 */
object UriResourceProvider {

    /**
     * Constructs a URI with a single specified ID.
     *
     * @param id The ID to be included in the URI.
     * @return The constructed URI.
     */
    @JvmStatic
    fun withId(id: Any): URI = withUri("/{id}", id)

    /**
     * Constructs a URI with the specified path and URI variable values.
     *
     * @param path The path pattern to be included in the URI.
     * @param uriVariableValues The values for the URI variables in the path.
     * @return The constructed URI.
     */
    @JvmStatic
    fun withUri(path: String, vararg uriVariableValues: Any): URI =
        ServletUriComponentsBuilder.fromCurrentRequest()
            .path(path)
            .buildAndExpand(*uriVariableValues)
            .toUri()

}
