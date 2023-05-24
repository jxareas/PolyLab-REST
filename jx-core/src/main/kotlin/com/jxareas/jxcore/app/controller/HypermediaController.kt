package com.jxareas.jxcore.app.controller

import com.jxareas.jxcore.core.helpers.ResponseEntityResolver
import com.jxareas.jxcore.core.helpers.UriResourceProvider
import com.jxareas.jxcore.core.mapper.TwoWayMapper
import com.jxareas.jxcore.domain.model.Identifiable
import com.jxareas.jxcore.domain.service.DomainService
import com.jxareas.jxcore.shared.extensions.withNextAndPreviousLink
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.config.EnableHypermediaSupport
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import java.io.Serializable


@EnableHypermediaSupport(type = [HypermediaType.HAL])
abstract class HypermediaController<DTO : Identifiable<ID>, T, ID : Serializable>(
    private val domainService: DomainService<T, ID>,
    private val mapper: TwoWayMapper<DTO, T>,
) : HateoasController<DTO, ID> {
    override fun getAll(): ResponseEntity<CollectionModel<EntityModel<DTO>>> {
        val entities = domainService.getAll()
        val dtoList = mapper.mapAllFrom(entities)
        val dtoModels = dtoList.map(::buildEntityModelWithLinks)
        val collectionModel = CollectionModel.of(dtoModels)
        appendSelfLink(collectionModel)
        return ResponseEntity.ok(collectionModel)
    }

    override fun getAllPaginated(page: Int, size: Int, order: String?, asc: Boolean?): ResponseEntity<Page<DTO>> {
        var pageRequest = PageRequest.of(page, size)
        if (order != null && asc != null) {
            pageRequest = PageRequest.of(page, size, if (asc) Sort.Direction.ASC else Sort.Direction.DESC, order)
        }
        val dtoList = domainService.getAllPaginated(pageRequest).map(mapper::mapFrom)
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
            UriResourceProvider.withId(createdResource.identifier)
        }
    }

    override fun update(id: ID, dto: DTO): ResponseEntity<EntityModel<DTO>> {
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


    private fun buildEntityModelWithLinks(dto: DTO): EntityModel<DTO> {
        val id = dto.identifier
        val entityModel = EntityModel.of(dto)
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withSelfRel())
        appendNextAndPreviousLink(id, entityModel)
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).slash(id).withRel("delete"))
        entityModel.add(WebMvcLinkBuilder.linkTo(javaClass).withRel("all"))
        return entityModel
    }

    private fun appendNextAndPreviousLink(id: ID, entityModel: EntityModel<DTO>) =
        withNextAndPreviousLink(id, entityModel) {
            domainService.getAllIds()
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
