package com.polylab.department.domain.service

import com.jxareas.jxelerate.domain.service.PersistentService
import com.polylab.department.persistence.model.Department
import com.polylab.department.persistence.repository.DepartmentRepository
import org.springframework.stereotype.Service

@Service
class DepartmentServiceImpl(repository: DepartmentRepository) :
    PersistentService<Department, Int>(repository), DepartmentService
