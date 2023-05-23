package com.jxareas.jxcore.app.controller

import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


/**
 * The contract representing an application controller responsible for handling REST API endpoints.
 *
 * @param <DTO> The DTO (Data Transfer Object) type representing the data to be exposed by the controller.
 * @param <ID> The identifier type.
 *
 * @author Jon Areas
 * @version 1.0
 * @since 2022-06-23
 */
interface ApplicationController<DTO, ID> {
    /**
     * Retrieves all entities.
     *
     * @return A ResponseEntity containing a list of DTOs.
     */
    @GetMapping("/links")
    fun getAllAsCollection(): ResponseEntity<CollectionModel<EntityModel<DTO>>>

    @GetMapping
    fun getAll() : ResponseEntity<List<DTO>>



    /**
     * Retrieves the entity with the specified ID.
     *
     * @param id The ID of the entity to retrieve.
     * @return A ResponseEntity containing the DTO of the retrieved entity.
     */
    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: ID):  ResponseEntity<EntityModel<DTO>>

    /**
     * Saves a new entity.
     *
     * @param dto The DTO representing the entity to be saved.
     * @return A ResponseEntity containing the DTO of the saved entity.
     */
    @PostMapping
    fun save(@Validated @RequestBody dto: DTO): ResponseEntity<EntityModel<DTO>>

    /**
     * Updates the entity with the specified ID using the provided DTO.
     *
     * @param id The ID of the entity to be updated.
     * @param dto The DTO representing the updated entity.
     * @return A ResponseEntity containing the DTO of the updated entity.
     */
    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: ID, @Validated @RequestBody dto: DTO ): ResponseEntity<EntityModel<DTO>>

    /**
     * Deletes the entity with the specified ID.
     *
     * @param id The ID of the entity to be deleted.
     * @return A ResponseEntity with no content.
     */
    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: ID): ResponseEntity<Void>
}
