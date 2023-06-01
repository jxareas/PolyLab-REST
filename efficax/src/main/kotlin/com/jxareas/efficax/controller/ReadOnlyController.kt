package com.jxareas.efficax.controller

import com.jxareas.efficax.helpers.ResponseEntityProvider
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.domain.model.MutableIdentifiable
import com.jxareas.efficax.domain.service.DomainService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.http.ResponseEntity
import java.io.Serializable

/**
 * Abstract base class for read-only controllers in a REST API.
 *
 * @author Jon Areas
 * @version 1.3
 * @param DTO The DTO type for the controller.
 * @param T The entity type for the controller.
 * @param ID The ID type for the entity.
 * @property domainService The domain service used for retrieving data.
 * @property mapper The mapper used for mapping entities to DTOs.
 * @see ReadableController
 * @since 1.0
 */
abstract class ReadOnlyController<DTO, T : Any, ID : Serializable>(
    private val domainService: DomainService<T, ID>,
    private val mapper: MirrorMapper<DTO, T>,
) : ReadableController<DTO, ID> {
    companion object {
        /**
         * Factory method for creating instances of [ReadOnlyController].
         *
         * @param domainService The domain service used for retrieving data.
         * @param mapper The mapper used for mapping entities to DTOs.
         * @return An instance of [ReadOnlyController].
         */
        internal fun <DTO : MutableIdentifiable<ID>, T : Any, ID : Serializable> factory(
            domainService: DomainService<T, ID>,
            mapper: MirrorMapper<DTO, T>,
        ): ReadOnlyController<DTO, T, ID> = object : ReadOnlyController<DTO, T, ID>(domainService, mapper) {}
    }

    override fun getAll(): ResponseEntity<List<DTO>> =
        domainService.getAll()
            .run(mapper::mapAllFrom)
            .let(ResponseEntityProvider::ok)

    override fun getAllPaginated(page: Int, size: Int, order: String?, asc: Boolean?): ResponseEntity<Page<DTO>> {
        var pageRequest = PageRequest.of(page, size)
        if (order != null && asc != null) {
            pageRequest = PageRequest.of(page, size, if (asc) Sort.Direction.ASC else Sort.Direction.DESC, order)
        }
        val dtoList = domainService.getByPage(pageRequest).map(mapper::mapFrom)
        return ResponseEntity.ok(dtoList)
    }
}
