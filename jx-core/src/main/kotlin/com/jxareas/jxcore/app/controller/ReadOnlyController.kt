package com.jxareas.jxcore.app.controller

import org.springframework.data.domain.Page
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * The `ReadOnlyController` interface provides read-only operations for retrieving entities.
 * Implementations of this interface can retrieve all entities or retrieve entities in a paginated manner.
 *
 * @param DTO The DTO (Data Transfer Object) type representing the entity.
 * @param ID The type of the entity's identifier.
 *
 * @author Jon Areas
 * @version 1.2
 * @since 2022-07-02
 *
 * @inheritdoc
 */
interface ReadOnlyController<DTO, ID> {

    /**
     * Retrieves all entities.
     *
     * @return A `ResponseEntity` containing a list of DTOs.
     */
    @GetMapping("/all")
    fun getAll(): ResponseEntity<List<DTO>>

    /**
     * Retrieves a paginated list of DTO objects.
     *
     * @param page The page number to retrieve (default: 0).
     * @param size The number of items per page (default: 20).
     * @param order The field to order the results by (optional).
     * @param asc Specifies the ordering direction (optional).
     * @return A `ResponseEntity` containing a `Page` of DTO objects.
     */
    @GetMapping("/page")
    fun getAllPaginated(
        @RequestParam(defaultValue = "0") page: Int,
        @RequestParam(defaultValue = "20") size: Int,
        @RequestParam(required = false) order: String?,
        @RequestParam(required = false) asc: Boolean?,
    ): ResponseEntity<Page<DTO>>

}
