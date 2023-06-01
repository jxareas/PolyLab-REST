package com.jxareas.efficax.domain.service

import com.jxareas.efficax.exception.ModelNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

/**
 * The contract representing a domain service responsible for managing operations on entities.
 *
 *
 * @author Jon Areas
 * @version 1.3
 * @param <T> The entity type.
 * @param <ID> The identifier type of the entities.
 * @see PersistentService
 * @since 1.0
 * @inheritdoc
 */
interface DomainService<T, ID> {

    /**
     * Retrieves all entities.
     *
     * @return A list of all entities.
     */
    fun getAll(): List<T>

    /**
     * Retrieves all identifiers.
     *
     * @return A list of all identifiers.
     */
    fun getAllIdentifiers(): List<ID>

    /**
     * Retrieves all entities paged.
     *
     * @param pageable The pageable object to apply pagination and sorting.
     * @return A Page object containing the entities based on the provided pagination.
     */
    fun getByPage(pageable: Pageable): Page<T>

    /**
     * Retrieves the entity with the specified ID.
     *
     * @param id The ID of the entity to retrieve.
     * @return The retrieved entity.
     * @throws ModelNotFoundException If the entity with the specified ID does not exist.
     */
    @Throws(ModelNotFoundException::class)
    fun getById(id: ID): T

    /**
     * Saves the given entity.
     *
     * @param entity The entity to be saved.
     * @return The saved entity.
     */
    fun save(entity: T): T

    /**
     * Updates the entity with the given ID using the provided entity object.
     *
     * @param entity The updated entity object.
     * @param id The ID of the entity to be updated.
     * @return The updated entity.
     * @throws ModelNotFoundException If the entity with the specified ID does not exist.
     */
    @Throws(ModelNotFoundException::class)
    fun update(entity: T, id: ID): T

    /**
     * Deletes the entity with the specified ID.
     *
     * @param id The ID of the entity to delete.
     * @throws ModelNotFoundException If the entity with the specified ID does not exist.
     */
    @Throws(ModelNotFoundException::class)
    fun deleteById(id: ID)

}
