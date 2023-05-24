package com.jxareas.jxcore.domain.service

import com.jxareas.jxcore.common.exception.ModelNotFoundException.ResourceNotFoundException
import com.jxareas.jxcore.utils.extensions.ifPresentOrThrow
import com.jxareas.jxcore.utils.extensions.orElseThrow
import com.jxareas.jxcore.domain.model.Identifiable
import com.jxareas.jxcore.persistence.repository.DefaultRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

/**
 * Abstract base class for domain services with support for CRUD operations.
 *
 * @param <T> The entity type.
 * @param <ID> The identifier type.
 * @param repository The repository used for data access and persistence operations.
 *
 * @author Jon Areas
 * @version 1.1
 * @since 2022-06-20
 */
abstract class PersistentService<T : Identifiable<ID>, ID : Serializable>(
    private val repository: DefaultRepository<T, ID>,
) : DomainService<T, ID> {

    /**
     * Retrieves all entities.
     *
     * @return A list of all entities.
     */
    override fun getAll(): List<T> = repository.findAll()


    /**
     * Retrieves all identifiers.
     *
     * @return A list of all identifiers.
     */
    override fun getAllIdentifiers(): List<ID> = getAll().map(Identifiable<ID>::id)

    /**
     * Retrieves all entities with pagination.
     *
     * @param pageable The pageable object to apply pagination and sorting.
     * @return A Page object containing the entities based on the provided pagination.
     */
    override fun getByPage(pageable: Pageable): Page<T> = repository.findAll(pageable)

    /**
     * Retrieves the entity with the specified identifier.
     *
     * @param id The identifier of the entity to retrieve.
     * @return The retrieved entity.
     * @throws ResourceNotFoundException if the entity with the given identifier is not found.
     */
    override fun getById(id: ID): T = repository.findById(id).orElseThrow(ResourceNotFoundException)


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
    override fun update(entity: T, id: ID): T =
        repository.findById(id)
            .ifPresentOrThrow(entity, ResourceNotFoundException)
            .run(repository::save)

    /**
     * Deletes the entity with the specified identifier.
     *
     * @param id The identifier of the entity to delete.
     * @throws ResourceNotFoundException if the entity with the given identifier is not found.
     */
    override fun deleteById(id: ID) =
        repository.findById(id)
            .orElseThrow(ResourceNotFoundException)
            .let(repository::delete)

}
