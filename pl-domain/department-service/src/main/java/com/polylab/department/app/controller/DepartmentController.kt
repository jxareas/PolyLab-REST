package com.polylab.department.app.controller

import com.jxareas.jxcore.app.controller.AppController
import com.jxareas.jxcore.annotations.ApiController
import com.polylab.department.app.dto.DepartmentDto
import com.polylab.department.app.mapper.DepartmentDtoMapper
import com.polylab.department.domain.service.DepartmentService
import com.polylab.department.persistence.model.Department

@ApiController(path = ["v1/departments"], tagName = "Departments", tagDescription = "Endpoints for managing departments.")
class DepartmentController(service: DepartmentService, mapper: DepartmentDtoMapper) :
    AppController<DepartmentDto, Department, Int>(service, mapper)
