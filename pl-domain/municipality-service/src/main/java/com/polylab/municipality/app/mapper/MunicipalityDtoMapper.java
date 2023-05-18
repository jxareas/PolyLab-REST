package com.polylab.municipality.app.mapper;

import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.polylab.municipality.app.dto.MunicipalityDto;
import com.polylab.municipality.persistence.model.Municipality;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MunicipalityDtoMapper implements TwoWayMapper<MunicipalityDto, Municipality> {

    private final ModelMapper mapper;
    @Override
    public Municipality mapTo(MunicipalityDto source) {
        return mapper.map(source, Municipality.class);
    }

    @Override
    public MunicipalityDto mapFrom(Municipality destination) {
        return mapper.map(destination, MunicipalityDto.class);
    }
}
