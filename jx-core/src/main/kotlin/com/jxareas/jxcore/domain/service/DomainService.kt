package com.jxareas.jxcore.domain.service

import com.jxareas.jxcore.core.exception.ModelNotFoundException

/**
 * The contract representing a domain service responsible for managing operations on entities.
 *
 * @param <T> The entity type.
 * @param <ID> The identifier type of the entities.
 */
interface DomainService<T, ID> {

    /**
     * Retrieves all entities.
     *
     * @return A list of all entities.
     */
    fun getAll(): List<T>


    /**
     * Retrieves all the ids of the entities in the domain.
     *
     * @return A list of all ids.
     */
    fun getAllIds(): List<ID>


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
