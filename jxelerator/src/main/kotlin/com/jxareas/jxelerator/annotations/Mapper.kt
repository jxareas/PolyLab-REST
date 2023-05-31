package com.jxareas.jxelerator.annotations

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

/**
 * Annotation used to mark a mapper class.
 *
 * It serves as a specialization of the `@Component` annotation, and it is used to identify classes
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
 * @author Jon Areas
 * @version 1.3
 * @param value The value attribute serves as an alias for the `value` attribute of the `@Component` annotation.
 *              It allows providing a custom component name when using the `@Mapper` annotation.
 * @see org.springframework.stereotype.Component
 * @since 1.0
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Component
@MustBeDocumented
annotation class Mapper(
    @get:AliasFor(annotation = Component::class)
    val value: String = "",
)
