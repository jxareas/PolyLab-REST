package com.polylab.gender.app.mapper;

import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.polylab.gender.app.dto.GenderDto;
import com.polylab.gender.persistence.model.Gender;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GenderDtoMapper implements TwoWayMapper<GenderDto, Gender> {
    private final ModelMapper mapper;


    @Override
    public Gender mapTo(GenderDto source) {
        return mapper.map(source, Gender.class);
    }

    @Override
    public GenderDto mapFrom(Gender destination) {
        return mapper.map(destination, GenderDto.class);
    }
}
