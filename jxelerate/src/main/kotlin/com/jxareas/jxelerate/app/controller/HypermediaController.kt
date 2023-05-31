package com.jxareas.jxelerate.app.controller

import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


/**
 * The `HypermediaController` interface represents a controller that follows the Hypermedia-driven RESTful API design.
 * It provides endpoints for CRUD operations on entities of type [DTO] with an identifier ot type [ID],
 * along with additional hypermedia-related features.
 *
 * @param DTO The data transfer object type representing the entity.
 * @param ID The type of the entity's identifier.
 *
 * @author Jon Areas
 * @since 1.0
 * @version 1.3
 *
 * @inheritdoc
 */
interface HypermediaController<DTO, ID> {

    /**
     * Retrieves all entities with hypermedia links.
     *
     * @return A ResponseEntity containing a collection of entities wrapped in hypermedia links.
     */
    @GetMapping
    fun getAllWithLinks(): ResponseEntity<CollectionModel<EntityModel<DTO>>>

    /**
     * Retrieves an entity by its ID.
     *
     * @param id The ID of the entity.
     * @return A ResponseEntity containing the entity wrapped in hypermedia links.
     */
    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: ID): ResponseEntity<EntityModel<DTO>>

    /**
     * Saves a new entity.
     *
     * @param dto The data transfer object representing the entity to be saved.
     * @return A ResponseEntity containing the saved entity wrapped in hypermedia links.
     */
    @PostMapping
    fun save(@Validated @RequestBody dto: DTO): ResponseEntity<EntityModel<DTO>>

    /**
     * Updates an existing entity.
     *
     * @param id The ID of the entity to be updated.
     * @param dto The data transfer object representing the updated entity.
     * @return A ResponseEntity containing the updated entity wrapped in hypermedia links.
     */
    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: ID, @Validated @RequestBody dto: DTO): ResponseEntity<EntityModel<DTO>>

    /**
     * Deletes an entity by its ID.
     *
     * @param id The ID of the entity to be deleted.
     * @return A ResponseEntity with no content.
     */
    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: ID): ResponseEntity<Void>

}
