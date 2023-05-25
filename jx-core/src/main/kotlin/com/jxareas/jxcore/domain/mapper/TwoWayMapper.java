package com.jxareas.jxcore.domain.mapper;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * The contract representing a two-way mapper that maps objects of type S to type D and vice versa.
 *
 * @param <S> The source type.
 * @param <D> The destination type.
 *
 * @author Jon Areas
 * @version 1.2
 * @since 2022-06-11
 */
public interface TwoWayMapper<S, D> {
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
}
