package com.jxareas.jxcore.annotations

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

/**
 * Annotation used to mark a mapper class.
 * It serves as a specialization of the `@Component` annotation and is used to identify classes
 * that perform mapping between different types.
 *
 * This annotation is part of the `jx-core` library, which provides common utilities for mapping, persistence
 * and other functionalities.
 *
 * Usage:
 *
 * ```
 * @Mapper
 * class DtoMapper(private val mapper: ModelMapper) : TwoWayMapper<Dto, Entity> {
 *     override fun mapTo(source: Dto): Entity {
 *      // mapping implementation details
 *     }
 *     override fun mapFrom(destination: Entity): Dto {
 *      // mapping implementation details
 *     }
 * }
 * ```
 *
 * The `@Mapper` annotation allows the class to be recognized as a mapper component within the `jx-core` library.
 * It is meant to  be used in conjunction with dependency injection frameworks like Spring to automatically
 * detect and manage mapper instances.
 *
 * @see org.springframework.stereotype.Component
 *
 * @param value The value attribute serves as an alias for the `value` attribute of the `@Component` annotation.
 *              It allows providing a custom component name when using the `@Mapper` annotation.
 *
 * @since 2022-04-11
 * @version 1.1
 * @author Jon Areas
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Component
@MustBeDocumented
annotation class Mapper(
    @get:AliasFor(annotation = Component::class)
    val value: String = "",
)
