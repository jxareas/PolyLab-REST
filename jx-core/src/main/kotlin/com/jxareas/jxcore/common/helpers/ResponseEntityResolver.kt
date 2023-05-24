package com.jxareas.jxcore.common.helpers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import java.net.URI

/**
 * Simplifies the declaration and usage of functions that take no parameters and return a URI object.
 */
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
    @JvmStatic
    fun noContent(): ResponseEntity<Void> =
        ResponseEntity.noContent().build()

    /**
     * Creates a ResponseEntity with a "Created" status and the provided body.
     *
     * @param body The body of the ResponseEntity.
     * @param uriProvider Optional URI provider function to generate the location URI.
     * @return The created ResponseEntity.
     */
    @JvmStatic
    fun <T> created(body: T, uriProvider: UriProvider? = null): ResponseEntity<T> =
        if (uriProvider != null) {
            val uri = uriProvider.invoke()
            ResponseEntity.created(uri).body(body)
        } else ResponseEntity.status(HttpStatus.CREATED).body(body)

    /**
     * Creates a ResponseEntity object with HTTP status code 200 (OK) and the provided body as the response payload.
     *
     * @param body The response body to be included in the ResponseEntity.
     * @return A ResponseEntity object with the specified body and HTTP status code 200.
     */
    @JvmStatic
    fun <T> ok(body : T) = ResponseEntity.ok(body)

}
