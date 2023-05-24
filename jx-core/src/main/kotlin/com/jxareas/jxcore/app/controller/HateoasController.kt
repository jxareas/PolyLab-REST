package com.jxareas.jxcore.app.controller

import org.springframework.data.domain.Page
import org.springframework.hateoas.CollectionModel
import org.springframework.hateoas.EntityModel
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

interface HateoasController<DTO, ID> {

    @GetMapping
    fun getAll(): ResponseEntity<CollectionModel<EntityModel<DTO>>>

    @GetMapping("page")
    fun getAllPaginated(
        @RequestParam(defaultValue = "0") page: Int,
        @RequestParam(defaultValue = "20") size: Int,
        @RequestParam(required = false) order: String?,
        @RequestParam(required = false) asc: Boolean?,
    ): ResponseEntity<Page<DTO>>

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: ID): ResponseEntity<EntityModel<DTO>>

    @PostMapping
    fun save(@Validated @RequestBody dto: DTO): ResponseEntity<EntityModel<DTO>>

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: ID, @Validated @RequestBody dto: DTO): ResponseEntity<EntityModel<DTO>>

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: ID): ResponseEntity<Void>

}
