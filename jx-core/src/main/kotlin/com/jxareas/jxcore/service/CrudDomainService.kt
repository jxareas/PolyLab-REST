package com.jxareas.jxcore.service

import com.jxareas.jxcore.exception.ModelNotFoundException.ResourceNotFoundException
import com.jxareas.jxcore.repository.DefaultRepository

abstract class CrudDomainService<T : Any, ID : Any>(private val repository: DefaultRepository<T, ID>) :
    DomainService<T, ID> {
    override fun save(entity: T): T = repository.save(entity)

    override fun update(entity: T, id: ID): T  {
        val updatedEntity = repository.findById(id)
        if(updatedEntity.isPresent) {
            return repository.save(entity)
        } else throw ResourceNotFoundException
    }

    override fun getAll(): List<T> = repository.findAll()

    override fun getById(id: ID): T =
        repository.findById(id).orElseThrow { ResourceNotFoundException }

    override fun deleteById(id: ID) {
        val entity = repository.findById(id).orElseThrow { ResourceNotFoundException }
        repository.delete(entity)
    }

}
