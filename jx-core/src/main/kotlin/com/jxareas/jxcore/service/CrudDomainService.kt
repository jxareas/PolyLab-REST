package com.jxareas.jxcore.service

import com.jxareas.jxcore.exception.ModelNotFoundException.ResourceNotFoundException
import com.jxareas.jxcore.repository.DefaultRepository

abstract class CrudDomainService<T : Any, ID : Any>(private val repository: DefaultRepository<T, ID>) :
    DomainService<T, ID> {
    override fun save(entity: T): T = repository.save(entity)

    override fun update(entity: T, id: ID): T = repository
        .findByIdOrThrow(id) { ResourceNotFoundException }
        .apply(repository::save)

    override fun getAll(): List<T> = repository.findAll()

    override fun getById(id: ID): T =
        repository.findByIdOrThrow(id) { ResourceNotFoundException }

    override fun deleteById(id: ID) = repository.findOrThrowWithId(id) { ResourceNotFoundException }
        .let(repository::deleteById)

}
