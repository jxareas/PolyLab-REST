package com.jxareas.efficax.common.extensions

import com.jxareas.efficax.domain.mapper.ForwardMapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.domain.mapper.ModelMapperProvider
import com.jxareas.efficax.domain.model.Identifiable
import com.jxareas.efficax.domain.model.MutableIdentifiable
import org.modelmapper.ModelMapper

/**
 * Maps the given [source] object to an instance of type [T].
 *
 * Usage:
 *
 * ```
 * @Mapper
 * class DtoMapper(private val mapper: ModelMapper) : ForwardMapper<Dto, Entity> {
 *     override fun mapTo(source: Dto): Entity = mapper.transform(source)
 * }
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @param source The source object to be mapped.
 * @return The mapped object of type [T].
 * @see org.modelmapper.ModelMapper
 * @since 1.3
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
 *     override fun mapTo(source: Dto): Entity = mapper on source
 * }
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @param source The source object to be mapped.
 * @return The mapped object of type [T].
 * @throws IllegalArgumentException if [T] is not a valid type.
 * @see com.jxareas.efficax.common.extensions.transform
 * @see org.modelmapper.ModelMapper
 * @since 1.3
 */
inline infix fun <reified T : Any> ModelMapper.on(source: Any): T = transform(source)

/**
 * Creates a singleton [MirrorMapper] instance based on the given [ModelMapper].
 *
 *
 * @author Jon Areas
 * @version 1.3
 * @param mapper The [ModelMapper] instance to be used for mapping.
 * @return A [MirrorMapper] instance for mapping between the source [S] and destination [D] types.
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.efficax.domain.mapper.ModelMapperProvider
 * @see com.jxareas.efficax.domain.mapper.MirrorMapper.Adapter
 * @see com.jxareas.efficax.domain.mapper.MirrorMapper
 * @see com.jxareas.efficax.common.extensions.on
 * @see com.jxareas.efficax.common.extensions.forwardMap
 * @since 1.3
 */
inline fun <reified S : Any, reified D : Any> mirrorMap(mapper: ModelMapper):
        MirrorMapper<S, D> = object : MirrorMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper on source
    override fun mapFrom(destination: D): S = mapper on destination
}

/**
 * Creates a singleton [MirrorMapper] instance based on the default [ModelMapper] provided by [ModelMapperProvider].
 * This function allows mapping between the source type [S] and the destination type [D].
 *
 * @author Jon Areas
 * @version 1.3
 * @param S The source type, which must implement the [MutableIdentifiable] interface.
 * @param D The destination type, which must implement the [Identifiable] interface.
 * @param ID The type of the identifier used by both the source and destination types.
 * @return A [MirrorMapper] instance for mapping between the source [S] and destination [D] types.
 * @see MirrorMapper
 * @see ModelMapperProvider
 * @see MutableIdentifiable
 * @see Identifiable
 */
inline fun <reified S, reified D,  ID> mirrorMap(): MirrorMapper<S, D>
    where S : MutableIdentifiable<ID>,  D : Identifiable<ID> = mirrorMap(ModelMapperProvider.INSTANCE)

/**
 * Creates a [ForwardMapper] instance with the provided ModelMapper and type information.
 *
 * @author Jon Areas
 * @version 1.3
 * @param S     The source type.
 * @param D     The destination type.
 * @param mapper  The ModelMapper instance used for mapping.
 * @return        The created ForwardMapper instance.
 * @see org.modelmapper.ModelMapper
 * @see com.jxareas.efficax.domain.mapper.ModelMapperProvider
 * @see com.jxareas.efficax.domain.mapper.ForwardMapper.Adapter
 * @see com.jxareas.efficax.domain.mapper.ForwardMapper
 * @see com.jxareas.efficax.common.extensions.on
 * @see com.jxareas.efficax.common.extensions.mirrorMap
 * @since 1.3
 */
inline fun <reified S : Any, reified D : Any> forwardMap(mapper: ModelMapper):
        ForwardMapper<S, D> = object : ForwardMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper on source
}

/**
 * Creates a [ForwardMapper] instance with the provided default [ModelMapper] from [ModelMapperProvider]
 * and the type information of the source type [S] and destination type [D].
 *
 * @author Jon Areas
 * @version 1.3
 * @param S The source type, which must implement the [MutableIdentifiable] interface.
 * @param D The destination type, which must implement the [Identifiable] interface.
 * @param ID The type of the identifier used by both the source and destination types.
 * @return The created [ForwardMapper] instance.
 * @see ForwardMapper
 * @see ModelMapperProvider
 * @see MutableIdentifiable
 * @see Identifiable
 */
inline fun <reified S, reified D, ID> forwardMap(): ForwardMapper<S, D>
   where S : MutableIdentifiable<ID>, D : Identifiable<ID> = forwardMap(ModelMapperProvider.INSTANCE)
