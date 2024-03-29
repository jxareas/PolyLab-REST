package com.jxareas.jxelerator.controller

import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.domain.model.MutableIdentifiable
import com.jxareas.jxelerator.domain.service.DomainService
import com.jxareas.jxelerator.extensions.appendElementaryLinks
import com.jxareas.jxelerator.extensions.withNextAndPreviousLink
import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import java.io.Serializable

/**
 * The [HyperController] abstract class serves as a default controller implementation that provides CRUD operations and
 * hypermedia-driven functionality for entities.

 * It works with three types: the mutable data transfer object (DTO), the entity type (T), and the identifier type (ID).
 * [HyperController] extends the [HalController] class and the [ReadableController] interface to enable hypermedia links
 * capabilities with read and write operations for entities.
 *
 * @author Jon Areas
 * @version 1.3
 * @param DTO The Data Transfer Object type used for transferring data between the client and the server.
 * @param T The entity or model object type in the domain that the controller operates on.
 * @param ID The type of the identifier used to uniquely identify the entities in the domain.
 * @param service The domain service responsible for managing the business logic and operations on the entities.
 * @param mapper The mapper responsible for converting between DTOs and domain models or persistent objects.
 * @see LinkableController
 * @see HalController
 * @see ReadableController
 * @see ReadOnlyController
 * @see LinkBuilder
 * @since 1.2
 */
abstract class HyperController<DTO : MutableIdentifiable<ID>, T : Any, ID : Serializable>(
    private val service: DomainService<T, ID>,
    private val mapper: MirrorMapper<DTO, T>,
) : HalController<DTO, T, ID>(service, mapper),
    ReadableController<DTO, ID> by ReadOnlyController.factory(service, mapper) {

    override fun buildEntityModelWithLinks(dto: DTO): EntityModel<DTO> {
        val id = dto.id
        val controllerClass = this.javaClass
        return EntityModel.of(dto).apply {
            appendNextAndPreviousLink(id, entityModel =this)
            appendElementaryLinks(controllerClass, id)
        }
    }

    override fun appendSelfLink(collectionModel: CollectionModel<EntityModel<DTO>>) {
        collectionModel.add(WebMvcLinkBuilder.linkTo(javaClass).withSelfRel())
    }

    /**
     * Appends the next and previous hypermedia links to the `EntityModel`.
     *
     * @param id The ID of the current entity.
     * @param entityModel The EntityModel to append the links to.
     * @see withNextAndPreviousLink
     */
    private fun appendNextAndPreviousLink(id: ID, entityModel: EntityModel<DTO>) =
        withNextAndPreviousLink(id, entityModel) {
            service.getAllIdentifiers()
        }
}
