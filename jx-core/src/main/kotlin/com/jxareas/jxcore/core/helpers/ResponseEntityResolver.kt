package com.jxareas.jxcore.core.helpers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import java.net.URI

private typealias UriProvider = () -> URI

/**
 * Helper class for creating ResponseEntity instances.
 *
 * @author Jon Areas
 */
object ResponseEntityResolver {
    /**
     * Creates a ResponseEntity with a "No Content" status.
     *
     * @return The ResponseEntity with "No Content" status.
     */
    fun noContent(): ResponseEntity<Void> =
        ResponseEntity.noContent().build()

    /**
     * Creates a ResponseEntity with a "Created" status and the provided body.
     *
     * @param body The body of the ResponseEntity.
     * @param uriProvider Optional URI provider function to generate the location URI.
     * @return The created ResponseEntity.
     */
    fun <T> created(body: T, uriProvider: UriProvider? = null): ResponseEntity<T> =
        if (uriProvider != null) {
            val uri = uriProvider.invoke()
            ResponseEntity.created(uri).body(body)
        } else ResponseEntity.status(HttpStatus.CREATED).body(body)
}
