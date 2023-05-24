package com.jxareas.jxcore.configuration.mapper

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary


/**
 * Basic configuration class for Mappers.
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
    fun modelMapper(): ModelMapper = ModelMapper()
}

