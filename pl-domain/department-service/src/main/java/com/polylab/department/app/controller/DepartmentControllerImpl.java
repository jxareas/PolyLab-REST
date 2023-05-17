package com.polylab.department.app.controller;

import com.jxareas.jxcore.controller.CrudController;
import com.polylab.department.app.dto.DepartmentDto;
import com.polylab.department.app.mapper.DepartmentDtoMapper;
import com.polylab.department.domain.service.DepartmentService;
import com.polylab.department.persistence.model.Department;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("departments")
@Tag(name = "Departments", description = "Registered departments.")
public class DepartmentControllerImpl extends CrudController<DepartmentDto, Department, Integer> implements DepartmentController {
    public DepartmentControllerImpl(DepartmentService domainService, DepartmentDtoMapper mapper) {
        super(domainService, mapper);
    }
}
