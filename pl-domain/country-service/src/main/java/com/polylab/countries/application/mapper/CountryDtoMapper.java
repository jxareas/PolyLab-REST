package com.polylab.countries.application.mapper;

import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.polylab.countries.application.dto.CountryDto;
import com.polylab.countries.persistence.model.Country;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CountryDtoMapper implements TwoWayMapper<CountryDto, Country> {

    private final ModelMapper mapper;


    @Override
    public Country mapTo(CountryDto source) {
        return mapper.map(source, Country.class);
    }

    @Override
    public CountryDto mapFrom(Country destination) {
        return mapper.map(destination, CountryDto.class);
    }
}
