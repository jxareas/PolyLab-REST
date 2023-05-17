package com.jxareas.jxcore.helpers

import org.springframework.http.ResponseEntity
import java.net.URI

object ResponseEntityHelper {
    fun noContent() = ResponseEntity.noContent().build<Void>()

    fun<T> createdWithLocation(body : T, location : URI) =
        ResponseEntity.created(location)
            .body(body)
}
