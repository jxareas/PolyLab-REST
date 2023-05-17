package com.jxareas.jxcore.controller

import com.jxareas.jxcore.dto.Identifiable
import com.jxareas.jxcore.helpers.UriResourceHelper
import com.jxareas.jxcore.mapper.TwoWayMapper
import com.jxareas.jxcore.service.DomainService
import org.springframework.http.ResponseEntity

abstract class CrudController<DTO : Identifiable<ID>, T, ID : Any>(
    private val domainService: DomainService<T, ID>,
    private val mapper: TwoWayMapper<DTO, T>,
) : AppController<DTO, ID> {
    override fun getAll(): ResponseEntity<List<DTO>> =
        domainService.getAll()
            .run(mapper::mapAllFrom)
            .let { responseData ->
                ResponseEntity.ok(responseData)
            }

    override fun update(dto: DTO): ResponseEntity<DTO> {
        val entity = domainService.update(mapper.mapTo(dto), dto.id)
        val updatedData = mapper.mapFrom(entity)
        return ResponseEntity.ok(updatedData)
    }

    override fun save(dto: DTO): ResponseEntity<DTO> {
        val entity = domainService.save(mapper.mapTo(dto))
        val createdResource = mapper.mapFrom(entity)
        val resourceLocation = UriResourceHelper.withId(createdResource.id)
        return ResponseEntity.created(resourceLocation).body(createdResource)
    }

    override fun getById(id: ID): ResponseEntity<DTO> {
        val entity = domainService.getById(id)
        val responseData = mapper.mapFrom(entity)
        return ResponseEntity.ok(responseData)
    }

    override fun delete(id: ID): ResponseEntity<Void> {
        domainService.deleteById(id)
        return ResponseEntity.noContent().build()
    }


}
