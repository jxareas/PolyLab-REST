package com.jxareas.jxcore.repository

import java.util.UUID

/**
 * Extension Type-aliases for Repositories
 *
 * This file defines extension typealiases for repositories, allowing for convenient
 * shorthand when working with repositories that implement the DefaultRepository interface.
 * These typealiases specify different key types for the repositories.
 *
 * - [IntKeyedRepository] represents a repository with `Int` as the key type.
 * - [LongKeyedRepository] represents a repository with `Long` as the key type.
 * - [StringKeyedRepository] represents a repository with `String` as the key type.
 * - [UUIDKeyedRepository] represents a repository with `UUID` as the key type.
 *
 * @see DefaultRepository
 */
typealias IntKeyedRepository<T> = DefaultRepository<T, Int>

typealias LongKeyedRepository<T> = DefaultRepository<T, Long>

typealias StringKeyedRepository<T> = DefaultRepository<T, String>

typealias UUIDKeyedRepository<T> = DefaultRepository<T, UUID>
