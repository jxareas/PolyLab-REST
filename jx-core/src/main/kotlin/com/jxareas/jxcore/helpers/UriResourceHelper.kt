package com.jxareas.jxcore.helpers

import org.springframework.web.servlet.support.ServletUriComponentsBuilder

object UriResourceHelper {

    @JvmStatic
    fun withId(id: Any) = withUri("/{id}", id)

    @JvmStatic
    fun withUri(path: String, vararg uriVariableValues: Any) =
        ServletUriComponentsBuilder.fromCurrentRequest()
            .path(path)
            .buildAndExpand(*uriVariableValues)
            .toUri()

}
