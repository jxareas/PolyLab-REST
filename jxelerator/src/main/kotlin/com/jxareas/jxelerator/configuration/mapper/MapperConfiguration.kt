package com.jxareas.jxelerator.configuration.mapper

import com.jxareas.jxelerator.domain.mapper.ModelMapperProvider
import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary


/**
 * Basic configuration class for Mappers.
 *
 * @author Jon Areas
 * @version 1.3
 * @see ModelMapper
 * @see ModelMapperProvider
 * @since 1.0
 */
@Configuration
class MapperConfiguration {
    /**
     * Creates a simple `ModelMapper` bean.
     *
     * @return The `ModelMapper` bean instance.
     */
    @Primary
    @Bean
    fun modelMapper(): ModelMapper = ModelMapperProvider.INSTANCE
}

