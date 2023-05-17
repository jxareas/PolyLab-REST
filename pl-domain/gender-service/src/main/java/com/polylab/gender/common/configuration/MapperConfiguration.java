package com.polylab.gender.common.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MapperConfiguration {

    @Primary
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
