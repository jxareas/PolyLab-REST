package com.polylab.doctors.domain.service

import com.jxareas.jxelerator.domain.service.DomainService
import com.polylab.doctors.persistence.model.Doctor

interface DoctorService : DomainService<Doctor, Int>
