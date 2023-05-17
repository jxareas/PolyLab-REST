package com.polylab.department.domain.service;

import com.jxareas.jxcore.service.CrudDomainService;
import com.polylab.department.persistence.model.Department;
import com.polylab.department.persistence.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends CrudDomainService<Department, Integer> implements DepartmentService {
    public DepartmentServiceImpl(DepartmentRepository repository) {
        super(repository);
    }
}
