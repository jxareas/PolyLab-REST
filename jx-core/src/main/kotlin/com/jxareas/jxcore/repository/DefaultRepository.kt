package com.jxareas.jxcore.repository

import com.jxareas.jxcore.exception.ModelNotFoundException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface DefaultRepository<T : Any, ID : Any> : JpaRepository<T, ID> {

    @Throws(ModelNotFoundException::class)
    fun findByIdOrThrow(id: ID, exceptionProducer: () -> Exception): T = findById(id).orElseThrow(exceptionProducer)

    @Throws(ModelNotFoundException::class)
    fun findOrThrowWithId(id: ID, exceptionProducer: () -> Exception): ID = findByIdOrThrow(id, exceptionProducer)
        .let { id }
}
