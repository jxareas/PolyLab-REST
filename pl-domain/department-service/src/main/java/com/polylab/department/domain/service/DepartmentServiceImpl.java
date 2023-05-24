package com.polylab.department.domain.service;

import com.jxareas.jxcore.domain.service.PersistentService;
import com.polylab.department.persistence.model.Department;
import com.polylab.department.persistence.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends PersistentService<Department, Integer> implements DepartmentService {
    public DepartmentServiceImpl(DepartmentRepository repository) {
        super(repository);
    }
}
