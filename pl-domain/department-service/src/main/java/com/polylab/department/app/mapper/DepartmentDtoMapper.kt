package com.polylab.department.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.department.app.dto.DepartmentDto
import com.polylab.department.persistence.model.Department

@Mapper
object DepartmentDtoMapper : MirrorMapper<DepartmentDto, Department> by snapMirrorMap()
