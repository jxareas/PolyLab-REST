package com.jxareas.jxcore.domain.mapper

import org.modelmapper.ModelMapper

/**
 * Singleton object representing the default instance of the ModelMapper.
 *
 * The [ModelMapperProvider] object provides a lazily initialized instance of the ModelMapper class,
 * which can be used as a default mapper throughout the application.
 *
 * @since 2023-05-13
 * @version 1.0
 * @author Jon Areas
 *
 * @see org.modelmapper.ModelMapper
 */
object ModelMapperProvider {
    /**
     * Lazily initialized instance of the `ModelMapper` class.
     */
    val INSTANCE: ModelMapper by lazy { ModelMapper() }
}
