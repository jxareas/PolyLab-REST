package com.polylab.doctors.app.mapper;

import com.jxareas.jxcore.core.mapper.TwoWayMapper;
import com.polylab.doctors.app.dto.DoctorDto;
import com.polylab.doctors.persistence.model.Doctor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DoctorDtoMapper implements TwoWayMapper<DoctorDto, Doctor> {

    private final ModelMapper mapper;

    @Override
    public Doctor mapTo(DoctorDto source) {
        return mapper.map(source, Doctor.class);
    }

    @Override
    public DoctorDto mapFrom(Doctor destination) {
        return mapper.map(destination, DoctorDto.class);
    }
}
