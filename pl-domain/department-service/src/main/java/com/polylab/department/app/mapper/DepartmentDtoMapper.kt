package com.polylab.department.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.department.app.dto.DepartmentDto
import com.polylab.department.persistence.model.Department
import org.modelmapper.ModelMapper

@Mapper
class DepartmentDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<DepartmentDto, Department> {
    override fun mapTo(source: DepartmentDto): Department = mapper.map(source, Department::class.java)

    override fun mapFrom(destination: Department): DepartmentDto = mapper.map(destination, DepartmentDto::class.java)
}
