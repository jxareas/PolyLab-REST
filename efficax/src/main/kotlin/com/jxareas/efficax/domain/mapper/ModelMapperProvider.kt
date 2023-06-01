package com.jxareas.efficax.domain.mapper

import org.modelmapper.ModelMapper

/**
 * Singleton object representing the default instance of a [ModelMapper].
 *
 * The [ModelMapperProvider] object provides a lazily initialized instance of the [ModelMapper] class,
 * which can be used as a default mapper throughout the application.
 *
 * @author Jon Areas
 * @version 1.3
 * @see org.modelmapper.ModelMapper
 * @since 1.0
 */
object ModelMapperProvider {
    /**
     * Lazily initialized instance of the `ModelMapper` class.
     */
    val INSTANCE: ModelMapper by lazy { ModelMapper() }
}
