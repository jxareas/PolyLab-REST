package com.polylab.municipality.app.mapper;

import com.jxareas.jxcore.common.mapper.TwoWayMapper;
import com.polylab.municipality.app.dto.MunicipalityDto;
import com.polylab.municipality.persistence.model.Municipality;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MunicipalityDtoMapper implements TwoWayMapper<MunicipalityDto, Municipality> {

    private final ModelMapper mapper;
    @Override
    public Municipality mapTo(@NotNull MunicipalityDto source) {
        return mapper.map(source, Municipality.class);
    }

    @Override
    public MunicipalityDto mapFrom(@NotNull Municipality destination) {
        return mapper.map(destination, MunicipalityDto.class);
    }
}
