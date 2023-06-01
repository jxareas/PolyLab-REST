package com.jxareas.efficax.controller

import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel

/**
 * The [LinkBuilder] interface represents a simple contract for building hypermedia links and
 * appending self-links to a [CollectionModel].
 *
 * @author Jon Areas
 * @version 1.3
 * @param DTO The type of the Data Transfer Object.
 * @see LinkableController
 * @see EntityModel
 * @see CollectionModel
 * @since 1.2
 * @inheritdoc
 */
sealed interface LinkBuilder<DTO> {

    /**
     * Builds an EntityModel with hypermedia links for the given DTO.
     *
     * @param dto The DTO to build the EntityModel for.
     * @return The EntityModel with hypermedia links.
     */
    fun buildEntityModelWithLinks(dto: DTO): EntityModel<DTO>

    /**
     * Append self-link to the CollectionModel.
     *
     * @param collectionModel The CollectionModel to append the self-link to.
     */
    fun appendSelfLink(collectionModel: CollectionModel<EntityModel<DTO>>)
}
