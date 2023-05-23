package com.jxareas.jxcore.persistence.repository

import com.jxareas.jxcore.domain.model.WithId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

/**
 * The contract representing a default repository that extends JpaRepository.
 *
 * @param <T>  The entity type.
 * @param <ID> The identifier type.
 */
@NoRepositoryBean
interface DefaultRepository<T : WithId<ID>, ID : Any> : JpaRepository<T, ID> {

}


