package com.jxareas.jxcore.mapper;

import java.util.List;

public interface TwoWayMapper<S, D> {
    D mapTo(S source);

    S mapFrom(D destination);

    default List<D> mapAllTo(List<S> sources) {
        return sources.stream()
            .map(this::mapTo)
            .toList();
    }

    default List<S> mapAllFrom(List<D> destinations) {
        return destinations.stream()
            .map(this::mapFrom)
            .toList();
    }
}
