package com.jxareas.jxcore.extensions

import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder

/**
 * Appends "next" and "previous" hypermedia links to the current [EntityModel] based on the given [id] and [fetchAllIds] function.
 *
 * @param id The identifier of the current entity.
 * @param fetchAllIds A function that fetches a list of all entity identifiers.
 *
 * @see EntityModel
 */
fun <DTO, ID> EntityModel<DTO>.withNextAndPreviousLink(id: ID, fetchAllIds: () -> List<ID>) {
    val allIds = fetchAllIds.invoke()

    val currentIndex = allIds.indexOf(id)
    val (previousIndex, nextIndex) = currentIndex - 1 to currentIndex + 1

    val previousId = if (previousIndex >= 0) allIds[previousIndex] else null
    val nextId = if (nextIndex < allIds.size) allIds[nextIndex] else null


    if (previousId != null) {
        this.add(WebMvcLinkBuilder.linkTo(javaClass).slash(previousId).withRel("previous"))
    }

    if (nextId != null) {
        this.add(WebMvcLinkBuilder.linkTo(javaClass).slash(nextId).withRel("next"))
    }
}
