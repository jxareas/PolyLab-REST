package com.jxareas.jxcore.app.controller

import com.jxareas.jxcore.core.helpers.ResponseEntityResolver
import com.jxareas.jxcore.core.helpers.UriResourceProvider
import com.jxareas.jxcore.core.mapper.TwoWayMapper
import com.jxareas.jxcore.domain.model.Identifiable
import com.jxareas.jxcore.domain.service.DomainService
import org.springframework.http.ResponseEntity

/**
 * CRUD Controller provides a common implementation of CRUD (Create, Read, Update, Delete) operations for a specific application controller.
 * It follows the RESTful API principles and interacts with a DomainService to perform the desired operations.
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
abstract class CrudController<DTO : Identifiable<ID>, T, ID : Any>(
    private val domainService: DomainService<T, ID>,
    private val mapper: TwoWayMapper<DTO, T>,
) : AppController<DTO, ID> {
    /**
     * Retrieves all entities in the domain and returns them as a list of DTOs.
     *
     * @return ResponseEntity containing the list of DTOs as the response body.
     */
    override fun getAll(): ResponseEntity<List<DTO>> =
        domainService.getAll()
            .run(mapper::mapAllFrom)
            .let { responseData ->
                ResponseEntity.ok(responseData)
            }

    /**
     * Retrieves an entity with the given identifier and returns it as a DTO.
     *
     * @param id The identifier of the entity to retrieve.
     * @return ResponseEntity containing the retrieved DTO as the response body.
     */

    override fun getById(id: ID): ResponseEntity<DTO> {
        val entity = domainService.getById(id)
        val responseData = mapper.mapFrom(entity)
        return ResponseEntity.ok(responseData)
    }

    /**
     * Updates an entity with the given identifier using the provided DTO.
     *
     * @param id The identifier of the entity to be updated.
     * @param dto The DTO containing the updated data.
     * @return ResponseEntity containing the updated DTO as the response body.
     */
    override fun update(id: ID, dto: DTO): ResponseEntity<DTO> {
        dto.identifier = id
        val entity = domainService.update(mapper.mapTo(dto), dto.identifier)
        val updatedData = mapper.mapFrom(entity)
        return ResponseEntity.ok(updatedData)
    }

    /**
     * Creates a new entity using the provided DTO.
     *
     * @param dto The DTO containing the data for the new entity.
     * @return ResponseEntity containing the created DTO as the response body with the URI location as a Header.
     */
    override fun save(dto: DTO): ResponseEntity<DTO> {
        val entity = domainService.save(mapper.mapTo(dto))
        val createdResource = mapper.mapFrom(entity)
        return ResponseEntityResolver.created(createdResource) {
            UriResourceProvider.withId(createdResource.identifier)
        }
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


}
