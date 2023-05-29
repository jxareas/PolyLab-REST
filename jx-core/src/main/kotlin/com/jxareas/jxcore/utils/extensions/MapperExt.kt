package com.jxareas.jxcore.utils.extensions

import org.modelmapper.ModelMapper

/**
 * Maps the given [source] object to an instance of type [T].
 *
 * Usage:
 *
 * ```
 * @Mapper
 * class DtoMapper(private val mapper: ModelMapper) : OneWayMapper<Dto, Entity> {
 *     override fun mapTo(source: Dto): Entity = mapper.map(source)
 * }
 * ```
 *
 * @param source The source object to be mapped.
 * @return The mapped object of type [T].
 *
 * @since 2023-05-13
 * @version 1.0
 * @author Jon Areas
 *
 * @see org.modelmapper.ModelMapper
 */
inline fun <reified T : Any> ModelMapper.map(source: Any): T =
    map(source, T::class.java)

