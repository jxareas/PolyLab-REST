package com.jxareas.jxelerator.controller

import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.domain.model.MutableIdentifiable
import com.jxareas.jxelerator.domain.service.DomainService
import com.jxareas.jxelerator.helpers.ResponseEntityProvider
import com.jxareas.jxelerator.helpers.UriResourceProvider
import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.http.ResponseEntity
import java.io.Serializable

/**
 * Abstract base class for controllers implementing HATEOAS (Hypermedia as the Engine of Application State)
 * functionality which provides default behavior over [LinkableController].
 *
 * @author Jon Areas
 * @version 1.3
 * @param DTO The DTO type for the controller.
 * @param T The entity type for the controller.
 * @param ID The ID type for the entity.
 * @param domainService The domain service used for interacting with the entity.
 * @param mapper The mapper used for mapping entities to DTOs and vice versa.
 * @see LinkableController
 * @see LinkBuilder
 * @since 1.2
 */
abstract class HalController<DTO : MutableIdentifiable<ID>, T : Any, ID : Serializable>(
    private val domainService: DomainService<T, ID>,
    private val mapper: MirrorMapper<DTO, T>,
) : LinkableController<DTO, ID> {
    override fun getAllWithLinks(): ResponseEntity<CollectionModel<EntityModel<DTO>>> {
        val entities = domainService.getAll()
        val dtoList = mapper.mapAllFrom(entities)
        val dtoModels = dtoList.map(::buildEntityModelWithLinks)
        val collectionModel = CollectionModel.of(dtoModels)
        appendSelfLink(collectionModel)
        return ResponseEntity.ok(collectionModel)
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
        return ResponseEntityProvider.created(entityModel) {
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
        return ResponseEntityProvider.noContent()
    }

}
