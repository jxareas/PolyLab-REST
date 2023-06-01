package com.polylab.department.app.controller

import com.jxareas.efficax.annotations.ApiController
import com.jxareas.efficax.app.controller.HyperController
import com.polylab.department.app.dto.DepartmentDto
import com.polylab.department.app.mapper.DepartmentDtoMapper
import com.polylab.department.domain.service.DepartmentService
import com.polylab.department.persistence.model.Department

@ApiController("v1/departments", tagName = "Departments", tagDescription = "Endpoints for managing departments.")
class DepartmentController(service: DepartmentService, mapper: DepartmentDtoMapper) :
    HyperController<DepartmentDto, Department, Int>(service, mapper)
