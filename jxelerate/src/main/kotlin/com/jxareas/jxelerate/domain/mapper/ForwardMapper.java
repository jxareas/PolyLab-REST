package com.jxareas.jxelerate.domain.mapper;

import org.modelmapper.ModelMapper;

import java.util.List;

/**
 * The contract representing a one-way mapper that maps objects of type S to type D.
 *
 * @param <S> The source type.
 * @param <D> The destination type.
 *
 * @author Jon Areas
 * @since 1.0
 * @version 1.3
 *
 * @see com.jxareas.jxelerate.domain.mapper.MirrorMapper
 */
@FunctionalInterface
public interface ForwardMapper<S, D> {
    /**
     * Maps the source object to the destination object.
     *
     * @param source The source object.
     * @return The mapped destination object.
     */
    D mapTo(S source);


    /**
     * Maps a list of source objects to a list of destination objects.
     *
     * @param sources The list of source objects.
     * @return The list of mapped destination objects.
     */
    default List<D> mapAllTo(List<S> sources) {
        return sources.stream()
            .map(this::mapTo)
            .toList();
    }

    /**
     * Adapter for custom mappers that provides a foundation for implementing the {@link ForwardMapper} interface.
     * It encapsulates common functionality and serves as a starting point for creating custom one-way mapper
     * implementations with `ModelMapper`.
     *
     * @param <S> The source type.
     * @param <D> The destination type.
     *
     * @author Jon Areas
     * @since 1.0
     * @version 1.3
     */
    abstract class Adapter<S, D> implements ForwardMapper<S, D> {

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
