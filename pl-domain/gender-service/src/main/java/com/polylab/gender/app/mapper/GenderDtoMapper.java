package com.polylab.gender.app.mapper;

import com.jxareas.jxcore.common.mapper.TwoWayMapper;
import com.polylab.gender.app.dto.GenderDto;
import com.polylab.gender.persistence.model.Gender;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GenderDtoMapper implements TwoWayMapper<GenderDto, Gender> {
    private final ModelMapper mapper;


    @Override
    public Gender mapTo(@NotNull GenderDto source) {
        return mapper.map(source, Gender.class);
    }

    @Override
    public GenderDto mapFrom(@NotNull Gender destination) {
        return mapper.map(destination, GenderDto.class);
    }
}
