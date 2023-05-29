package com.jxareas.jxcore.repository

import com.jxareas.jxcore.domain.model.Identifiable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

/**
 * Common interface for default repositories.
 *
 * The [DefaultRepository] interface extends [JpaRepository] and [JpaSpecificationExecutor] and is intended to be used
 * as a base interface for repositories that handle entities of type [T] with identifiers of type [ID].
 *
 * @param T The entity type handled by the repository.
 * @param ID The type of the entity's identifier.
 *
 * @author Jon Areas
 * @version 1.1
 * @since 2022-06-11
 */
@NoRepositoryBean
interface DefaultRepository<T : Identifiable<ID>, ID : Serializable> :
    JpaRepository<T, ID>, JpaSpecificationExecutor<T>


