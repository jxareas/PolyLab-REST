package com.jxareas.efficax.domain.service

import com.jxareas.efficax.common.exception.ModelNotFoundException.ResourceNotFoundException
import com.jxareas.efficax.common.extensions.ifPresentOrThrow
import com.jxareas.efficax.common.extensions.orElseThrow
import com.jxareas.efficax.domain.model.Identifiable
import com.jxareas.efficax.repository.StandardRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

/**
 * Abstract base class for domain services with support for CRUD operations.
 *
 * @author Jon Areas
 * @version 1.3
 * @param <T> The entity type.
 * @param <ID> The identifier type.
 * @param repository The repository used for data access and persistence operations.
 * @see DomainService
 * @since 1.0
 */
abstract class PersistentService<T : Identifiable<ID>, ID : Serializable>(
    private val repository: StandardRepository<T, ID>,
) : DomainService<T, ID> {

    override fun getAll(): List<T> = repository.findAll()


    override fun getAllIdentifiers(): List<ID> = getAll().map(Identifiable<ID>::id)

    override fun getByPage(pageable: Pageable): Page<T> = repository.findAll(pageable)

    override fun getById(id: ID): T = repository.findById(id).orElseThrow(ResourceNotFoundException)


    override fun save(entity: T): T = repository.save(entity)

    override fun update(entity: T, id: ID): T =
        repository.findById(id)
            .ifPresentOrThrow(entity, ResourceNotFoundException)
            .run(repository::save)

    override fun deleteById(id: ID) =
        repository.findById(id)
            .orElseThrow(ResourceNotFoundException)
            .let(repository::delete)

}
