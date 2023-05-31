package com.jxareas.jxelerate.domain.mapper;

import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;

import java.util.List;

/**
 * The contract representing a two-way mapper that maps objects of type S to type D and vice versa.
 *
 * @author Jon Areas
 * @version 1.3
 * @param <S> The source type.
 * @param <D> The destination type.
 * @see Adapter
 * @see ForwardMapper
 * @since 1.0
 */
public interface MirrorMapper<S, D>  {
    /**
     * Maps the source object to the destination object.
     *
     * @param source The source object.
     * @return The mapped destination object.
     */
    D mapTo(@NotNull S source);

    /**
     * Maps the destination object to the source object.
     *
     * @param destination The destination object.
     * @return The mapped source object.
     */
    S mapFrom(@NotNull D destination);

    /**
     * Maps a list of source objects to a list of destination objects.
     *
     * @param sources The list of source objects.
     * @return The list of mapped destination objects.
     */
    default List<D> mapAllTo(@NotNull List<S> sources) {
        return sources.stream()
            .map(this::mapTo)
            .toList();
    }

    /**
     * Maps a list of destination objects to a list of source objects.
     *
     * @param destinations The list of destination objects.
     * @return The list of mapped source objects.
     */
    default List<S> mapAllFrom(@NotNull List<D> destinations) {
        return destinations.stream()
            .map(this::mapFrom)
            .toList();
    }

    /**
     * Adapter for custom mappers that provides a foundation for implementing the {@link MirrorMapper} interface.
     * It encapsulates common functionality and serves as a starting point for creating custom bidirectional mapper
     * implementations by using an instance of `ModelMapper`.
     *
     * @author Jon Areas
     * @version 1.3
     * @param <S> The source type.
     * @param <D> The destination type.
     * @see MirrorMapper
     * @since 1.0
     */
    abstract class Adapter<S, D> implements MirrorMapper<S, D> {

        /**
         * The `ModelMapper` instance used for mapping.
         */
        protected final ModelMapper mapper;

        /**
         * The source class used for mapping.
         */
        protected final Class<S> sourceClass;

        /**
         * The destination class used for mapping.
         */
        protected final Class<D> destinationClass;

        /**
         * Constructs a new Adapter instance with the specified ModelMapper, source class, and destination class.
         *
         * @param mapper           The ModelMapper instance used for mapping.
         * @param sourceClass      The source class used for mapping.
         * @param destinationClass The destination class used for mapping.
         */
        public Adapter(ModelMapper mapper, Class<S> sourceClass, Class<D> destinationClass) {
            this.mapper = mapper;
            this.sourceClass = sourceClass;
            this.destinationClass = destinationClass;
        }
    }


}
