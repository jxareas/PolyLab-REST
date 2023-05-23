package com.jxareas.jxcore.app.controller

import com.jxareas.jxcore.core.helpers.ResponseEntityResolver
import com.jxareas.jxcore.core.helpers.UriResourceProvider
import com.jxareas.jxcore.core.mapper.TwoWayMapper
import com.jxareas.jxcore.domain.model.Identifiable
import com.jxareas.jxcore.domain.service.DomainService
import com.jxareas.jxcore.extensions.withNextAndPreviousLink
import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import java.io.Serializable

/**
 * Hypermedia Controller provides a common implementation of CRUD (Create, Read, Update, Delete) operations
 * with HATEOAS (Hypermedia as the Engine of Application State) support for a specific application controller.
 * It follows the RESTful API principles and interacts with a Domain Service to perform the desired operations.
 * The controller automatically attaches hyperlinks to the resources to facilitate navigation and discoverability.
 *
 * @param <DTO> The Data Transfer Object type used for transferring data between the client and the server.
 * @param <T> The entity or model object type in the domain that the controller operates on.
 * @param <ID> The type of the identifier used to uniquely identify the entities in the domain.
 *
 * @param domainService The domain service responsible for managing the business logic and operations on the entities.
 * @param mapper The mapper responsible for converting between DTOs and domain models or persistent objects.
 *
 * @author Jon Areas
 * @version 1.0
 * @since 2022-06-23
 */
abstract class HypermediaController<DTO : Identifiable<ID>, T, ID : Serializable>(
    private val domainService: DomainService<T, ID>,
    private val mapper: TwoWayMapper<DTO, T>,
) : ApplicationController<DTO, ID> {

    /**
     * Retrieves all entities in the domain and returns them as a list of DTOs.
     *
     * @return ResponseEntity containing the list of DTOs as the response body.
     */
    override fun getAll(): ResponseEntity<List<DTO>> =
        domainService.getAll()
            .run(mapper::mapAllFrom)
            .let(ResponseEntityResolver::ok)

    /**
     * Retrieves all entities in the domain and returns them as a collection of DTOs.
     * Hyperlinks to individual entity resources are attached.
     *
     * @return ResponseEntity containing the collection of DTOs as the response body.
     */
    override fun getAllAsCollection(): ResponseEntity<CollectionModel<EntityModel<DTO>>> {
        val entities = domainService.getAll()
        val dtoList = mapper.mapAllFrom(entities)
        val dtoModels = dtoList.map {
            val entityModel = EntityModel.of(it)
            entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(it.identifier).withSelfRel())
            appendNextAndPreviousLink(it.identifier, entityModel)
            entityModel
        }
        val collectionModel = CollectionModel.of(dtoModels).apply {
            add(WebMvcLinkBuilder.linkTo(javaClass).withSelfRel())
        }
        return ResponseEntity.ok(collectionModel)
    }


    /**
     * Retrieves an entity with the given identifier and returns it as a DTO.
     * Hyperlinks to related resources and the collection of all entities are attached.
     *
     * @param id The identifier of the entity to retrieve.
     * @return ResponseEntity containing the retrieved DTO as the response body.
     */
    override fun getById(id: ID): ResponseEntity<EntityModel<DTO>> {
        val entity = domainService.getById(id)
        val responseData = mapper.mapFrom(entity)
        val entityModel = EntityModel.of(responseData).apply {
            add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withSelfRel())
            add(WebMvcLinkBuilder.linkTo(javaClass).withRel("all"))
            appendNextAndPreviousLink(id, this)
        }
        return ResponseEntity.ok(entityModel)
    }

    /**
     * Creates a new entity using the provided DTO.
     * Hyperlinks to the created entity resource are attached.
     *
     * @param dto The DTO containing the data for the new entity.
     * @return ResponseEntity containing the created DTO as the response body with the URI location as a Header.
     */
    override fun save(dto: DTO): ResponseEntity<EntityModel<DTO>> {
        val entity = domainService.save(mapper.mapTo(dto))
        val createdResource = mapper.mapFrom(entity)
        val entityModel = EntityModel.of(createdResource).apply {
            add(WebMvcLinkBuilder.linkTo(javaClass).slash(createdResource.identifier).withSelfRel())
        }
        // Add additional hypermedia links if required
        return ResponseEntityResolver.created(entityModel) {
            UriResourceProvider.withId(createdResource.identifier)
        }
    }

    /**
     * Updates an entity with the given identifier using the provided DTO.
     * Hyperlinks to the updated entity, its details, deletion, and the collection of all entities are attached.
     *
     * @param id The identifier of the entity to be updated.
     * @param dto The DTO containing the updated data.
     * @return ResponseEntity containing the updated DTO as the response body.
     */
    override fun update(id: ID, dto: DTO): ResponseEntity<EntityModel<DTO>> {
        dto.identifier = id
        val entity = domainService.update(mapper.mapTo(dto), dto.identifier)
        val updatedData = mapper.mapFrom(entity)
        val entityModel = EntityModel.of(updatedData).apply {
            add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withSelfRel())
            add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withRel("get"))
            add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withRel("delete"))
            add(WebMvcLinkBuilder.linkTo(javaClass).withRel("all"))
        }
        return ResponseEntity.ok(entityModel)
    }


    /**
     * Deletes an entity with the given identifier.
     *
     * @param id The identifier of the entity to be deleted.
     * @return ResponseEntity with no content.
     */
    override fun delete(id: ID): ResponseEntity<Void> {
        domainService.deleteById(id)
        return ResponseEntityResolver.noContent()
    }

    private fun buildModelWithControls(dto: DTO): EntityModel<DTO> {
        val entityModel = EntityModel.of(dto)
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(dto.identifier).withSelfRel())
        appendNextAndPreviousLink(dto.identifier, entityModel)
        return entityModel
    }

    /**
     * Appends "next" and "previous" hypermedia links to the [entityModel] based on the given [id] and [getAllIds] function.
     *
     * @param id The identifier of the current entity.
     * @param entityModel The entity model to which the links will be appended.
     * @param getAllIds A function that returns a list of all entity identifiers.
     *
     * @see EntityModel
     */
    private fun appendNextAndPreviousLink(id: ID, entityModel: EntityModel<DTO>) =
        entityModel.withNextAndPreviousLink(id) {
            domainService.getAllIds()
        }


}
