package com.jxareas.jxcore.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface DefaultRepository<T : Any, ID : Any> : JpaRepository<T, ID>

