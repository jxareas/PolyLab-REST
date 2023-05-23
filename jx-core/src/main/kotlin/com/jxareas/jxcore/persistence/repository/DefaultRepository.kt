package com.jxareas.jxcore.persistence.repository

import com.jxareas.jxcore.domain.model.ImmutablyIdentifiable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.NoRepositoryBean

/**
 * The contract representing a default repository that extends JpaRepository.
 *
 * @param <T>  The entity type.
 * @param <ID> The identifier type.
 */
@NoRepositoryBean
interface DefaultRepository<T : ImmutablyIdentifiable<ID>, ID> :
    JpaRepository<T, ID>, JpaSpecificationExecutor<T>


