package com.jxareas.jxcore.core.mapper;

import java.util.List;

/**
 * The contract representing a one-way mapper that maps objects of type S to type D.
 *
 * @param <S> The source type.
 * @param <D> The destination type.
 *
 * @author Jon Areas
 * @version 1.0
 * @since 2022-06-23
 */
public interface OneWayMapper<S, D> {
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

}
