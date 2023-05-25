package com.polylab.department.persistence.repository

import com.jxareas.jxcore.persistence.repository.DefaultRepository
import com.polylab.department.persistence.model.Department

interface DepartmentRepository : DefaultRepository<Department, Int>
