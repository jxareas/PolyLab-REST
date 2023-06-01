package com.polylab.department.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.extensions.mirrorMap
import com.polylab.department.app.dto.DepartmentDto
import com.polylab.department.persistence.model.Department

@Mapper
object DepartmentDtoMapper : MirrorMapper<DepartmentDto, Department> by mirrorMap()
