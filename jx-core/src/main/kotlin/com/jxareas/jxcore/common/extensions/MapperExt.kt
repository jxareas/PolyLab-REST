package com.jxareas.jxcore.common.extensions

import com.jxareas.jxcore.domain.mapper.ForwardMapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.domain.mapper.ModelMapperProvider
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
inline fun <reified T : Any> ModelMapper.transform(source: Any): T =
    map(source, T::class.java)


/**
 * Maps the given [source] object to an instance of type [T] using the [ModelMapper] and the [transform] function.
 *
 * Usage:
 *
 * ```
 * @Mapper
 * class DtoMapper(private val mapper: ModelMapper) : OneWayMapper<Dto, Entity> {
 *     override fun mapTo(source: Dto): Entity = mapper over source
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
 * @see com.jxareas.jxcore.common.extensions.transform
 */
inline infix fun <reified T : Any> ModelMapper.over(source: Any): T = transform(source)

/**
 * Creates a [MirrorMapper] instance based on the given [ModelMapper].
 *
 * @param mapper The [ModelMapper] instance to be used for mapping.
 * @return A [MirrorMapper] instance for mapping between the source [S] and destination [D] types.
 *
 * @since 2023-05-13
 * @version 1.0
 * @author Jon Areas
 *
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.jxcore.domain.mapper.ModelMapperProvider
 * @see com.jxareas.jxcore.domain.mapper.MirrorMapper.Adapter
 * @see com.jxareas.jxcore.domain.mapper.MirrorMapper
 * @see com.jxareas.jxcore.common.extensions.over
 * @see com.jxareas.jxcore.common.extensions.forwardMapper
 */
inline fun <reified S : Any, reified D : Any> mirrorMapper(mapper: ModelMapper = ModelMapperProvider.INSTANCE):
        MirrorMapper<S, D> = object : MirrorMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper over source
    override fun mapFrom(destination: D): S = mapper over destination
}

/**
 * Creates a [ForwardMapper] instance with the provided ModelMapper and type information.
 *
 * @param <S>     The source type.
 * @param <D>     The destination type.
 * @param mapper  The ModelMapper instance used for mapping.
 * @return        The created ForwardMapper instance.
 *
 * @since 2023-05-13
 * @version 1.0
 * @author Jon Areas
 *
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.jxcore.domain.mapper.ModelMapperProvider
 * @see com.jxareas.jxcore.domain.mapper.ForwardMapper.Adapter
 * @see com.jxareas.jxcore.domain.mapper.ForwardMapper
 * @see com.jxareas.jxcore.common.extensions.over
 * @see com.jxareas.jxcore.common.extensions.mirrorMapper
 */
inline fun <reified S : Any, reified D : Any> forwardMapper(mapper: ModelMapper = ModelMapperProvider.INSTANCE):
        ForwardMapper<S, D> = object : ForwardMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper over source
}
