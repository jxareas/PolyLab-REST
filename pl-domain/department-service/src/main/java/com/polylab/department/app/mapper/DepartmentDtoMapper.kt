package com.polylab.department.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.department.app.dto.DepartmentDto
import com.polylab.department.persistence.model.Department

@Mapper
object DepartmentDtoMapper : MirrorMapper<DepartmentDto, Department> by mirrorMapper()
