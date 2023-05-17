package com.polylab.gender.common.configuration;

import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.polylab.gender.app.dto.GenderDto;
import com.polylab.gender.persistence.model.Gender;
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

    @Bean
    public TwoWayMapper<GenderDto, Gender> genderMapper(ModelMapper mapper) {
        return new TwoWayMapper<>() {
            @Override
            public Gender mapTo(GenderDto source) {
                return mapper.map(source, Gender.class);
            }

            @Override
            public GenderDto mapFrom(Gender destination) {
                return mapper.map(destination, GenderDto.class);
            }
        };
    }
}
