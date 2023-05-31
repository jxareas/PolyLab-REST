package com.polylab.department.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.polylab.department.app.dto.DepartmentDto
import com.polylab.department.persistence.model.Department

@Mapper
object DepartmentDtoMapper : MirrorMapper<DepartmentDto, Department> by mirrorMap()
