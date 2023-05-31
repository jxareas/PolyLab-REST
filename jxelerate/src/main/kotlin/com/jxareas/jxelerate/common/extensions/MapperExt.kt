package com.jxareas.jxelerate.common.extensions

import com.jxareas.jxelerate.domain.mapper.ForwardMapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.domain.mapper.ModelMapperProvider
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
 * @author Jon Areas
 * @since 1.3
 * @version 1.3
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
 * @author Jon Areas
 * @since 1.3
 * @version 1.3
 *
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.jxelerate.common.extensions.transform
 */
inline infix fun <reified T : Any> ModelMapper.over(source: Any): T = transform(source)

/**
 * Creates a singleton [MirrorMapper] instance based on the given [ModelMapper].
 *
 * @param mapper The [ModelMapper] instance to be used for mapping.
 * @return A [MirrorMapper] instance for mapping between the source [S] and destination [D] types.
 *
 * @author Jon Areas
 * @since 1.3
 * @version 1.3
 *
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.jxelerate.domain.mapper.ModelMapperProvider
 * @see com.jxareas.jxelerate.domain.mapper.MirrorMapper.Adapter
 * @see com.jxareas.jxelerate.domain.mapper.MirrorMapper
 * @see com.jxareas.jxelerate.common.extensions.over
 * @see com.jxareas.jxelerate.common.extensions.forwardMap
 */
inline fun <reified S : Any, reified D : Any> mirrorMap(mapper: ModelMapper):
        MirrorMapper<S, D> = object : MirrorMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper over source
    override fun mapFrom(destination: D): S = mapper over destination
}

/**
 * Creates a singleton [MirrorMapper] instance based on the default [ModelMapper] provided by [ModelMapperProvider].
 * This function allows mapping between the source type [S] and the destination type [D].
 *
 * @return A [MirrorMapper] instance for mapping between the source [S] and destination [D] types.
 *
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.jxelerate.domain.mapper.ModelMapperProvider
 * @see com.jxareas.jxelerate.domain.mapper.MirrorMapper.Adapter
 * @see com.jxareas.jxelerate.domain.mapper.MirrorMapper
 * @see com.jxareas.jxelerate.common.extensions.over
 * @see com.jxareas.jxelerate.common.extensions.forwardMap
 */
inline fun <reified S : Any, reified D : Any> mirrorMap():
        MirrorMapper<S, D> = mirrorMap(ModelMapperProvider.INSTANCE)

/**
 * Creates a [ForwardMapper] instance with the provided ModelMapper and type information.
 *
 * @param <S>     The source type.
 * @param <D>     The destination type.
 * @param mapper  The ModelMapper instance used for mapping.
 * @return        The created ForwardMapper instance.
 *
 * @author Jon Areas
 * @since 1.3
 * @version 1.3
 *
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.jxelerate.domain.mapper.ModelMapperProvider
 * @see com.jxareas.jxelerate.domain.mapper.ForwardMapper.Adapter
 * @see com.jxareas.jxelerate.domain.mapper.ForwardMapper
 * @see com.jxareas.jxelerate.common.extensions.over
 * @see com.jxareas.jxelerate.common.extensions.mirrorMap
 */
inline fun <reified S : Any, reified D : Any> forwardMap(mapper: ModelMapper):
        ForwardMapper<S, D> = object : ForwardMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper over source
}

/**
 * Creates a [ForwardMapper] instance with the provided default [ModelMapper] from [ModelMapperProvider]
 * and the type information of the source type [S] and destination type [D].
 *
 * @return The created [ForwardMapper] instance.
 *
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.jxelerate.domain.mapper.ModelMapperProvider
 * @see com.jxareas.jxelerate.domain.mapper.ForwardMapper.Adapter
 * @see com.jxareas.jxelerate.domain.mapper.ForwardMapper
 * @see com.jxareas.jxelerate.common.extensions.over
 * @see com.jxareas.jxelerate.common.extensions.mirrorMap
 */
inline fun <reified S : Any, reified D : Any> forwardMap():
        ForwardMapper<S, D> = forwardMap(ModelMapperProvider.INSTANCE)
