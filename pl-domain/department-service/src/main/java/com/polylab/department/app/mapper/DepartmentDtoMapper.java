package com.polylab.department.app.mapper;

import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.polylab.department.app.dto.DepartmentDto;
import com.polylab.department.persistence.model.Department;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepartmentDtoMapper implements TwoWayMapper<DepartmentDto, Department> {

    private final ModelMapper mapper;

    @Override
    public Department mapTo(DepartmentDto source) {
        return mapper.map(source, Department.class);
    }

    @Override
    public DepartmentDto mapFrom(Department destination) {
        return mapper.map(destination, DepartmentDto.class);
    }
}
