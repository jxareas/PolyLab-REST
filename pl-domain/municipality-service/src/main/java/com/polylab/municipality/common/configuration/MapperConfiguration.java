package com.polylab.municipality.common.configuration;

import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.polylab.municipality.app.dto.MunicipalityDto;
import com.polylab.municipality.persistence.model.Municipality;
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
    public TwoWayMapper<MunicipalityDto, Municipality> municipalityMapper(ModelMapper mapper) {
        return new TwoWayMapper<>() {
            @Override
            public Municipality mapTo(MunicipalityDto source) {
                return mapper.map(source, Municipality.class);
            }

            @Override
            public MunicipalityDto mapFrom(Municipality destination) {
                return mapper.map(destination, MunicipalityDto.class);
            }
        };
    }

}
