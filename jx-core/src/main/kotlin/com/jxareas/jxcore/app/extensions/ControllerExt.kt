package com.jxareas.jxcore.app.extensions

import com.jxareas.jxcore.app.controller.HypermediaController
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
fun <DTO, ID> HypermediaController<DTO, ID>.withNextAndPreviousLink(
    id: ID,
    entityModel: EntityModel<DTO>,
    fetchAllIds: () -> List<ID>,
) {
    val allIds = fetchAllIds.invoke()

    val currentIndex = allIds.indexOf(id)
    val (previousIndex, nextIndex) = currentIndex - 1 to currentIndex + 1

    val previousId = if (previousIndex >= 0) allIds[previousIndex] else null
    val nextId = if (nextIndex < allIds.size) allIds[nextIndex] else null


    if (previousId != null) {
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(previousId).withRel("previous"))
    }

    if (nextId != null) {
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(nextId).withRel("next"))
    }
}
