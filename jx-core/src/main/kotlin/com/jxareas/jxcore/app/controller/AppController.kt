package com.jxareas.jxcore.app.controller

import com.jxareas.jxcore.app.extensions.withNextAndPreviousLink
import com.jxareas.jxcore.common.helpers.ResponseEntityResolver
import com.jxareas.jxcore.common.helpers.UriResourceProvider
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.jxareas.jxcore.domain.model.MutableIdentifiable
import com.jxareas.jxcore.domain.service.DomainService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import java.io.Serializable

/**
 * The `AppController` abstract class serves as a base controller implementation that provides CRUD operations and
 * hypermedia-driven functionality for entities.

 * It works with three types: the mutable data transfer object (DTO), the entity type (T), and the identifier type (ID).
 * [AppController] extends the [HypermediaController] and [ReadOnlyController] interfaces to enable hypermedia links
 * write and read-only operations for the entities.
 *
 * @param <DTO> The Data Transfer Object type used for transferring data between the client and the server.
 * @param <T> The entity or model object type in the domain that the controller operates on.
 * @param <ID> The type of the identifier used to uniquely identify the entities in the domain.
 *
 * @param domainService The domain service responsible for managing the business logic and operations on the entities.
 * @param mapper The mapper responsible for converting between DTOs and domain models or persistent objects.
 *
 * @author Jon Areas
 * @version 1.2
 * @since 2022-06-23
 *
 * @see HypermediaController
 * @see ReadOnlyController
 */
abstract class AppController<DTO : MutableIdentifiable<ID>, T : Any, ID : Serializable>(
    private val domainService: DomainService<T, ID>,
    private val mapper: TwoWayMapper<DTO, T>,
) : HypermediaController<DTO, ID>, ReadOnlyController<DTO, ID> {
    override fun getAllWithLinks(): ResponseEntity<CollectionModel<EntityModel<DTO>>> {
        val entities = domainService.getAll()
        val dtoList = mapper.mapAllFrom(entities)
        val dtoModels = dtoList.map(::buildEntityModelWithLinks)
        val collectionModel = CollectionModel.of(dtoModels)
        appendSelfLink(collectionModel)
        return ResponseEntity.ok(collectionModel)
    }

    override fun getAll(): ResponseEntity<List<DTO>> =
        domainService.getAll()
            .run(mapper::mapAllFrom)
            .let(ResponseEntityResolver::ok)

    override fun getAllPaginated(page: Int, size: Int, order: String?, asc: Boolean?): ResponseEntity<Page<DTO>> {
        var pageRequest = PageRequest.of(page, size)
        if (order != null && asc != null) {
            pageRequest = PageRequest.of(page, size, if (asc) Sort.Direction.ASC else Sort.Direction.DESC, order)
        }
        val dtoList = domainService.getByPage(pageRequest).map(mapper::mapFrom)
        return ResponseEntity.ok(dtoList)
    }

    override fun getById(id: ID): ResponseEntity<EntityModel<DTO>> {
        val entity = domainService.getById(id)
        val dto = mapper.mapFrom(entity)
        val entityModel = buildEntityModelWithLinks(dto)
        return ResponseEntity.ok(entityModel)
    }

    override fun save(dto: DTO): ResponseEntity<EntityModel<DTO>> {
        val entity = mapper.mapTo(dto)
        val savedEntity = domainService.save(entity)
        val createdResource = mapper.mapFrom(savedEntity)
        val entityModel = buildEntityModelWithLinks(createdResource)
        return ResponseEntityResolver.created(entityModel) {
            UriResourceProvider.withId(createdResource.id)
        }
    }

    override fun update(id: ID, dto: DTO): ResponseEntity<EntityModel<DTO>> {
        dto.id = id
        val entity = mapper.mapTo(dto)
        val updatedEntity = domainService.update(entity, id)
        val updatedResource = mapper.mapFrom(updatedEntity)
        val entityModel = buildEntityModelWithLinks(updatedResource)
        return ResponseEntity.ok(entityModel)
    }

    override fun deleteById(id: ID): ResponseEntity<Void> {
        domainService.deleteById(id)
        return ResponseEntity.noContent().build()
    }

    /**
     * Builds an EntityModel with hypermedia links for the given DTO.
     *
     * @param dto The DTO to build the EntityModel for.
     * @return The EntityModel with hypermedia links.
     */
    private fun buildEntityModelWithLinks(dto: DTO): EntityModel<DTO> {
        val id = dto.id
        val entityModel = EntityModel.of(dto)
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withSelfRel())
        appendNextAndPreviousLink(id, entityModel)
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withRel("delete"))
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).withRel("all"))
        return entityModel
    }

    /**
     * Appends the next and previous hypermedia links to the `EntityModel`.
     *
     * @param id The ID of the current entity.
     * @param entityModel The EntityModel to append the links to.
     */
    private fun appendNextAndPreviousLink(id: ID, entityModel: EntityModel<DTO>) =
        withNextAndPreviousLink(id, entityModel) {
            domainService.getAllIdentifiers()
        }

    /**
     * Append self link to the CollectionModel.
     *
     * @param collectionModel The CollectionModel to append the self link to.
     */
    private fun appendSelfLink(collectionModel: CollectionModel<EntityModel<DTO>>) {
        collectionModel.add(WebMvcLinkBuilder.linkTo(javaClass).withSelfRel())
    }
}
