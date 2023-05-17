package com.jxareas.jxcore.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


interface AppController<DTO, ID> {
    @GetMapping
    fun getAll(): ResponseEntity<List<DTO>>

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: ID): ResponseEntity<DTO>

    @PostMapping
    fun save(@RequestBody dto: DTO): ResponseEntity<DTO>

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: ID, @RequestBody dto: DTO ): ResponseEntity<DTO>

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: ID): ResponseEntity<Void>
}
