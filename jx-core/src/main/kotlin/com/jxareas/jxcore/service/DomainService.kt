package com.jxareas.jxcore.service

import com.jxareas.jxcore.exception.ModelNotFoundException

interface DomainService<T, ID> {
    fun save(entity: T): T

    @Throws(ModelNotFoundException::class)
    fun update(entity: T, id: ID): T

    fun getAll(): List<T>

    @Throws(ModelNotFoundException::class)
    fun getById(id: ID): T

    @Throws(ModelNotFoundException::class)
    fun deleteById(id: ID)

}
