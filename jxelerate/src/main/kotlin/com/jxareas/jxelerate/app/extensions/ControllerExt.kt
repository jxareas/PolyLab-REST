package com.jxareas.jxelerate.app.extensions

import com.jxareas.jxelerate.app.controller.HypermediaController
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder

/**
 * Appends "next" and "previous" hypermedia links to the current [EntityModel] based on the given [id] and [fetchIdentifiers] function.
 *
 * @param id The identifier of the current entity.
 * @param fetchIdentifiers A function that fetches a list of all entity identifiers.
 *
 * @author Jon Areas
 * @since 1.1
 * @version 1.3
 *
 * @see EntityModel
 */
internal fun <DTO, ID> HypermediaController<DTO, ID>.withNextAndPreviousLink(
    id: ID,
    entityModel: EntityModel<DTO>,
    fetchIdentifiers: () -> List<ID>,
) {
    val allIds = fetchIdentifiers.invoke()

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
