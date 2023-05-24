package com.polylab.patients.app.mapper;

import com.jxareas.jxcore.common.mapper.TwoWayMapper;
import com.polylab.patients.app.dto.PatientDto;
import com.polylab.patients.persistence.model.Patient;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PatientDtoMapper implements TwoWayMapper<PatientDto, Patient> {

    private final ModelMapper mapper;

    @Override
    public Patient mapTo(@NotNull PatientDto source) {
        return mapper.map(source, Patient.class);
    }

    @Override
    public PatientDto mapFrom(@NotNull Patient destination) {
        return mapper.map(destination, PatientDto.class);
    }
}
