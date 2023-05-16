package com.jxareas.jxcore.mapper;

import java.util.List;

public interface OneWayMapper<S, D> {
    D mapTo(S source);

    default List<D> mapAllTo(List<S> sources) {
        return sources.stream()
            .map(this::mapTo)
            .toList();
    }

}
