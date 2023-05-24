package com.polylab.department.app.mapper;

import com.jxareas.jxcore.common.mapper.TwoWayMapper;
import com.polylab.department.app.dto.DepartmentDto;
import com.polylab.department.persistence.model.Department;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepartmentDtoMapper implements TwoWayMapper<DepartmentDto, Department> {
    private final ModelMapper mapper;

    @Override
    public Department mapTo(@NotNull DepartmentDto source) {
        return mapper.map(source, Department.class);
    }

    @Override
    public DepartmentDto mapFrom(@NotNull Department destination) {
        return mapper.map(destination, DepartmentDto.class);
    }
}
