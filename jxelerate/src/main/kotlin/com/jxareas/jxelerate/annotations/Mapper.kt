package com.jxareas.jxelerate.annotations

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

/**
 * Annotation used to mark a mapper class.
 * It serves as a specialization of the `@Component` annotation and is used to identify classes
 * that perform mapping between different types.
 *
 * Usage:
 *
 * ```
 * @Mapper
 * class DtoMapper(private val mapper: ModelMapper) : MirrorMapper<Dto, Entity> {
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
 *
 * @param value The value attribute serves as an alias for the `value` attribute of the `@Component` annotation.
 *              It allows providing a custom component name when using the `@Mapper` annotation.
 *
 * @author Jon Areas
 * @since 1.0
 * @version 1.3
 *
 * @see org.springframework.stereotype.Component
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Component
@MustBeDocumented
annotation class Mapper(
    @get:AliasFor(annotation = Component::class)
    val value: String = "",
)
