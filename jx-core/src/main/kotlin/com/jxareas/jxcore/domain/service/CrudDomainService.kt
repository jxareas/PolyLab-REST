package com.jxareas.jxcore.domain.service

import com.jxareas.jxcore.core.exception.ModelNotFoundException.ResourceNotFoundException
import com.jxareas.jxcore.persistence.repository.DefaultRepository

/**
 * Abstract base class for CRUD domain services.
 *
 * @param <T> The entity type.
 * @param <ID> The identifier type.
 * @param repository The repository used for data access and persistence operations.
 *
 * @author Jon Areas
 * @version 1.0
 * @since 2022-06-23
 */
abstract class CrudDomainService<T : Any, ID : Any>(private val repository: DefaultRepository<T, ID>) :
    DomainService<T, ID> {

    /**
     * Retrieves all entities.
     *
     * @return A list of all entities.
     */
    override fun getAll(): List<T> = repository.findAll()

    /**
     * Retrieves the entity with the specified identifier.
     *
     * @param id The identifier of the entity to retrieve.
     * @return The retrieved entity.
     * @throws ResourceNotFoundException if the entity with the given identifier is not found.
     */
    override fun getById(id: ID): T = repository.findById(id).orElseThrow { ResourceNotFoundException }

    /**
     * Saves the entity.
     *
     * @param entity The entity to be saved.
     * @return The saved entity.
     */
    override fun save(entity: T): T = repository.save(entity)

    /**
     * Updates the entity with the specified identifier.
     *
     * @param entity The updated entity.
     * @param id The identifier of the entity to be updated.
     * @return The updated entity.
     * @throws ResourceNotFoundException if the entity with the given identifier is not found.
     */
    override fun update(entity: T, id: ID): T {
        val updatedEntity = repository.findById(id)
        if (updatedEntity.isPresent) {
            return repository.save(entity)
        } else throw ResourceNotFoundException
    }

    /**
     * Deletes the entity with the specified identifier.
     *
     * @param id The identifier of the entity to delete.
     * @throws ResourceNotFoundException if the entity with the given identifier is not found.
     */
    override fun deleteById(id: ID) {
        val entity = repository.findById(id).orElseThrow { ResourceNotFoundException }
        repository.delete(entity)
    }

}
