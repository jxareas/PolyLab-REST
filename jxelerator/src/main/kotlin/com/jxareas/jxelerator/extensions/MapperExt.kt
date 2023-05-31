package com.jxareas.jxelerator.extensions

import com.jxareas.jxelerator.domain.mapper.ForwardMapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.domain.mapper.ModelMapperProvider
import com.jxareas.jxelerator.domain.model.Identifiable
import com.jxareas.jxelerator.domain.model.MutableIdentifiable
import org.modelmapper.ModelMapper
import java.io.Serializable

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
 * @see ModelMapper
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
 * class DtoMapper(private val mapper: ModelMapper) : ForwardMapper<Dto, Entity> {
 *     override fun mapTo(source: Dto): Entity = mapper on source
 * }
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @param source The source object to be mapped.
 * @return The mapped object of type [T].
 * @throws IllegalArgumentException if [T] is not a valid type.
 * @see transform
 * @see ModelMapper
 * @since 1.3
 */
inline infix fun <reified T : Any> ModelMapper.on(source: Any): T = transform(source)

/**
 * Creates a singleton [MirrorMapper] instance based on the given [ModelMapper].
 *
 * Usage:
 *
 * ```
 * class UserMapper(modelMapper : ModelMapper) : MirrorMapper<UserDto, User> by mirrorMapper(modelMapper)
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @param mapper The [ModelMapper] instance to be used for mapping.
 * @return A [MirrorMapper] instance for mapping between the source [S] and destination [D] types.
 * @see org.modelmapper.ModelMapper
 * @see ModelMapperProvider
 * @see MirrorMapper.Adapter
 * @see MirrorMapper
 * @see on
 * @see snapForwardMap
 * @since 1.3
 */
inline fun <reified S : Any, reified D : Any> mirrorMapper(mapper: ModelMapper):
        MirrorMapper<S, D> = object : MirrorMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper on source
    override fun mapFrom(destination: D): S = mapper on destination
}

/**
 * Creates a singleton [MirrorMapper] instance based on the default [ModelMapper] provided by [ModelMapperProvider].
 * This function allows mapping between the source type [S] and the destination type [D] and vice-versa.
 *
 * Usage:
 *
 * ```
 * object UserMapper : MirrorMapper<UserDto, User> by snapMirrorMap()
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @param S The source type, which must implement the [MutableIdentifiable] interface.
 * @param D The destination type, which must implement the [Identifiable] interface.
 * @param ID The [Serializable] type of the identifier used by both the source and destination types.
 * @return A [MirrorMapper] instance for mapping between the source [S] and destination [D] types.
 * @throws UnsupportedOperationException if [S] is not a subtype of [MutableIdentifiable] or [D] is not a subtype of [Identifiable], or [ID] is not serializable.
 * @see MirrorMapper
 * @see ModelMapperProvider
 * @see MutableIdentifiable
 * @see Identifiable
 */
inline fun <reified S, reified D, ID> snapMirrorMap(): MirrorMapper<S, D>
        where S : MutableIdentifiable<ID>, D : Identifiable<ID>, ID : Serializable =
    mirrorMapper(ModelMapperProvider.INSTANCE)

/**
 * Creates a [ForwardMapper] instance with the provided ModelMapper and type information.
 *
 * ```
 * class UserDtoMapper(private val mapper: ModelMapper) : ForwardMapper<UserDto, User> by forwardMapper(mapper)
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @param S     The source type.
 * @param D     The destination type.
 * @param mapper  The ModelMapper instance used for mapping.
 * @return        The created ForwardMapper instance.
 * @see ModelMapper
 * @see ModelMapperProvider
 * @see ForwardMapper.Adapter
 * @see ForwardMapper
 * @see on
 * @see mirrorMapper
 * @since 1.3
 */
inline fun <reified S : Any, reified D : Any> forwardMapper(mapper: ModelMapper):
        ForwardMapper<S, D> = object : ForwardMapper.Adapter<S, D>(mapper, S::class.java, D::class.java) {
    override fun mapTo(source: S): D = mapper on source
}

/**
 * Creates a [ForwardMapper] instance with the provided default [ModelMapper] from [ModelMapperProvider]
 * and the type information of the source type [S] and destination type [D].
 *
 * Usage:
 *
 * ```
 * object UserDtoMapper : ForwardMapper<UserDto, User> by snapMapForward()
 * ```
 *
 * @author Jon Areas
 * @version 1.3
 * @param S The source type, which must implement the [MutableIdentifiable] interface.
 * @param D The destination type, which must implement the [Identifiable] interface.
 * @param ID The type of the identifier used by both the source and destination types.
 * @return The created [ForwardMapper] instance.
 * @throws UnsupportedOperationException if [S] is not a subtype of [MutableIdentifiable] or [D] is not a subtype of [Identifiable], or [ID] is not serializable.
 * @see ForwardMapper
 * @see ModelMapperProvider
 * @see MutableIdentifiable
 * @see Identifiable
 */
inline fun <reified S, reified D, ID> snapForwardMap(): ForwardMapper<S, D>
        where S : MutableIdentifiable<ID>, D : Identifiable<ID>, ID : Serializable =
    forwardMapper(ModelMapperProvider.INSTANCE)
